package scapecraft.economy;

import java.util.UUID;


public interface Economy
{
	public double getBalance(UUID uuid);
	public double deposit(UUID uuid, double amount);
	public double getBankBalance(String bankname);
	public double depositBank(String bankname, double amount);
}
