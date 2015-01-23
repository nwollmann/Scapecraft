package scapecraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import scapecraft.Stats;

public class ItemSpecialPotion extends ItemScapecraftPotion
{
	public ItemSpecialPotion()
	{
		super((PotionEffect) null);
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityPlayer player)
	{
		if(!player.capabilities.isCreativeMode)
		{
			stack.stackSize--;
		}

		if(!world.isRemote)
		{
			Stats.addEnergy(player, 2500);
		}

		return stack;
	}
}
