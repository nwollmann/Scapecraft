package scapecraft.item;
import scapecraft.Scapecraft;

import net.minecraft.item.ItemHoe;

public class ItemScapecraftHoe extends ItemHoe
 {

	public ItemScapecraftHoe(ScapecraftToolMaterial toolMaterial)
	{
		super(ToolMaterial.GOLD);
		this.setCreativeTab(Scapecraft.tabScapecraftTool);
		this.setMaxDurability(toolMaterial.getMaxUses());
		this.setUnlocalizedName(toolMaterial + "Hoe");
	}
}
