package scapecraft.economy;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class VaultEconomy implements Economy
{
	public Object economy; 
	public Class<?> economyClass;

	public VaultEconomy()
	{
		for(Class<?> clazz : Bukkit.getServer().getServicesManager().getKnownServices())
			if(clazz.getCanonicalName().equals("net.milkbowl.vault.economy.Economy"))
			{
				economy = clazz.cast(Bukkit.getServer().getServicesManager().getRegistration(clazz).getProvider());
				economyClass = clazz;
			}
	}

	@Override
	public double getBalance(UUID uuid)
	{
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		try {
			return (Double) economyClass.getMethod("getBalance", new Class[] { OfflinePlayer.class }).invoke(economy, player);
		} catch (Exception e) {
			//e.printStackTrace();
			return 0;
		}
	}

	@Override
	public double deposit(UUID uuid, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBankBalance(String bankname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositBank(String bankname, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	//TODO get these working with the reflection I need
	/*@Override
	public double deposit(UUID uuid, double amount)
	{
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		EconomyResponse response = economy.depositPlayer(player, amount);
		return response.amount;
	}

	@Override
	public double getBankBalance(String bankname)
	{
		EconomyResponse response = economy.bankBalance(bankname);
		return response.balance;
	}

	@Override
	public double depositBank(String bankname, double amount)
	{
		EconomyResponse response = economy.bankDeposit(bankname, amount);
		return response.amount;
	}*/
}
