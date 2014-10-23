package scapecraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import scapecraft.block.ScapecraftBlocks;
import scapecraft.item.ScapecraftItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ScapecraftRecipes
{
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.AGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), ScapecraftItems.hilt, Character.valueOf('Y'), ScapecraftItems.armadylHilt});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.BGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), ScapecraftItems.hilt, Character.valueOf('Y'), ScapecraftItems.bandosHilt});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 9), new Object[] {"X", Character.valueOf('X'), ScapecraftItems.note1});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.boltRack, 3), new Object[] { " X ", " Y ", Character.valueOf('X'), ScapecraftItems.magicPlank, Character.valueOf('Y'), Items.arrow});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.DDS, 1), new Object[] {"Y Y", " X ", "Y Y", Character.valueOf('X'), ScapecraftItems.DD, Character.valueOf('Y'), Items.fermented_spider_eye});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.LOL, 1), new Object[] {" X ", "XYX", "XXY", Character.valueOf('X'), Blocks.dirt, Character.valueOf('Y'), Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.SGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), ScapecraftItems.hilt, Character.valueOf('Y'), ScapecraftItems.saradominHilt});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.tombKey, 2), new Object[] { "XYZ", "ABC", " U ", Character.valueOf('X'), ScapecraftItems.ahrimKey, Character.valueOf('Y'), ScapecraftItems.akrisaeKey, Character.valueOf('Z'), dharokKey, Character.valueOf('A'), karilKey, Character.valueOf('B'), guthanKey, Character.valueOf('C'), toragKey, Character.valueOf('U'), veracKey});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.yewBow, 1), new Object[] { " XY", "X Y", " XY", Character.valueOf('X'), ScapecraftItems.yewStick, Character.valueOf('Y'), Items.string});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.yewPlank, 2), new Object[] { "X", Character.valueOf('X'), ScapecraftItems.yewLog});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.yewStairs, 4), new Object[] { "  X", " XX", "XXX", Character.valueOf('X'), ScapecraftItems.yewPlank});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.yewStick, 1), new Object[] { "X", "X", Character.valueOf('X'), ScapecraftItems.yewPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.ZGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), ScapecraftItems.hilt, Character.valueOf('Y'), ScapecraftItems.zamorakHilt});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ScapecraftItems.addyIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), ScapecraftItems.addyIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyLump, 1), new Object[] {" X ", "XYX", " X ", Character.valueOf('X'), Items.coal, Character.valueOf('Y'), ScapecraftBlocks.addyOre});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyShovel, 1), new Object[] {" X ", " Y ", " Y ", Character.valueOf('X'), ScapecraftItems.addyIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addySword, 1), new Object[] {" X ", " X ", " Y ", Character.valueOf('X'), ScapecraftItems.addyIngot, Character.valueOf('Y'), Items.stick});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyhoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.applePieUncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.apple, Character.valueOf('Y'), Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackDLeather, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), ScapecraftItems.blackDHide});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdBoots, 1), new Object[] {"X X", "X X", Character.valueOf('X'), ScapecraftItems.blackDLeather});     	         
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.blackDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.blackDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.blackDLeather});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blueCobblestonec, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.bluecobblestone});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.cabbagePieUncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), ScapecraftItems.cutcabbage, Character.valueOf('Y'), Items.bread});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.cabbagePieUncooked, 1), new Object[] {" X ", "XYX", Character.valueOf('X'), Blocks.wood, Character.valueOf('Y'), Blocks.torchWood});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.contract, 1), new Object[] {"XYX", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.contract2, 1), new Object[] {"XY", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.contract3, 1), new Object[] {" X ", "XYX", " X ", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.contract4, 1), new Object[] {"XXX", "XYX", "XXX", Character.valueOf('X'), Items.diamond, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.cutcabbage, 1), new Object[] {"X", Character.valueOf('X'), ScapecraftItems.cabbage});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.fishPieUncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.fishCooked, Character.valueOf('Y'), Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.graniteLump});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greenDLeather, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), ScapecraftItems.GreenDhide});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendBoots, 1), new Object[] {"X X", "X X", Character.valueOf('X'), ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.hilt, 1), new Object[] {" X ", " Y ", " Z ", Character.valueOf('X'), ScapecraftItems.shard1, Character.valueOf('Y'), ScapecraftItems.shard2, Character.valueOf('Z'), ScapecraftItems.shard3});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicBoat, 1), new Object[] { "X X", "XXX", Character.valueOf('X'), ScapecraftItems.magicPlank});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicBow, 1), new Object[] { " XY", "X Y", " XY", Character.valueOf('X'), ScapecraftItems.magicstick, Character.valueOf('Y'), Items.string});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicPlank, 2), new Object[] { "X", Character.valueOf('X'), ScapecraftItems.magiclog});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicSapling, 1), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Items.diamond, Character.valueOf('X'), ScapecraftItems.Yewsapling});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicStairs, 4), new Object[] {"  X", " XX", "XXX", Character.valueOf('X'), ScapecraftItems.magicPlank});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicStick, 1), new Object[] { "X", "X", Character.valueOf('X'), ScapecraftItems.magicPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.meatPieUncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.cooked_porkchop, Character.valueOf('Y'), Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ScapecraftItems.mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), ScapecraftItems.mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithLump, 1), new Object[] {"XYX", Character.valueOf('X'), Items.coal, Character.valueOf('Y'), ScapecraftBlocks.mithOre});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithShovel, 1), new Object[] {" X ", " Y ", " Y ", Character.valueOf('X'), ScapecraftItems.mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithSword, 1), new Object[] {" X ", " X ", " Y ", Character.valueOf('X'), ScapecraftItems.mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note1, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note1, 9), new Object[] {"X", Character.valueOf('X'), ScapecraftItems.note2});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note2, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.note1});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note3, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.note2});
		//GameRegistry.addRecipe(new ItemStack(ScapecraftItems.pickaxeGaloreg, 1), new Object[] {"Y", "Y", "X", Character.valueOf('X'), ScapecraftItems.pickaxeGalore, Character.valueOf('Y'), Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ScapecraftItems.runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), ScapecraftItems.runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeLump, 1), new Object[] {"XXX", "XYX", "XXX", Character.valueOf('X'), Items.coal, Character.valueOf('Y'), ScapecraftBlocks.runeOre});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runePickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeShovel, 1), new Object[] {" X ", " Y ", " Y ", Character.valueOf('X'), ScapecraftItems.runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeSword, 1), new Object[] {" X ", " X ", " Y ", Character.valueOf('X'), ScapecraftItems.runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.steelHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Y'), Items.stick});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), ScapecraftItems.bluecobblestonec});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), ScapecraftItems.bluecobblestonec});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), ScapecraftItems.bluecobblestonec});
		//;GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), ScapecraftItems.bluecobblestonec});

		GameRegistry.addSmelting(ScapecraftItems.addyLump, new ItemStack(ScapecraftItems.addyIngot), 1.0F);
		//;GameRegistry.addSmelting(applePieUncooked, new ItemStack(applepie), 1.0F);
		//;GameRegistry.addSmelting(cabbagePieUncooked, new ItemStack(cabbagepie), 1.0F);
		//;GameRegistry.addSmelting(fishPieUncooked, new ItemStack(fishpie), 1.0F);
		//;GameRegistry.addSmelting(meatPieUncooked, new ItemStack(meatpie), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.mithLump, new ItemStack(ScapecraftItems.mithIngot), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.runeLump, new ItemStack(ScapecraftItems.runeIngot), 1.0F);
	}
}
