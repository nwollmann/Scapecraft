package scapecraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

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
		this.setMaxDamage(toolMaterial.getMaxUses());
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
			multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
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
}
