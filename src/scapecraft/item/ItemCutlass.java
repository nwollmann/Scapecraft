package scapecraft.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import scapecraft.Stats;

public class ItemCutlass extends ItemWeapon
{
	public ItemCutlass()
	{
		super(ScapecraftToolMaterial.AGILITY, 4, "Cutlass");
	}

	public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker)
	{
		if(itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());
		itemStack.getTagCompound().setBoolean("attacked", true);

		return super.hitEntity(itemStack, target, attacker);
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		if(itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());
		if(itemStack.getTagCompound().getBoolean("attacked") && Stats.getCombatLevel(player) >= 10)
		{
			player.motionX *= 40.0D;
			player.motionY = -3.0D;
			player.motionZ *= 40.0D;
			itemStack.getTagCompound().setBoolean("attacked", false);
		}
		return itemStack;
	}
}
