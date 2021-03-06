package scapecraft;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;

import scapecraft.network.StatsPacket;

public class Stats
{
	public final static String oldStorageName = "ExtendedPlayer";

	public final static int[] oldLevels = 
	{

		0,
		10,
		30,
		60,
		100,
		150,
		180,
		224,
		248,
		276,
		302,
		336,
		370,
		408,
		452,
		498,
		600,
		720,
		850,
		950,
		1060,
		1200,
		1700,
		2300,
		3000,
		3800,
		4700,
		6100,
		7320,
		8784,
		10540,
		12648,
		15178,
		18214,
		21857,
		26228,
		31474,
		37769,
		45323,
		54388,
		65265,
		78319,
		93982,
		112779,
		135335,
		162402,
		233859,
		280631,
		336757,
		404108,
	};

	public static HashMap<String, Integer> clientStats = new HashMap<String, Integer>();

	public static int getLevelFromXp(int xp)
	{
		int level = 0;
		for(;xp >= (1000 * Math.pow(1.1, level) + 50 * level - 1000); level++);
		return level;
	}
		
	public static int getOldLevelFromXp(int xp)
	{
		int level = 0;
		for(; level < oldLevels.length && oldLevels[level] <= xp; level++);
		return level;
	}

	public static void addCombatXp(EntityPlayer player, int amount)
	{
		setStat(player, "combatLevel", getLevelFromXp(getStat(player, "combatxp") + amount));
		addStat(player, "combatxp", amount);
	}

	public static void addXp(EntityPlayer player, String stat, int amount)
	{
		setStat(player, stat + "Level", getOldLevelFromXp(getStat(player, stat + "xp") + amount));
		addStat(player, stat + "xp", amount);
	}

	public static void addEnergy(EntityPlayer player, int amount)
	{
		addStat(player, "energy", amount);
	}

	public static int getCombatLevel(EntityPlayer player)
	{
		return getStat(player, "combatLevel");
	}

	public static int getAgilityLevel(EntityPlayer player)
	{
		return getStat(player, "agilityLevel");
	}

	public static int getMiningLevel(EntityPlayer player)
	{
		return getStat(player, "miningLevel");
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
		if(player.worldObj.isRemote && clientStats.get(stat) != null)
			return clientStats.get(stat);
		else
			return player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger(stat);
	}

	public static void addStat(EntityPlayer player, String stat, int amount)
	{
		addStat(player, stat, amount, true);
	}

	public static void addStat(EntityPlayer player, String stat, int amount, boolean update) //Should only be used on the server
	{
		NBTTagCompound persistedNBT = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		persistedNBT.setInteger(stat, persistedNBT.getInteger(stat) + amount);
		player.getEntityData().setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedNBT);
		if(update && !player.worldObj.isRemote)
			Scapecraft.network.sendTo(new StatsPacket(player), (EntityPlayerMP) player);
	}
	
	public static void setStat(EntityPlayer player, String stat, int amount)
	{
		if(player.worldObj.isRemote)
			clientStats.put(stat, amount);
		else
		{
			NBTTagCompound persistedNBT = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
			persistedNBT.setInteger(stat, amount);
			player.getEntityData().setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedNBT);
		}
	}

	public static void convertFromOldSystem(EntityPlayer player)
	{
		NBTTagCompound tagCompound = new NBTTagCompound();
		player.writeToNBT(tagCompound);
		if(tagCompound.getCompoundTag("ExtendedPlayer") != null && tagCompound.getCompoundTag("ExtendedPlayer").hasKey("combatxp"))
		{
			int axp = tagCompound.getCompoundTag("ExtendedPlayer").getInteger("agilityxp");
			int mxp = tagCompound.getCompoundTag("ExtendedPlayer").getInteger("mining");
			int cxp = tagCompound.getCompoundTag("ExtendedPlayer").getInteger("combatxp") * 25;
			tagCompound.getCompoundTag("ExtendedPlayer").removeTag("mining");
			tagCompound.getCompoundTag("ExtendedPlayer").removeTag("agilityxp");
			tagCompound.getCompoundTag("ExtendedPlayer").removeTag("combatxp");
			tagCompound.getCompoundTag("ExtendedPlayer").removeTag("energy");
			player.readFromNBT(tagCompound);
			addXp(player, "agilityxp", axp);
			addXp(player, "mining", mxp);
			addCombatXp(player, cxp);
		}
	}

}
