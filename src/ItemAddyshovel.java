package src;
import com.google.common.collect.Sets;

import cpw.mods.fml.relauncher.SideOnly;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class ItemAddyshovel extends ItemTool
{
	private static final Set field_150916_c = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
	private static final String __OBFID = "CL_00000063";

	public ItemAddyshovel(int par1, Item.ToolMaterial p_i45353_1_)
	{
		super(par1, p_i45353_1_, field_150916_c);
	}

	public boolean func_150897_b(Block p_150897_1_)
	{
		return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
	}

	public void registerIcons(IIconRegister ir)
	{
		{
			this.itemIcon = ir.registerIcon("Addyshovel");
		}
	}
}
