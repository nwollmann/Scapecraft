package scapecraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import scapecraft.Scapecraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSpawn extends Block
{
	int tickInterval;
	Class<? extends Entity> entityClass;

	public BlockSpawn(Class<? extends Entity> entityClass, int tickInterval)
	{
		super(Material.rock);
		this.setCreativeTab(Scapecraft.tabScapecraftBlock);
		setHardness(200000.0F);
		setResistance(5000.0F);
		//setStepSound(soundStoneFootstep);
	}

	public BlockSpawn(Class<? extends Entity> entityClass, int tickInterval, boolean tickRandomly)
	{
		this(entityClass, tickInterval);
		setTickRandomly(tickRandomly);
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		par1World.scheduleBlockUpdate(par2, par3, par4, this, this.tickRate(par1World));
		return true;
	}

	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		par1World.scheduleBlockUpdate(par2, par3, par4, this, this.tickRate(par1World));
	}
	public int tickRate(World par1World)
	{
		return tickInterval;
	}

	public void updateTick(World world, int x, int y, int z, Random par5Random)

	{
		world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
		Entity entity = null;
		try
		{
			entity = entityClass.getConstructor(World.class).newInstance(world);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		entity.setLocationAndAngles(x, y + 1, z, world.rand.nextFloat() * 360.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		world.setBlockToAir(x, y + 1, z);
		world.setBlockToAir(x, y + 2, z);


	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return Item.getItemFromBlock(Blocks.stone);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir)
	{
		this.blockIcon = ir.registerIcon("BarrowSpawn");
	}
}
