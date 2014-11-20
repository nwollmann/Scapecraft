package scapecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

import scapecraft.Scapecraft;

/**
 * Because for some reason Block's constructor is protected
 */
public class BlockScapecraft extends Block
{
	public boolean beaconBase = false;

	public BlockScapecraft(Material material)
	{
		super(material);
		this.setCreativeTab(Scapecraft.tabScapecraftBlock);
	}

	public BlockScapecraft setBeaconBase(boolean beaconBase)
	{
		this.beaconBase = beaconBase;
		return this;
	}

	@Override
	public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
	{
		return this.beaconBase;
	}
}
