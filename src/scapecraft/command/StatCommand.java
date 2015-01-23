package scapecraft.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

import scapecraft.Stats;

public class StatCommand extends CommandBase
{
	@Override
	public String getCommandName()
	{
		return "stat";
	}

	@Override
	public String getCommandUsage(ICommandSender sender)
	{
		return "commands.stat.usage";
	}

	public int getRequiredPermissionLevel()
	{
		return 2;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args)
	{
		if(args.length < 3)
			return;
		EntityPlayerMP player = getPlayer(sender, args[0]);;
		if(args[1].equalsIgnoreCase("get"))
		{
			getCommandSenderAsPlayer(sender).addChatMessage(new ChatComponentText(player.getCommandSenderName() + " is level " + Stats.getStat(player, args[2].toLowerCase() + "Level") + " (" + Stats.getStat(player, args[2].toLowerCase() + "xp") + "xp) for " + args[2]));
		}
	}
}

