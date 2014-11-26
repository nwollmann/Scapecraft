package scapecraft.economy;

public class EconomyHandler
{
	public static Economy economy = null;

	public static void initEconomy()
	{
		try
		{
			//Class.forName("net.milkbowl.vault.economy.Economy", false, null);
			economy = new VaultEconomy();
		}
		catch(Throwable e)
		{
			System.out.println("Vault not loaded");
			e.printStackTrace();
			economy = null;
		}
	}
}
