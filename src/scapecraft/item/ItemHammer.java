package scapecraft.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemHammer extends ItemWeapon
{
	public ItemHammer(ScapecraftToolMaterial toolMaterial, String name)
	{
		super(toolMaterial, 5, name);
	}

	@Override
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker)
	{
		super.hitEntity(itemStack, target, attacker);
		target.motionY = 0.6D;
		return true;
	}
}

	
