package scapecraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import scapecraft.Scapecraft;

public class ItemArmorScapecraft extends ItemArmor
{
	public String armorNamePrefix;	 
	public String armorNameType;

	public ItemArmorScapecraft(ArmorMaterial par2EnumArmorMaterial, int par3, int type, String armornamePrefix)
	{
		super(par2EnumArmorMaterial, par3, type);
		this.setCreativeTab(Scapecraft.tabScapecraft);
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
}

