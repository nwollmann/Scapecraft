package scapecraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class ExtendedPlayer
{
	public final static String EXT_PROP_NAME = "ExtendedPlayer";

	public static void addXp(EntityPlayer player, int amount)
	{
		addStat(player, "combatxp", amount);
	}

	public static void addAXp(EntityPlayer player, int amount) 
	{
		addStat(player, "agilityxp", amount);
	}

	public static void addMXp(EntityPlayer player, int amount) 
	{ 
		addStat(player, "miningxp", amount);
	}

	public static void addEnergy(EntityPlayer player, int amount)
	{
		addStat(player, "energy", amount);
	}


	public static int getAgilityxp(EntityPlayer player)
	{

		return getStat(player, "agilityxp");
	}


	public static int getCombatxp(EntityPlayer player)
	{
		return getStat(player, "combatxp");
	}

	public static int getEnergy(EntityPlayer player)
	{
		return getStat(player, "energy");
	}
	public static int getMiningxp(EntityPlayer player)
	{
		return getStat(player, "miningxp");
	}

	public static int getStat(EntityPlayer player, String stat)
	{
		if(player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG) == null)
			player.getEntityData().setTag(EntityPlayer.PERSISTED_NBT_TAG, new NBTTagCompound());
		return player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger(stat);
	}

	public static void addStat(EntityPlayer player, String stat, int amount)
	{
		if(player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG) == null)
			player.getEntityData().setTag(EntityPlayer.PERSISTED_NBT_TAG, new NBTTagCompound());
		player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger(stat, player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger(stat) + amount);
	}

}
