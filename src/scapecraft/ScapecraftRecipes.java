package scapecraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import scapecraft.block.ScapecraftBlocks;
import scapecraft.entity.ScapecraftEntities;
import scapecraft.item.ScapecraftItems;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ScapecraftRecipes
{
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.blueCobbleCompressed, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ScapecraftBlocks.blueCobble});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.boltRack, 3), new Object[] { " X ", " Y ", 'X', ScapecraftBlocks.magicPlank, 'Y', Items.arrow});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.cabbagePieUncooked, 1), new Object[] {" X ", " Y ", 'X', ScapecraftItems.cutCabbage, 'Y', Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.cabbagePieUncooked, 1), new Object[] {" X ", "XYX", 'X', Blocks.log, 'Y', Blocks.torch});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.scapecraftSpawnEgg, ScapecraftEntities.entities.indexOf("WhiteKnight")), new Object[] {"XYX", 'X', Items.gold_ingot, 'Y', Items.paper});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.scapecraftSpawnEgg, ScapecraftEntities.entities.indexOf("Guard")), new Object[] {"XY", 'X', Items.gold_ingot, 'Y', Items.paper});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.scapecraftSpawnEgg, ScapecraftEntities.entities.indexOf("Wizard")), new Object[] {" X ", "XYX", " X ", 'X', Items.gold_ingot, 'Y', Items.paper});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.scapecraftSpawnEgg, ScapecraftEntities.entities.indexOf("HeroKnight")), new Object[] {"XXX", "XYX", "XXX", 'X', Items.diamond, 'Y', Items.paper});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.cutCabbage, 1), new Object[] {"X", 'X', ScapecraftBlocks.cabbage});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.fishPieUncooked, 1), new Object[] {" X ", " Y ", 'X', Items.cooked_fish, 'Y', Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greenDLeather, 1), new Object[] {" X ", " Y ", 'X', Items.gold_ingot, 'Y', ScapecraftItems.greenDHide});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicBoat, 1), new Object[] { "X X", "XXX", 'X', ScapecraftBlocks.magicPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicBow, 1), new Object[] { " XY", "X Y", " XY", 'X', ScapecraftItems.magicStick, 'Y', Items.string});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.magicPlank, 2), new Object[] { "X", 'X', ScapecraftBlocks.magicLog});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.magicSapling, 1), new Object[] { "XXX", "XYX", "XXX", 'Y', Items.diamond, 'X', ScapecraftBlocks.yewSapling});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.magicStairs, 4), new Object[] {"  X", " XX", "XXX", 'X', ScapecraftBlocks.magicPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.magicStick, 1), new Object[] { "X", "X", 'X', ScapecraftBlocks.magicPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneBoots, 1), new Object[] { "X X", "X X", 'X', ScapecraftBlocks.blueCobbleCompressed});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftBlocks.blueCobbleCompressed});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftBlocks.blueCobbleCompressed});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.stoneLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftBlocks.blueCobbleCompressed});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.yewBow, 1), new Object[] { " XY", "X Y", " XY", 'X', ScapecraftItems.yewStick, 'Y', Items.string});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.yewPlank, 2), new Object[] { "X", 'X', ScapecraftBlocks.yewLog});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.yewStairs, 4), new Object[] { "  X", " XX", "XXX", 'X', ScapecraftBlocks.yewPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.yewStick, 1), new Object[] { "X", "X", 'X', ScapecraftBlocks.yewPlank});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.dragonPickaxeg, 1), new Object[] {"Y", "Y", "X", 'X', ScapecraftItems.dragonPickaxe, 'Y', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.AGS, 1), new Object[] {" X ", " Y ", 'X', ScapecraftItems.hilt, 'Y', ScapecraftItems.armadylHilt});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.BGS, 1), new Object[] {" X ", " Y ", 'X', ScapecraftItems.hilt, 'Y', ScapecraftItems.bandosHilt});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.DDS, 1), new Object[] {"Y Y", " X ", "Y Y", 'X', ScapecraftItems.DD, 'Y', Items.fermented_spider_eye});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.SGS, 1), new Object[] {" X ", " Y ", 'X', ScapecraftItems.hilt, 'Y', ScapecraftItems.saradominHilt});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.ZGS, 1), new Object[] {" X ", " Y ", 'X', ScapecraftItems.hilt, 'Y', ScapecraftItems.zamorakHilt});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyAxe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyBoots, 1), new Object[] { "X X", "X X", 'X', ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyHammer, 1), new Object[] {"XXX", "XYX", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyShovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addySword, 1), new Object[] {" X ", " X ", " Y ", 'X', ScapecraftItems.addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.applePieUncooked, 1), new Object[] {" X ", " Y ", 'X', Items.apple, 'Y', Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackDLeather, 1), new Object[] {" X ", " Y ", 'X', Items.gold_ingot, 'Y', ScapecraftItems.blackDHide});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdBoots, 1), new Object[] {"X X", "X X", 'X', ScapecraftItems.blackDLeather});     	         
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.blackDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.blackDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.blackdLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.blackDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteBoots, 1), new Object[] { "X X", "X X", 'X', ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.graniteLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.graniteLump});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendBoots, 1), new Object[] {"X X", "X X", 'X', ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.greendLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.greenDLeather});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.hilt, 1), new Object[] {" X ", " Y ", " Z ", 'X', ScapecraftItems.shard1, 'Y', ScapecraftItems.shard2, 'Z', ScapecraftItems.shard3});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.ironHammer, 1), new Object[] {"XXX", "XYX", " Y ", 'X', Items.iron_ingot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.meatPieUncooked, 1), new Object[] {" X ", " Y ", 'X', Items.cooked_porkchop, 'Y', Items.bread});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeAxe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ScapecraftItems.bronzeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeBoots, 1), new Object[] { "X X", "X X", 'X', ScapecraftItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeHammer, 1), new Object[] {"XXX", "XYX", " Y ", 'X', ScapecraftItems.bronzeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.bronzeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzePickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.bronzeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeShovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ScapecraftItems.bronzeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeSword, 1), new Object[] {" X ", " X ", " Y ", 'X', ScapecraftItems.bronzeIngot, 'Y', Items.stick});

		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithAxe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithBoots, 1), new Object[] { "X X", "X X", 'X', ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithHammer, 1), new Object[] {"XXX", "XYX", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithShovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithSword, 1), new Object[] {" X ", " X ", " Y ", 'X', ScapecraftItems.mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note1, 9), new Object[] {"X", 'X', ScapecraftItems.note2});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note2, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ScapecraftItems.note1});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeAxe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeBoots, 1), new Object[] { "X X", "X X", 'X', ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeChestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeHammer, 1), new Object[] {"XXX", "XYX", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeHelmet, 1), new Object[] {"XXX", "X X", 'X', ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeLeggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ScapecraftItems.runeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runePickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeShovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeSword, 1), new Object[] {" X ", " X ", " Y ", 'X', ScapecraftItems.runeIngot, 'Y', Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(ScapecraftItems.tombKey, 2), new Object[] {ScapecraftItems.ahrimKey, ScapecraftItems.akrisaeKey, ScapecraftItems.dharokKey, ScapecraftItems.karilKey, ScapecraftItems.guthanKey, ScapecraftItems.toragKey, ScapecraftItems.veracKey});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 9), new Object[] {"X", 'X', ScapecraftItems.note1});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.note1, 1), new Object[] {"XXX", "XXX", "XXX", 'X', Blocks.gold_block});
		GameRegistry.addShapelessRecipe(new ItemStack(ScapecraftItems.bronzeLump, 1), new Object[] {ScapecraftBlocks.copperOre, ScapecraftBlocks.tinOre});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithLump, 1), new Object[] {"XYX", 'X', Items.coal, 'Y', ScapecraftBlocks.mithOre});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyLump, 1), new Object[] {" X ", "XYX", " X ", 'X', Items.coal, 'Y', ScapecraftBlocks.addyOre});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeLump, 1), new Object[] {"XXX", "XYX", "XXX", 'X', Items.coal, 'Y', ScapecraftBlocks.runeOre});

		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.bronzeIngot, 9), new Object[] {"X", 'X', ScapecraftBlocks.bronzeBlock});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.bronzeBlock, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ScapecraftItems.bronzeIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.mithIngot, 9), new Object[] {"X", 'X', ScapecraftBlocks.mithBlock});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.mithBlock, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ScapecraftItems.mithIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.addyIngot, 9), new Object[] {"X", 'X', ScapecraftBlocks.addyBlock});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.addyBlock, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ScapecraftItems.addyIngot});
		GameRegistry.addRecipe(new ItemStack(ScapecraftItems.runeIngot, 9), new Object[] {"X", 'X', ScapecraftBlocks.runeBlock});
		GameRegistry.addRecipe(new ItemStack(ScapecraftBlocks.runeBlock, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ScapecraftItems.runeIngot});

		GameRegistry.addSmelting(ScapecraftItems.addyLump, new ItemStack(ScapecraftItems.addyIngot), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.applePieUncooked, new ItemStack(ScapecraftItems.applePie), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.cabbagePieUncooked, new ItemStack(ScapecraftItems.cabbagePie), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.fishPieUncooked, new ItemStack(ScapecraftItems.fishPie), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.meatPieUncooked, new ItemStack(ScapecraftItems.meatPie), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.bronzeLump, new ItemStack(ScapecraftItems.bronzeIngot), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.mithLump, new ItemStack(ScapecraftItems.mithIngot), 1.0F);
		GameRegistry.addSmelting(ScapecraftItems.runeLump, new ItemStack(ScapecraftItems.runeIngot), 1.0F);
	}
}
