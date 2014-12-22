package scapecraft.world.gen.feature;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public abstract class WorldGenScapecraft extends WorldGenerator
{
	public WorldGenScapecraft(boolean doBlockNotify)
	{
		super(doBlockNotify);
	}

	public void setBlocks(World world, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, Block block)
	{
		this.setBlocks(world, xMin, yMin, zMin, xMax, yMax, zMax, block, 0, false);
	}

	public void setBlocks(World world, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, Block block, int metadata)
	{
		this.setBlocks(world, xMin, yMin, zMin, xMax, yMax, zMax, block, metadata, false);
	}

	public void setBlocks(World world, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, Block block, int metadata, boolean replace)
	{
		for(int x = xMin; x <= xMax; x++)
			for(int z = zMin; z <= zMax; z++)
				for(int y = yMin; y <= yMax; y++)
				if(world.getBlock(x, y, z).isReplaceable(world, x, y, z))
					world.setBlock(x, y, z, block, metadata, 3);
	}
}
