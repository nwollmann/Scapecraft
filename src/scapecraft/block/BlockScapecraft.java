package scapecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Because for some reason Block's constructor is protected
 */
public class BlockScapecraft extends Block
{
	public BlockScapecraft(Material material)
	{
		super(material);
	}
}
