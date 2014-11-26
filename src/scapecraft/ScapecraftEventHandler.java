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
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.WorldEvent;

import scapecraft.client.ClientProxy;
import scapecraft.economy.EconomyHandler;
import scapecraft.entity.Drop;
import scapecraft.entity.EntityScapecraft;
import scapecraft.entity.XpDropper;
import scapecraft.item.ItemArmorScapecraft;
import scapecraft.item.ItemWeapon;
import scapecraft.network.StatsPacket;
import scapecraft.util.CombatXpHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
			if(player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemWeapon)
				((ItemWeapon) player.getHeldItem().getItem()).onEntityHurt(event);
		}
	}

	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event)
	{
		if(event.entity instanceof EntityPlayer && !event.entity.worldObj.isRemote)
		{
			EntityPlayer player = (EntityPlayer) event.entity;

			if(Stats.getEnergy(player) < 100 && MinecraftServer.getServer().getEntityWorld().getTotalWorldTime() % 50 == 0)
			{
				Stats.addEnergy(player, 1);
			}

			if(Stats.getAgilityLevel(player) > 20) 
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 1));
			}
			else if(Stats.getAgilityLevel(player) > 10)
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 50, 0));
			}
			if(Stats.getAgilityLevel(player) > 25)
			{
				setMoveSpeed(player, .14F);
			}
			else if(Stats.getAgilityxp(player) > 15)
			{
				setMoveSpeed(player, .12F);
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
				double maxHealth = 20;
				Item[] newInv = new Item[4];
				for(int i = 0; i < 4; i++)
				{
					newInv[i] = player.getCurrentArmor(i) != null ? player.getCurrentArmor(i).getItem() : null;
					if(newInv[i] != null && newInv[i] instanceof ItemArmorScapecraft)
						maxHealth += ((ItemArmorScapecraft) newInv[i]).getHealthBoost(); 
				}
				inventories.put(player.getCommandSenderName(), newInv);
				player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(maxHealth);
				if(player.getHealth() > maxHealth)
					player.setHealth((float) maxHealth);
				System.out.println(maxHealth + " " + player.getHealth());

			}
		}
	}

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event)
	{
		if(event.source.getEntity() != null && event.source.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			if(event.entityLiving instanceof XpDropper)
				((XpDropper) event.entityLiving).giveXp();
			else
				Stats.addXp(player, CombatXpHelper.getAmount(event.entityLiving));
		}
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

	@SubscribeEvent
	public void onPlayerSpawn(PlayerEvent.StartTracking event)
	{
		Scapecraft.network.sendTo(new StatsPacket(event.entityPlayer), (EntityPlayerMP) event.entityPlayer);
		event.entityPlayer.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(event.entityPlayer.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue());
		event.entityPlayer.setHealth(event.entityPlayer.getHealth()); //Make sure client has the right health

		if(EconomyHandler.economy != null)
			System.out.println(EconomyHandler.economy.getBalance(event.entityPlayer.getUniqueID()));
	}

	@SubscribeEvent
	public void onPlayerChangeDimension(PlayerChangedDimensionEvent event)
	{
		double maxHealth = event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue();
		float health = event.player.getHealth();
		event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(0); //ModifiableAttributeInstance won't update unless value is changed
		event.player.setHealth(0); //DataWatcher won't update unless value is changed (Won't kill the player because it's restored immediately)
		event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(maxHealth);
		event.player.setHealth(health); //Make sure client has the right health
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onHealthRender(RenderGameOverlayEvent.Pre event)
	{
		if(event != null && (event.type == RenderGameOverlayEvent.ElementType.HEALTH))
		{
			event.setCanceled(true);
			ClientProxy.guiHealth.drawHealthBar(event.resolution);
		}
	}
	
	public void setMoveSpeed(EntityPlayer player, float speed)
	{
		if(player.capabilities.getWalkSpeed() == speed)
			return;
		NBTTagCompound capabilities = new NBTTagCompound();
		player.capabilities.writeCapabilitiesToNBT(capabilities);
		capabilities.getCompoundTag("abilities").setFloat("walkSpeed", speed);
		player.capabilities.readCapabilitiesFromNBT(capabilities);
	}
}
