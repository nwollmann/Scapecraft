package scapecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scapecraft.Scapecraft;
import scapecraft.Stats;
import scapecraft.tileentity.TileEntityBlockSpawner;

public class BlockBlockSpawner extends Block implements ITileEntityProvider
{
	Block fullBlock;
	int xp;
	public int regenTime;
	public int fullSize = 15;
	public String stat = "mining";

	public BlockBlockSpawner(Block fullBlock, int regenTime, int xp, int fullSize)
	{
		this(fullBlock, regenTime, xp);
		this.fullSize = fullSize;
	}

	public BlockBlockSpawner(Block fullBlock, int regenTime, int xp)
	{
		super(fullBlock.getMaterial());
		this.fullBlock = fullBlock;
		this.setUnlocalizedName(fullBlock.getUnlocalizedName().substring(5) + "Spawn");
		this.setCreativeTab(Scapecraft.tabScapecraftBlock);
		this.regenTime = regenTime * 20;
		this.xp = xp;
		this.setHarvestLevel(fullBlock.getHarvestTool(fullBlock.getDefaultState()), fullBlock.getHarvestLevel(fullBlock.getDefaultState()));
	}

	public BlockBlockSpawner(Block fullBlock, int regenTime)
	{
		this(fullBlock, regenTime, 0);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state)
	{
		if(fullBlock.getCollisionBoundingBox(world, pos, state) == null)
			return null;
		float height = ((float) state.getBlock().getMetaFromState(state) + 1F) / 16F;
		return new AxisAlignedBB(pos.getX() + this.minX, pos.getY() + this.minY, pos.getZ() + this.minZ, pos.getX() + this.maxX, pos.getY() + height, pos.getZ() + this.maxZ);
	}
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	/*
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}*/
	
	@Override
	public boolean isFullCube()
	{
		return false;
	}

	public int getRenderType()
	{
		return fullBlock.getRenderType();
	}

	@Override
	public void setBlockBoundsForItemRender()
	{
		setBlockBoundsForDepth(15);
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, BlockPos pos)
	{
		this.setBlockBoundsForDepth(blockAccess.getBlockState(pos).getBlock().getMetaFromState(blockAccess.getBlockState(pos)));
	}

	protected void setBlockBoundsForDepth(int metadata)
	{
		float height = (1 + metadata) / 16.0F;
		if(fullBlock.getBlockBoundsMaxY() < 1.0F)
			height = (float) fullBlock.getBlockBoundsMaxY();
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, height, 1.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		//was side==1, not sure which direction that actually is
		return side == EnumFacing.UP ? true : super.shouldSideBeRendered(blockAccess, pos, side);
	}

	/*
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		return fullBlock.getIcon(side, 0);
	} */

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) 
	{
		return createTileEntity(world, null);
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) 
	{
		return new TileEntityBlockSpawner();
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}

	@Override
	public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
	{
		if(player.capabilities.isCreativeMode || willHarvest && (!(world.getTileEntity(pos) instanceof TileEntityBlockSpawner) || ((TileEntityBlockSpawner) world.getTileEntity(pos)).uses == 0))
			return world.setBlockToAir(pos);
		return true;
	}

	@Override
	public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player)
	{
		IBlockState state = world.getBlockState(pos);
		int meta = state.getBlock().getMetaFromState(state);
		return player.capabilities.isCreativeMode || meta == 15 && ForgeHooks.canHarvestBlock(fullBlock, player, world, pos);
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity tileEntity)
	{
		player.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
		player.addExhaustion(0.025F);

		harvesters.set(player);
		int i1 = EnchantmentHelper.getFortuneModifier(player);
		//fullBlock.dropBlockAsItem(worldIn, x, y, z, meta, i1);
		fullBlock.dropBlockAsItem(worldIn, pos, state, i1);
		harvesters.set(null);

		Stats.addXp(player, stat, xp);

		//TileEntityBlockSpawner te = (TileEntityBlockSpawner) worldIn.getTileEntity(x, y, z);
		TileEntityBlockSpawner te = (TileEntityBlockSpawner) tileEntity;
		if(te == null)
		{
			System.out.printf("Spawner at %d, %d, %d in dimension %d for %s is null, this should not happen\n", pos.getX(), pos.getY(), pos.getZ(), worldIn.provider.getDimensionId(), this.fullBlock.getUnlocalizedName());
			return;
		}

		te.startTime = 0; //Reset start time
		if(te.uses != 0)
		{
			if(te.uses > 0)
				te.uses--;
			te.growing = true;
			//worldIn.setBlockMetadataWithNotify(x, y, z, 0, 3);
			worldIn.setBlockState(pos, state.getBlock().getStateFromMeta(0), 3);
		}
	}

	@Override
	public float getBlockHardness(World world, BlockPos pos)
	{
		IBlockState state = world.getBlockState(pos);
		return state.getBlock().getMetaFromState(state) < fullSize ? 1000F : fullBlock.getBlockHardness(world, pos);
	}

	@Override
	public void onBlockExploded(World world, BlockPos pos, Explosion explosion)
	{
		//Don't get destroyed, don't do anything
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack itemStack)
	{
		int uses = itemStack.getMetadata();
		if(uses == 0)
		{
			if(placer instanceof EntityPlayer && ((EntityPlayer)placer).capabilities.isCreativeMode)
			{
				uses = -1;
			}
			else
			{
				uses = 50;
			}
		}
		((TileEntityBlockSpawner) world.getTileEntity(pos)).uses = uses;
		//System.out.println(((TileEntityBlockSpawner) world.getTileEntity(x, y, z)).uses); 
	}

	public void onFullyGrown(World world, int x, int y, int z)
	{
	}

	public int getRegenTime()
	{
		return regenTime;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		TileEntityBlockSpawner te = (TileEntityBlockSpawner) world.getTileEntity(pos);
		if(te == null)
		{
			System.out.printf("Spawner at %d, %d, %d in dimension %d for %s is null, this should not happen\n", pos.getX(), pos.getY(), pos.getZ(), world.provider.getDimensionId(), this.fullBlock.getUnlocalizedName());
			return null;
		}

		return new ItemStack(this, 1, te.uses);
	}

	/*
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
	} */
}
