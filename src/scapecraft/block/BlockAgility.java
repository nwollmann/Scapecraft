package scapecraft.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import scapecraft.Stats;

public class BlockAgility extends BlockScapecraft
{
	int xp;

	public BlockAgility(int xp)
	{
		super(Material.rock);
		this.xp = xp;
		this.setUnlocalizedName("agilityBlock" + xp);
		//this.setTextureName("scapecraft:AgilityBlock");
		this.setBlockUnbreakable();
	}

	@Override
	public boolean canProvidePower()
	{
		return true;
	}

	@Override
	public int isProvidingWeakPower(IBlockAccess world, BlockPos pos, IBlockState state, EnumFacing facing)
	{
		return state.getBlock().getMetaFromState(state) * 15;
	}

	@Override
	public int isProvidingStrongPower(IBlockAccess world, BlockPos pos, IBlockState state, EnumFacing facing)
	{
		return state.getBlock().getMetaFromState(state) * 15;
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random)
	{
		if(!world.isRemote && state.getBlock().getMetaFromState(state) != 0)
			//world.setBlockMetadataWithNotify(x, y, z, 0, 3);
			world.setBlockState(pos, state.getBlock().getStateFromMeta(0), 3);

	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float subX, float subY, float subZ)
	{
		if(!world.isRemote && state.getBlock().getMetaFromState(state) == 0)
		{
			//world.setBlockMetadataWithNotify(x, y, z, 1, 3); assuming x, y, z, meta, flags
			world.setBlockState(pos, state.getBlock().getStateFromMeta(1), 3);
			world.scheduleUpdate(pos, this, 40);
			Stats.addXp(player, "agility", xp);
		}

		return true;
	}
}
