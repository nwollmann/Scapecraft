package scapecraft.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class SpawnCommand extends CommandBase
{
	@Override
	public String getCommandName()
	{
		return "scspawn";
	}

	@Override
	public String getCommandUsage(ICommandSender sender)
	{
		return "commands.scspawn.usage";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args)
	{
	}
}

