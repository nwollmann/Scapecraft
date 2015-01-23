package scapecraft.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

import scapecraft.Scapecraft;
import scapecraft.entity.EntityMagicBoat;

public class ItemMagicBoat extends Item
{
	public ItemMagicBoat()
	{
		this.setCreativeTab(Scapecraft.tabScapecraftMisc);
		this.setUnlocalizedName("magicBoat");
		this.setTextureName("scapecraft:MagicBoat");
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			Block block = world.getBlock(x, y, z);
			x += Facing.offsetsXForSide[side];
			y += Facing.offsetsYForSide[side];
			z += Facing.offsetsZForSide[side];
			double yOffset = (side == 1 && block.getRenderType() == 11) ? 0.5D : 0D;

			EntityMagicBoat entity = new EntityMagicBoat(world);
			entity.setLocationAndAngles(x + 0.5D, y + yOffset, z + 0.5D, 0F, 0F);
			world.spawnEntityInWorld(entity);

			if (!player.capabilities.isCreativeMode)
				--itemStack.stackSize;
		}
		return true;
	}
}
