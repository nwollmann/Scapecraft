package scapecraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ItemDryWeapon extends ItemWeapon
 {
	public float extraDamage;
	public ItemDryWeapon(float extraDamage, String name)
	{
		super(ScapecraftToolMaterial.DRYGORE, 5F, name);
		this.extraDamage = extraDamage;
	}

	@Override
	public void onEntityHurt(LivingHurtEvent event)
	{
		if(!(event.entityLiving instanceof EntityPlayer))
			event.ammount += extraDamage;
	}
}
