package scapecraft.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockAbbyDemonSpawn extends Block
{
	public BlockAbbyDemonSpawn(int i, int j)
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setTickRandomly(true);

	}




	public void updateTick(World world, int x, int y, int z, Random par5Random)

	{

		EntityAbbyDemon entity = new EntityAbbyDemon(world);
		entity.setLocationAndAngles(x, y + 1, z,
				world.rand.nextFloat() * 360.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		world.setBlock(x, y+1, z, null, 0, z);
		world.setBlock(x, y+2, z, null, 0, z);
		world.setBlock(x, y+3, z, null, 0, z);
		//world.setBlockWithNotify(x, y, z, 0);

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{

		{
			this.blockIcon = ir.registerIcon("AbbyDemonSpawn");
		}
	}

	public Block getBlockDropped(int par1, Random par2Random, int par3)
	{
		return Blocks.stone;
	}}
