package scapecraft.command;

import scapecraft.entity.ScapecraftEntities;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;

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
		Entity entity = ScapecraftEntities.spawnScapecraftEntity(args[0], sender.getEntityWorld());
		entity.setLocationAndAngles(sender.getCommandSenderPosition().posX, sender.getCommandSenderPosition().posY, sender.getCommandSenderPosition().posZ, 0F, 0F);
		sender.getEntityWorld().spawnEntityInWorld(entity);
	}
}

