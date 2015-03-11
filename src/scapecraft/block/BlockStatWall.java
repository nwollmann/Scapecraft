package scapecraft.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import scapecraft.Stats;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStatWall extends BlockScapecraft
{
	public String stat;
	public int[] colors = {0x00FF00, 0x11EE00, 0x22DD00, 0x33CC00, 0x44BB00, 0x55AA00, 0x669900, 0x778800, 0x887700, 0x996600, 0xAA5500, 0xBB4400, 0xCC3300, 0xDD2200, 0xEE1100, 0xFF0000};

	public BlockStatWall(String stat)
	{
		super(Material.glass);
		this.stat = stat;
		this.setUnlocalizedName(stat + "Wall");
		this.setBlockUnbreakable();
		this.setResistance(6000000F);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB mask, List list, Entity entity)
	{
		if(!(entity instanceof EntityPlayer) || Stats.getStat((EntityPlayer) entity, stat) < world.getBlockMetadata(x, y, z) * 5 + 10)
			super.addCollisionBoxesToList(world, x, y, z, mask, list, entity);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, int side)
	{
		return true;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1, z + 1);
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
	{
		return world.getBlock(x, y, z) != this;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1, z + 1);
	}

	public int damageDropped(int meta)
	{
		return meta;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack itemStack)
	{
		world.setBlockMetadataWithNotify(x, y, z, itemStack.getMetadata() & 15, 3);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List stacks)
	{
		for(int i = 0; i < 16; i++)
			stacks.add(new ItemStack(item, 1, i));
	}

	@Override
	public int getRenderColor(int meta)
	{
		return colors[meta & 15];
	}

	@Override
	public int colorMultiplier(IBlockAccess world, int x, int y, int z)
	{
		return colors[world.getBlockMetadata(x, y, z)];
			
	}
}
