package scapecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static enum GuiId
	{
		STATS
	}

	@Override
	public Object getServerGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	@Override
	public Object getClientGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(GuiId.values()[Id])
		{
			case STATS:
				return new GuiStats(Minecraft.getMinecraft());
			default:
				return null;
		}
	}
}
