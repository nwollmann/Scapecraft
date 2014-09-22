package scapecraft;

import java.util.HashMap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

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

			if(ExtendedPlayer.getEnergy(player) < 10000)
			{
				ExtendedPlayer.addEnergy(player, 2);
				if(ExtendedPlayer.getEnergy(player) >= 10000)
					player.addChatMessage(new ChatComponentText("Your Special Attack bar is full"));
			}

			if(ExtendedPlayer.getAgilityLevel(player) > 20) //TODO change these to levels
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 1));
			}
			else if(ExtendedPlayer.getAgilityLevel(player) > 10)
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 0));
			}
			if(ExtendedPlayer.getAgilityLevel(player) > 25)
			{
				//player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 1));
				player.capabilities.setPlayerWalkSpeed(.14F);
			}
			else if(ExtendedPlayer.getAgilityxp(player) > 15)
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

}
