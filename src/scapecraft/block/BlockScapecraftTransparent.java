package scapecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockScapecraftTransparent extends BlockScapecraft
{

	public BlockScapecraftTransparent(Material material)
	{
		super(material);
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()
	{
		return 1;
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
	{
		return super.shouldSideBeRendered(world, x, y, z, 1 - side);
	}
}
