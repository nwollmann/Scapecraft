package scapecraft.economy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class VaultEconomy implements Economy
{
	private Object economy; 
	private Class<?> economyClass;
	private Class<?> econResponseClass;
	private Method getBalanceMethod;
	private Method depositPlayerMethod;
	private Method bankBalanceMethod;
	private Method bankDepositMethod;
	private Field balanceField;
	private Field amountField;

	public VaultEconomy()
	{
		for(Class<?> clazz : Bukkit.getServer().getServicesManager().getKnownServices())
			if(clazz.getCanonicalName().equals("net.milkbowl.vault.economy.Economy"))
			{
				economy = clazz.cast(Bukkit.getServer().getServicesManager().getRegistration(clazz).getProvider());
				economyClass = clazz;

				try
				{
					getBalanceMethod = economyClass.getMethod("getBalance", new Class[] { OfflinePlayer.class });
					depositPlayerMethod = economyClass.getMethod("depositPlayer", new Class[] { OfflinePlayer.class, int.class});
					bankBalanceMethod = economyClass.getMethod("bankBalance", new Class[] { String.class });
					bankDepositMethod = economyClass.getMethod("bankDeposit", new Class[] { String.class, int.class});
					econResponseClass = bankBalanceMethod.getReturnType();
					balanceField = econResponseClass.getField("balance");
					amountField = econResponseClass.getField("amount");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
	}

	@Override
	public double getBalance(UUID uuid)
	{
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		try
		{
			return (Double) getBalanceMethod.invoke(economy, player);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public double deposit(UUID uuid, double amount)
	{
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		try
		{
			return (Double) amountField.get(depositPlayerMethod.invoke(economy, player, amount));
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public double getBankBalance(String bankname)
	{
		try
		{
			return (Double) balanceField.get(bankBalanceMethod.invoke(economy, bankname));
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public double depositBank(String bankname, double amount)
	{
		try
		{
			return (Double) amountField.get(bankDepositMethod.invoke(economy, bankname, amount));
		} catch (Exception e) {
			return 0;
		}
	}
}
