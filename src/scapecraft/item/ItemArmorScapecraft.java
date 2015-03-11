package scapecraft.item;

import java.util.List;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import scapecraft.Scapecraft;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmorScapecraft extends ItemArmor
{
	public String armorNamePrefix;	 
	public String armorNameType;
	protected ScapecraftArmorMaterial material;
	private static ArmorMaterial fakeMaterial = EnumHelper.addArmorMaterial("SCAPECRAFTARMOR", 1000, new int[] {1, 1, 1, 1}, 1); //Values are all totally arbitrary
	@SideOnly(Side.CLIENT)
	public ModelBiped armorModel;

	public String textureName;

	public ItemArmorScapecraft(ScapecraftArmorMaterial armorMaterial, int par3, int type, String armornamePrefix)
	{
		super(fakeMaterial, par3, type);
		this.material = armorMaterial;
		
		ObfuscationReflectionHelper.setPrivateValue(ItemArmor.class, this, armorMaterial.getDamageReductionAmount(type), "damageReduceAmount", "field_77879_b");

		this.setMaxDurability(armorMaterial.getDurability(type));
		this.setCreativeTab(Scapecraft.tabScapecraftArmor);
		this.armorNamePrefix = armornamePrefix;
		this.textureName = "scapecraft:textures/armor/" + armorNamePrefix + "_1.png";
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
				this.textureName = "scapecraft:textures/armor/" + armorNamePrefix + "_2.png";
				break;
			case 3:
				armorNameType = "Boots";
		}

		this.setUnlocalizedName(this.armorNamePrefix + this.armorNameType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return this.textureName;
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
				if(this.armorType == 0 && event.source.getEntity() instanceof EntityPlayer && this.isWearingFullSet((EntityPlayer) event.source.getEntity()) && ((EntityPlayer) event.source.getEntity()).getCurrentEquippedItem() != null && ((EntityPlayer) event.source.getEntity()).getCurrentEquippedItem().getItem() == ScapecraftItems.veracFlail)
				{
					//System.out.println(event.ammount);
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

	public double getHealthBoost()
	{
		return this.material.getHealthBoost() / 4;
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

	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack itemStack, EntityPlayer player, List lines, boolean advancedTooltips)
	{
		super.addInformation(itemStack, player, lines, advancedTooltips);
		lines.add(StatCollector.translateToLocal("weapon.minlevel") + " " + material.getMinLevel());
		lines.add(StatCollector.translateToLocal("armor.healthboost") + " " + this.getHealthBoost());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{
		if(armorModel == null)
			return super.getArmorModel(entityLiving, itemStack, armorSlot);

		armorModel.bipedHead.showModel = armorSlot == 0;
		armorModel.bipedHeadwear.showModel = armorSlot == 0;
		armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
		armorModel.bipedRightArm.showModel = armorSlot == 1;
		armorModel.bipedLeftArm.showModel = armorSlot == 1;
		armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
		armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;

		armorModel.isSneak = entityLiving.isSneaking();
		armorModel.isRiding = entityLiving.isRiding();
		armorModel.isChild = entityLiving.isChild();
		armorModel.heldItemRight = entityLiving.getEquipmentInSlot(0) != null ? 1 :0;
		if(entityLiving instanceof EntityPlayer)
		{
			armorModel.aimedBow = ((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
		}
		return armorModel;
	}
}
