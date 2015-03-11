package scapecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import scapecraft.entity.EntityVampire;
import scapecraft.item.ScapecraftItems;

public class BlockCoffin extends BlockScapecraft
{
	public BlockCoffin()
	{
		super(Material.wood);
		//this.setTextureName("scapecraft:coffin");
		this.setUnlocalizedName("coffin");
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float subX, float subY, float subZ)
	{
		if(!worldIn.isRemote && player.getHeldItem() != null && player.getHeldItem().getItem() == ScapecraftItems.garlic)
		{
			EntityVampire entity = new EntityVampire(worldIn);
			entity.setLocationAndAngles((double)pos.getX(), (double)pos.getY() + 1, (double)pos.getZ(), 0F, 0F);
			worldIn.spawnEntityInWorld(entity);
			player.getHeldItem().stackSize--;
			return true;
		}
		return false;
	}
}
