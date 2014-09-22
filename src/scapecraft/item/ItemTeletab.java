package scapecraft.item;

import scapecraft.Scapecraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTeletab extends Item
{
	int x;
	int y;
	int z;
	public ItemTeletab(int x, int y, int z) //TODO make this configurable
	{
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.setCreativeTab(Scapecraft.tabScapecraftMisc);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		player.setPositionAndUpdate(x, y, z);
		itemStack.stackSize--;
		return itemStack;
	}
}
