package scapecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import scapecraft.tileentity.TileEntityScapecraftMobSpawner;

import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static enum GuiId
	{
		STATS,
		SPAWNER;
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
			case SPAWNER:
				TileEntityScapecraftMobSpawner te = (TileEntityScapecraftMobSpawner) world.getTileEntity(x, y, z);
				if(te != null)
					return new GuiSpawner(Minecraft.getMinecraft(), te);
				else
					return null;
			default:
				return null;
		}
	}
}
