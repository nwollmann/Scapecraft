package scapecraft.item;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import scapecraft.models.ModelBandosArmor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorBandos extends ItemArmorScapecraft
{
	@SideOnly(Side.CLIENT)
	private static final ModelBandosArmor bandosChest = new ModelBandosArmor(1.0f);
	@SideOnly(Side.CLIENT)
	private static final ModelBandosArmor bandosLegs = new ModelBandosArmor(0.5f);
	public ItemArmorBandos(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armornamePrefix)
	{
		super(par2EnumArmorMaterial, par3, par4, armornamePrefix);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
	{
		ModelBiped armorModel = (this.armorType == 1 || this.armorType == 3) ? bandosChest : bandosLegs;

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
