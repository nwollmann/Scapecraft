package scapecraft.item;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

public class ItemScapecraftFood extends ItemFood
{
	public int healAmount;

	public ItemScapecraftFood(int healAmount)
	{
		super(healAmount, 0.6f, true);
	}

	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		if(!world.isRemote)
		{
			player.heal(healAmount);
		}
	}
}
