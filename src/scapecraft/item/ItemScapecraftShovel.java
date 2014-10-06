package scapecraft.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import com.google.common.collect.Sets;

public class ItemScapecraftShovel extends ItemScapecraftTool
{
	private static final Set<Block> effectiveBlocks = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});

	public ItemScapecraftShovel(ScapecraftToolMaterial toolMaterial)
	{
		super(1F, toolMaterial, effectiveBlocks);
		setToolClass("shovel");
	}
	public boolean canItemHarvestBlock(Block block)
	{
		return block == Blocks.snow_layer || block == Blocks.snow;
	}
}
