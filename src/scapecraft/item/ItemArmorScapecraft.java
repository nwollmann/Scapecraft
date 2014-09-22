package scapecraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import scapecraft.ReflectionHelper;
import scapecraft.Scapecraft;

public class ItemArmorScapecraft extends ItemArmor
{
	public String armorNamePrefix;	 
	public String armorNameType;
	protected ScapecraftArmorMaterial material;

	public ItemArmorScapecraft(ScapecraftArmorMaterial armorMaterial, int par3, int type, String armornamePrefix)
	{
		super(ArmorMaterial.GOLD, par3, type);
		this.material = armorMaterial;
		
		ReflectionHelper.changeFinal(ItemArmor.class, this, armorMaterial.getDamageReductionAmount(type), "damageReduceAmount", "c");

		this.setMaxDamage(armorMaterial.getDurability(type));
		this.setCreativeTab(Scapecraft.tabScapecraftArmor);
		this.armorNamePrefix = armornamePrefix;
		switch(type)
		{
			case 0:
				armorNameType = "Helmet";
				break;
			case 1:
				armorNameType = "Chestplate";
				break;
			case 2:
				armorNameType = "Leggings";
				break;
			case 3:
				armorNameType = "Boots";
		}

		this.setUnlocalizedName(this.armorNamePrefix + this.armorNameType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (armorNameType.equals("Leggings")) 
		{
			return "scapecraft:textures/armor/" + armorNamePrefix + "_2.png";
		}
		return "scapecraft:textures/armor/" + armorNamePrefix + "_1.png";
	}


	@Override
	public void registerIcons(IIconRegister iconReg) 
	{
		itemIcon = iconReg.registerIcon("scapecraft:" + this.armorNamePrefix + this.armorNameType);
	}

	//Overriding ItemArmor for using ScapecraftArmorMaterial instead of ArmorMaterial


	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	public int getItemEnchantability()
	{
		return this.material.getEnchantability();
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return this.material.customCraftingMaterial == par2ItemStack.getItem();
	}
	//Special armor effects

	/**
	 * Apply any effects to wearer's attacks
	 */

	public void onWearerAttack(LivingHurtEvent event)
	{
		switch(this.material)
		{
			case BANDOS:
				switch(this.armorType)
				{
					case 0:
						event.ammount += 3F;
						break;
					case 1:
						event.ammount += 6F;
						break;
					case 3:
						event.ammount += 4F;
				}
				break;
			case VERAC:
				if(this.armorType == 0 && event.source.getEntity() instanceof EntityPlayer && this.isWearingFullSet((EntityPlayer) event.source.getEntity()) && ((EntityPlayer) event.source.getEntity()).getCurrentEquippedItem() != null && ((EntityPlayer) event.source.getEntity()).getCurrentEquippedItem().getItem() == Scapecraft.veracFlail)
				{
					System.out.println(event.ammount);
					event.source.setDamageBypassesArmor().setDamageIsAbsolute();
				}
				break;
			default:
		}
	}

	public int getMinLevel()
	{
		return this.material.getMinLevel();
	}

	public double getMaxHealth()
	{
		return this.material.getMaxHealth();
	}

	public ScapecraftArmorMaterial getScapecraftArmorMaterial()
	{
		return this.material;
	}

	public static boolean isWearingFullSet(EntityPlayer entity, ScapecraftArmorMaterial material)
	{
		boolean fullSet = true;
		for(int i = 0; i <= 3; i++)
		{
			if(entity.getCurrentArmor(i) == null || !(entity.getCurrentArmor(i).getItem() instanceof ItemArmorScapecraft) || ((ItemArmorScapecraft) entity.getCurrentArmor(i).getItem()).getScapecraftArmorMaterial() != material)
				fullSet = false;
		}
		return fullSet;
	}

	public boolean isWearingFullSet(EntityPlayer entity)
	{
		return isWearingFullSet(entity, this.material);
	}
}
