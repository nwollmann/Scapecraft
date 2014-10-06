package scapecraft.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import scapecraft.ReflectionHelper;
import scapecraft.Scapecraft;

import com.google.common.collect.Multimap;

public class ItemScapecraftTool extends ItemTool
{
	protected ScapecraftToolMaterial toolMaterial;
	protected float damageVsEntity;

	public ItemScapecraftTool(float damageVsEntity, ScapecraftToolMaterial toolMaterial, Set<Block> effectiveBlocks)
	{
		super(0, ToolMaterial.GOLD, effectiveBlocks); //None of these arguments matter, but extending ItemTool is needed for enchantments
		this.setMaxDurability(toolMaterial.getMaxUses());
		this.efficiencyOnProperMaterial = toolMaterial.getEfficiencyOnProperMaterial();
		this.damageVsEntity = damageVsEntity + toolMaterial.getDamageVsEntity();
		this.setCreativeTab(Scapecraft.tabScapecraftTool);
	}

	protected void setToolClass(String toolClass)
	{
		ReflectionHelper.changeFinal(ItemTool.class, this, toolClass, "toolClass", "toolClass");
	}

	public ScapecraftToolMaterial getScapecraftToolMaterial()
	{
		return toolMaterial;
	}

	@Override
	public String getToolMaterialName()
	{
		return this.toolMaterial.toString();
	}

	@Override
	public boolean getIsRepairable(ItemStack toolStack, ItemStack materialStack)
	{
		return this.toolMaterial.getBaseItemForRepair() == materialStack.getItem();
	}

	@Override
	public int getItemEnchantability()
	{
		return this.toolMaterial.getEnchantability();
	}

	/**
	 * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Tool modifier", (double)this.damageVsEntity, 0));
		return multimap;
	}

}
