package scapecraft;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.WorldEvent;

import scapecraft.entity.Drop;
import scapecraft.entity.EntityScapecraft;
import scapecraft.item.ItemArmorScapecraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ScapecraftEventHandler
{
	public static HashMap<String, Item[]> inventories = new HashMap<String, Item[]>();

	@SubscribeEvent
	public void onHurt(LivingHurtEvent event)
	{
		if(event.source.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			for(int i = 0; i <= 3; i++)
				if(player.getCurrentArmor(i) != null && player.getCurrentArmor(i).getItem() instanceof ItemArmorScapecraft)
					((ItemArmorScapecraft) player.getCurrentArmor(i).getItem()).onWearerAttack(event);
		}
	}

	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entity;

			if(Stats.getEnergy(player) < 10000)
			{
				Stats.addEnergy(player, 2);
				if(Stats.getEnergy(player) >= 10000)
					player.addChatMessage(new ChatComponentText("Your Special Attack bar is full"));
			}

			if(Stats.getAgilityLevel(player) > 20) //TODO change these to levels
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 1));
			}
			else if(Stats.getAgilityLevel(player) > 10)
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 0));
			}
			if(Stats.getAgilityLevel(player) > 25)
			{
				//player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 1));
				player.capabilities.setPlayerWalkSpeed(.14F);
			}
			else if(Stats.getAgilityxp(player) > 15)
			{
				//player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 0));
				player.capabilities.setPlayerWalkSpeed(.12F);
			}

			boolean invChanged = false;
			if(inventories.get(player.getCommandSenderName()) == null)
			{
				invChanged = true;
			}
			else
			{
				for(int i = 0; i <= 3; i++)
					if(inventories.get(player.getCommandSenderName())[i] != (player.getCurrentArmor(i) != null ? player.getCurrentArmor(i).getItem() : null))
						invChanged = true;
			}
			if(invChanged)
			{
				Item[] newInv = new Item[4];
				for(int i = 0; i < 3; i++)
					newInv[i] = player.getCurrentArmor(i) != null ? player.getCurrentArmor(i).getItem() : null;
				inventories.put(player.getCommandSenderName(), newInv);

				if(player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() instanceof ItemArmorScapecraft && ((ItemArmorScapecraft) player.getCurrentArmor(1).getItem()).isWearingFullSet(player))
				{
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(((ItemArmorScapecraft) player.getCurrentArmor(1).getItem()).getMaxHealth());
				}
				else
				{
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20D);
				}

			}
		}
	}

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event)
	{
	}

	@SubscribeEvent
	public void onWorldSave(WorldEvent.Load event)
	{
		if(event.world.provider.dimensionId != 0)
			return;

		File dataFile = event.world.getSaveHandler().getMapFileFromName("ScapecraftData");
		if(dataFile != null)
		{
			NBTTagCompound nbt = new NBTTagCompound();
			NBTTagCompound drops = new NBTTagCompound();

			//Save drops
			for (Entry<Class<? extends EntityScapecraft>, ArrayList<Drop>> dropEntry : EntityScapecraft.drops.entrySet())
			{
				NBTTagList list = new NBTTagList();
				for(Drop drop : dropEntry.getValue())
					list.appendTag(drop.toNBT());
				drops.setTag((String) EntityList.classToStringMapping.get(dropEntry.getKey()), list);

			}

			drops.setString("version", Scapecraft.version);

			nbt.setTag("drops", drops);

			try {
				CompressedStreamTools.writeCompressed(nbt, new FileOutputStream(dataFile));
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
