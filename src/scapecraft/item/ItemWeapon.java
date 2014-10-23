package scapecraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import scapecraft.Scapecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class ItemWeapon extends ItemSword
{
	protected float weaponDamage;
	protected final ScapecraftToolMaterial toolMaterial;
	protected final String name;

	public ItemWeapon(ScapecraftToolMaterial toolMaterial, float baseDamage, String name)
	{
		super(ToolMaterial.GOLD);
		this.toolMaterial = toolMaterial;
		this.setMaxDurability(toolMaterial.getMaxUses());
		this.weaponDamage = baseDamage + toolMaterial.getDamageVsEntity();
		System.out.println(weaponDamage);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Scapecraft.tabScapecraftWeapon);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Multimap getItemAttributeModifiers()
		{
			Multimap multimap = HashMultimap.create();
			multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.weaponDamage, 0));
			return multimap;
		}

	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("scapecraft:" + name);
	}

	/* Not 100% sure what this is for, but it isn't unused */
	@Override
	public float func_150931_i()
	{
		return this.toolMaterial.getDamageVsEntity();
	}

	@Override
	public int getItemEnchantability()
	{
		return this.toolMaterial.getEnchantability();
	}

	@Override
	public String getToolMaterialName()
	{
		return this.toolMaterial.toString();
	}

	@Override
	public boolean getIsRepairable(ItemStack itemstack, ItemStack itemstack2)
	{
		return false; //TODO is this right?
	}

	public void onEntityHurt(LivingHurtEvent event)
	{
	}

	//Don't swing the weapon normally, this is also where custom attacking will start
	/*@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if(entityLiving instanceof EntityPlayer)
		{
			if(!entityLiving.isSwingInProgress)
				entityLiving.isSwingInProgress = true;
			return true;
		}
		return false;
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entityHolder, int i1, boolean b1)
	{
		if(!(entityHolder instanceof EntityPlayer))
			return;
		EntityPlayer player = (EntityPlayer) entityHolder;
		if(player.swingProgressInt == 1)
		{
			for(Object o : world.getEntitiesWithinAABBExcludingEntity(player, player.boundingBox.expand(4D, 4D, 4D)))
			{
				Entity entity = (Entity) o;
				if(entity instanceof EntityLivingBase)
					player.attackTargetEntityWithCurrentItem(entity);
			}

		}
	}*/ //TODO Make weapon swing with collision boxes
}
