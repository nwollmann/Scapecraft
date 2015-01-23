package scapecraft.economy;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

public class ScapecraftEconomy implements Economy
{
	HashMap<UUID, Double> balances = new HashMap<UUID, Double>();

	@Override
	public double getBalance(UUID uuid)
	{
		Double balance = balances.get(uuid);

		return balance == null ? 0 : balance;
	}

	public void setBalance(UUID uuid, double amount)
	{
		balances.put(uuid, amount);
	}

	@Override
	public double deposit(UUID uuid, double amount)
	{
		Double balance = balances.get(uuid);
		if(balance == null)
			balance = 0D;
		balances.put(uuid, balance + amount);
		return balances.get(uuid);
	}

	@Override
	public double getBankBalance(String bankname)
	{
		return 0;
	}

	@Override
	public double depositBank(String bankname, double amount)
	{
		return 0;
	}

	public void writeToNBT(NBTTagCompound tagCompound)
	{
		NBTTagList balancesNBT = new NBTTagList();
		for(Map.Entry<UUID, Double> entry : balances.entrySet())
		{
			NBTTagCompound currentTag = new NBTTagCompound();
			currentTag.setString("uuid", entry.getKey().toString());
			currentTag.setDouble("balance", entry.getValue());
			balancesNBT.appendTag(currentTag);
		}

		tagCompound.setTag("balances", balancesNBT);
	}

	public void readFromNBT(NBTTagCompound tagCompound)
	{
		NBTTagList balancesNBT = tagCompound.getTagList("balances", Constants.NBT.TAG_COMPOUND);
		if(balancesNBT == null)
			return;

		balances.clear();

		for(int i = 0; i < balancesNBT.tagCount(); i++)
		{
			NBTTagCompound currentTag = balancesNBT.getCompoundTagAt(i);
			balances.put(UUID.fromString(currentTag.getString("uuid")), currentTag.getDouble("balance"));
		}
	}
}
