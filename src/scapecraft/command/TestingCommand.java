package scapecraft.command;

import scapecraft.economy.EconomyHandler;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class TestingCommand extends CommandBase
{
	@Override
	public String getCommandName()
	{
		return "testing";
	}

	@Override
	public String getCommandUsage(ICommandSender sender)
	{
		return "commands.testing.usage";
	}

	public int getRequiredPermissionLevel()
	{
		return 2;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args)
	{
		EntityPlayerMP player = getCommandSenderAsPlayer(sender);
		EconomyHandler.deposit(player.getUniqueID(), Double.parseDouble(args[0]));
		System.out.println(EconomyHandler.getBalance(player.getUniqueID()));
	}
}

