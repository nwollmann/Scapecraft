package scapecraft.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

public class ItemSetWeapon extends ItemWeapon
{
	protected final ScapecraftArmorMaterial armorMaterial;
	public ItemSetWeapon(ScapecraftToolMaterial toolMaterial, ScapecraftArmorMaterial armorMaterial, String name)
	{
		super(toolMaterial, 9F, name);
		this.armorMaterial = armorMaterial;
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase target, EntityLivingBase attacker)
	{
		if(attacker instanceof EntityPlayer && ItemArmorScapecraft.isWearingFullSet((EntityPlayer) attacker, this.armorMaterial))
		{
			switch(this.toolMaterial)
			{
				case VERAC:
					target.attackEntityFrom(DamageSource.magic, 10F); //TODO figure out why this doesn't work
					break;
				case TORAG:
					target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 1));
					break;
				case GUTHAN:
					attacker.addPotionEffect(new PotionEffect(Potion.regeneration.id, 100, 0));
					break;
				case DHAROK:
					target.motionY = 0.5D;
					break;
				case AKRISAE:
					attacker.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 0));
					attacker.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
					target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 0));
					break;
				default:
			}
		}
		return super.hitEntity(itemstack, target, attacker);
	}
}

