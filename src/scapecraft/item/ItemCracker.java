package scapecraft.item;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import scapecraft.Scapecraft;

public class ItemCracker extends Item
{
	public ArrayList<ItemStack> rewards = new ArrayList<ItemStack>();
	public Random rand;

	public ItemCracker()
	{
		this.setCreativeTab(Scapecraft.tabScapecraftMisc);
		this.setUnlocalizedName("cracker");
		this.setTextureName("scapecraft:Cracker");
		this.setMaxStackSize(1);
		rand = new Random();
		addAll(ScapecraftItems.cracker);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		super.onItemRightClick(itemStack, world, player);
		if(rewards.size() > 0)
			return rewards.get(rand.nextInt(rewards.size())).copy();
		return itemStack;
	}

	public void addAll(Object... items)
	{
		for(Object item : items)
		{
			if(item instanceof Item)
			{
				rewards.add(new ItemStack((Item) item));
			}
			else if(item instanceof Block)
			{
				rewards.add(new ItemStack((Block) item));
			}
			else if(item instanceof ItemStack)
			{
				rewards.add((ItemStack) item);
			}
		}
	}
}
