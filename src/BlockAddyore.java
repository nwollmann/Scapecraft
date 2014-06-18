package src;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class BlockAddyore extends Block
{
	public BlockAddyore(int i, int j)
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 2);
	}
	public Block idDropped(int par1, Random par2Random, int par3)
	{
		return mod_BlocksGalore.Addyore;
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{

		{
			this.blockIcon = ir.registerIcon("Addyore");
		}
	}
}
