package scapecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import scapecraft.tileentity.TileEntityBlockSpawner;

import cpw.mods.fml.common.registry.GameRegistry;

public class ScapecraftBlocks
{
	//TODO Some spawns have special stuff, like certain bosses
	public static Block barbarianSpawn;
	public static Block botSpawn;
	public static Block darkwizardSpawn;
	public static Block dwarfSpawn;
	public static Block goblinSpawn;
	public static Block guardSpawn;
	public static Block iceGiantSpawn;
	public static Block ironDragonSpawn;
	public static Block lesserSpawn;
	public static Block manSpawn;
	public static Block muggerSpawn;
	public static Block ratSpawn;
	public static Block smallRatSpawn;
	public static Block theifSpawn;
	public static Block whiteKnightSpawn;
	public static Block wizardSpawn;
	public static Block abbyDemonSpawn;
	public static Block blackDemonSpawn;
	public static Block blackDragonSpawn;
	public static Block blackKnightSpawn;
	public static Block caveCrawlerSpawn;
	public static Block fireGiantSpawn;
	public static Block ghostSpawn;
	public static Block greenDragonSpawn;
	public static Block hillGiantSpawn;
	public static Block kq2Spawn;
	public static Block mossGiantSpawn;
	public static Block scorpionSpawn;
	public static Block kingGuardSpawn;
	public static Block kosSpawn;
	public static Block tdSpawn;
	public static Block cookSpawn;
	public static Block doctorSpawn;
	public static Block fremGuardSpawn;
	public static Block morganSpawn;
	public static Block shopKeeperSpawn;
	public static Block varzeSpawn;
	public static Block blackGuard2Spawn;
	public static Block heroKnightSpawn;
	public static Block ahrimSpawn;
	public static Block akrisaeSpawn;
	public static Block dharokSpawn;
	public static Block eliteBlackKnightSpawn;
	public static Block guthanSpawn;
	public static Block karilSpawn;
	public static Block toragSpawn;
	public static Block veracSpawn;
	public static Block banditSpawn;
	public static Block highMageSpawn;
	public static Block kingSpawn;
	public static Block kqSpawn;
	public static Block kkSpawn;
	public static Block hellhoundSpawn;

	public static Block blueCobble;
	public static Block blueCobbleCompressed;

	public static Block addyOre;
	public static Block mithOre;
	public static Block runeOre;

	public static Block addyBlock;
	public static Block mithBlock;
	public static Block runeBlock;
	
	public static Block addyOreSpawn;
	public static Block mithOreSpawn;
	public static Block runeOreSpawn;
	public static Block coalOreSpawn;
	public static Block diamondOreSpawn;
	public static Block cobblestoneSpawn;
	public static Block redstoneOreSpawn;
	public static Block goldOreSpawn;
	public static Block emeraldOreSpawn;
	public static Block ironOreSpawn;
	public static Block sandstoneSpawn;
	public static Block sandSpawn;
	public static Block dirtSpawn;
	public static Block gravelSpawn;
	public static Block blueCobbleSpawn;

	public static Block miningLevelWall;
	public static Block agilityLevelWall;
	public static Block combatLevelWall;

	public static void registerBlocks()
	{
		barbarianSpawn = new BlockSpawn("EntityBarbarian", 0, true);
		botSpawn = new BlockSpawn("EntityBot", 0, true);
		darkwizardSpawn = new BlockSpawn("EntityDarkwizard", 0, true);
		dwarfSpawn = new BlockSpawn("EntityDwarf", 0, true);
		goblinSpawn = new BlockSpawn("EntityGoblin", 0, true);
		guardSpawn = new BlockSpawn("EntityGuard", 0, true);
		iceGiantSpawn = new BlockSpawn("EntityIceGiant", 0, true);
		//TODO there's something special with this one
		ironDragonSpawn = new BlockSpawn("EntityIronDragon", 0, true);
		lesserSpawn = new BlockSpawn("EntityLesserDemon", 0, true);
		manSpawn = new BlockSpawn("EntityMan", 0, true);
		muggerSpawn = new BlockSpawn("EntityMugger", 0, true);
		ratSpawn = new BlockSpawn("EntityRat", 0, true);
		smallRatSpawn = new BlockSpawn("EntityRatSmall", 0, true);
		theifSpawn = new BlockSpawn("EntityTheif", 0, true);
		whiteKnightSpawn = new BlockSpawn("EntityWhiteKnight", 0, true);
		wizardSpawn = new BlockSpawn("EntityWizard", 0, true);
		abbyDemonSpawn = new BlockSpawn("EntityAbbyDemon", 0, true);
		blackDemonSpawn = new BlockSpawn("EntityBlackDemon", 0, true);
		blackDragonSpawn = new BlockSpawn("EntityBlackDragon", 0, true);
		blackKnightSpawn = new BlockSpawn("EntityBlackKnight", 0, true);
		caveCrawlerSpawn = new BlockSpawn("EntityCaveCrawler", 0, true);
		fireGiantSpawn = new BlockSpawn("EntityFireGiant", 0, true);
		ghostSpawn = new BlockSpawn("EntityGhost", 0, true);
		greenDragonSpawn = new BlockSpawn("EntityGreenDragon", 0, true);
		hillGiantSpawn = new BlockSpawn("EntityHillGiant", 0, true);
		kq2Spawn = new BlockSpawn("EntityKQ2", 0, true);
		mossGiantSpawn = new BlockSpawn("EntityMossGiant", 0, true);
		scorpionSpawn = new BlockSpawn("EntityScorpion", 0, true);
		kingGuardSpawn = new BlockSpawn("EntityKingsGuard", 5, true);
		kosSpawn = new BlockSpawn("EntityKos1", 20);
		tdSpawn = new BlockSpawn("EntityTD", 20);
		cookSpawn = new BlockSpawn("EntityCook", 200);
		doctorSpawn = new BlockSpawn("EntityDoctor", 200);
		fremGuardSpawn = new BlockSpawn("EntityFremGuard", 200);
		morganSpawn = new BlockSpawn("EntityMorgan", 200);
		shopKeeperSpawn = new BlockSpawn("EntityShopKeeper", 200);
		varzeSpawn = new BlockSpawn("EntityVarze", 200);
		blackGuard2Spawn = new BlockSpawn("EntityBlackGuard2", 1800);
		heroKnightSpawn = new BlockSpawn("EntityHeroKnight", 4000);
		ahrimSpawn = new BlockSpawn("EntityAhrim", 6000);
		akrisaeSpawn = new BlockSpawn("EntityAkrisae", 6000);
		dharokSpawn = new BlockSpawn("EntityDharok", 6000);
		eliteBlackKnightSpawn = new BlockSpawn("EntityEliteBlackKnight", 6000);
		guthanSpawn = new BlockSpawn("EntityGuthan", 6000);
		karilSpawn = new BlockSpawn("EntityKaril", 6000);
		toragSpawn = new BlockSpawn("EntityTorag", 6000);
		veracSpawn = new BlockSpawn("EntityVerac", 6000);
		banditSpawn = new BlockSpawn("EntityBandit", 8000);
		highMageSpawn = new BlockSpawn("EntityHighMage", 12000);
		kingSpawn = new BlockSpawn("EntityKing", 12000);
		kqSpawn = new BlockSpawn("EntityKQ", 12000);
		kkSpawn = new BlockSpawn("EntityKK", 24000);
		hellhoundSpawn = new BlockSpawn("EntityHellhound", 72000);

		blueCobble = new BlockScapecraft(Material.rock).setTextureName("scapecraft:BlueCobblestone").setUnlocalizedName("blueCobble");
		blueCobbleCompressed = new BlockScapecraft(Material.rock).setTextureName("scapecraft:BlueCobblestonec").setUnlocalizedName("blueCobbleCompressed");

		mithOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:MithOre").setHardness(30.0F).setResistance(5.0F).setUnlocalizedName("mithOre");
		addyOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:AddyOre").setHardness(60.0F).setResistance(5.0F).setUnlocalizedName("addyOre");
		runeOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:RuneOre").setHardness(80.0F).setResistance(50.0F).setUnlocalizedName("runeOre");
		mithBlock = new BlockScapecraft(Material.rock).setBeaconBase(true).setTextureName("scapecraft:MithrilBlock").setHardness(30.0F).setResistance(5.0F).setUnlocalizedName("mithBlock");
		addyBlock = new BlockScapecraft(Material.rock).setBeaconBase(true).setTextureName("scapecraft:AdamantBlock").setHardness(60.0F).setResistance(25.0F).setUnlocalizedName("addyBlock");
		runeBlock = new BlockScapecraft(Material.rock).setBeaconBase(true).setTextureName("scapecraft:RuneBlock").setHardness(80.0F).setResistance(50.0F).setUnlocalizedName("runeBlock");

		mithOreSpawn = new BlockBlockSpawner(mithOre, 1200, 5);
		addyOreSpawn = new BlockBlockSpawner(addyOre, 2400, 10);
		runeOreSpawn = new BlockBlockSpawner(runeOre, 3600, 20);
		coalOreSpawn = new BlockBlockSpawner(Blocks.coal_ore, 120, 2);
		diamondOreSpawn = new BlockBlockSpawner(Blocks.diamond_ore, 1800, 8);
		redstoneOreSpawn = new BlockBlockSpawner(Blocks.redstone_ore, 600, 3);
		goldOreSpawn = new BlockBlockSpawner(Blocks.gold_ore, 1200, 4);
		ironOreSpawn = new BlockBlockSpawner(Blocks.iron_ore, 300, 2);
		emeraldOreSpawn = new BlockBlockSpawner(Blocks.emerald_ore, 4500, 25);
		cobblestoneSpawn = new BlockBlockSpawner(Blocks.cobblestone, 10, 1);
		sandstoneSpawn = new BlockBlockSpawner(Blocks.sandstone, 3);
		sandSpawn = new BlockBlockSpawner(Blocks.sand, 2);
		dirtSpawn = new BlockBlockSpawner(Blocks.dirt, 2);
		gravelSpawn = new BlockBlockSpawner(Blocks.gravel, 20);
		blueCobbleSpawn = new BlockBlockSpawner(blueCobble, 10800);

		addyOre.setHarvestLevel("pickaxe", 2);

		miningLevelWall = new BlockStatWall("miningLevel");
		agilityLevelWall = new BlockStatWall("agilityLevel");
		combatLevelWall = new BlockStatWall("combatLevel");

		GameRegistry.registerBlock(barbarianSpawn, "barbarianSpawn");
		GameRegistry.registerBlock(botSpawn, "botSpawn");
		GameRegistry.registerBlock(darkwizardSpawn, "darkwizardSpawn");
		GameRegistry.registerBlock(dwarfSpawn, "dwarfSpawn");
		GameRegistry.registerBlock(goblinSpawn, "goblinSpawn");
		GameRegistry.registerBlock(guardSpawn, "guardSpawn");
		GameRegistry.registerBlock(iceGiantSpawn, "iceGiantSpawn");
		GameRegistry.registerBlock(ironDragonSpawn, "ironDragonSpawn");
		GameRegistry.registerBlock(lesserSpawn, "lesserSpawn");
		GameRegistry.registerBlock(manSpawn, "manSpawn");
		GameRegistry.registerBlock(muggerSpawn, "muggerSpawn");
		GameRegistry.registerBlock(ratSpawn, "ratSpawn");
		GameRegistry.registerBlock(smallRatSpawn, "smallRatSpawn");
		GameRegistry.registerBlock(theifSpawn, "theifSpawn");
		GameRegistry.registerBlock(whiteKnightSpawn, "whiteKnightSpawn");
		GameRegistry.registerBlock(wizardSpawn, "wizardSpawn");
		GameRegistry.registerBlock(abbyDemonSpawn, "abbyDemonSpawn");
		GameRegistry.registerBlock(blackDemonSpawn, "blackDemonSpawn");
		GameRegistry.registerBlock(blackDragonSpawn, "blackDragonSpawn");
		GameRegistry.registerBlock(blackKnightSpawn, "blackKnightSpawn");
		GameRegistry.registerBlock(caveCrawlerSpawn, "caveCrawlerSpawn");
		GameRegistry.registerBlock(fireGiantSpawn, "fireGiantSpawn");
		GameRegistry.registerBlock(ghostSpawn, "ghostSpawn");
		GameRegistry.registerBlock(greenDragonSpawn, "greenDragonSpawn");
		GameRegistry.registerBlock(hillGiantSpawn, "hillGiantSpawn");
		GameRegistry.registerBlock(kq2Spawn, "kq2Spawn");
		GameRegistry.registerBlock(mossGiantSpawn, "mossGiantSpawn");
		GameRegistry.registerBlock(scorpionSpawn, "scorpionSpawn");
		GameRegistry.registerBlock(kingGuardSpawn, "kingGuardSpawn");
		GameRegistry.registerBlock(kosSpawn, "kosSpawn");
		GameRegistry.registerBlock(tdSpawn, "tdSpawn");
		GameRegistry.registerBlock(cookSpawn, "cookSpawn");
		GameRegistry.registerBlock(doctorSpawn, "doctorSpawn");
		GameRegistry.registerBlock(fremGuardSpawn, "fremGuardSpawn");
		GameRegistry.registerBlock(morganSpawn, "morganSpawn");
		GameRegistry.registerBlock(shopKeeperSpawn, "shopKeeperSpawn");
		GameRegistry.registerBlock(varzeSpawn, "varzeSpawn");
		GameRegistry.registerBlock(blackGuard2Spawn, "blackGuard2Spawn");
		GameRegistry.registerBlock(heroKnightSpawn, "heroKnightSpawn");
		GameRegistry.registerBlock(ahrimSpawn, "ahrimSpawn");
		GameRegistry.registerBlock(akrisaeSpawn, "akrisaeSpawn");
		GameRegistry.registerBlock(dharokSpawn, "dharokSpawn");
		GameRegistry.registerBlock(eliteBlackKnightSpawn, "eliteBlackKnightSpawn");
		GameRegistry.registerBlock(guthanSpawn, "guthanSpawn");
		GameRegistry.registerBlock(karilSpawn, "karilSpawn");
		GameRegistry.registerBlock(toragSpawn, "toragSpawn");
		GameRegistry.registerBlock(veracSpawn, "veracSpawn");
		GameRegistry.registerBlock(banditSpawn, "banditSpawn");
		GameRegistry.registerBlock(highMageSpawn, "highMageSpawn");
		GameRegistry.registerBlock(kingSpawn, "kingSpawn");
		GameRegistry.registerBlock(kqSpawn, "kqSpawn");
		GameRegistry.registerBlock(kkSpawn, "kkSpawn");
		GameRegistry.registerBlock(hellhoundSpawn, "hellhoundSpawn");

		GameRegistry.registerBlock(blueCobble, "blueCobble");

		GameRegistry.registerBlock(addyOre, "addyOre");
		GameRegistry.registerBlock(mithOre, "mithOre");
		GameRegistry.registerBlock(runeOre, "runeOre");

		GameRegistry.registerBlock(addyBlock, "addyBlock");
		GameRegistry.registerBlock(mithBlock, "mithBlock");
		GameRegistry.registerBlock(runeBlock, "runeBlock");

		GameRegistry.registerBlock(addyOreSpawn, "addyOreSpawn");
		GameRegistry.registerBlock(mithOreSpawn, "mithOreSpawn");
		GameRegistry.registerBlock(runeOreSpawn, "runeOreSpawn");
		GameRegistry.registerBlock(coalOreSpawn, "coalOreSpawn");
		GameRegistry.registerBlock(diamondOreSpawn, "diamondOreSpawn");
		GameRegistry.registerBlock(cobblestoneSpawn, "cobblestoneSpawn");
		GameRegistry.registerBlock(redstoneOreSpawn, "redstoneOreSpawn");
		GameRegistry.registerBlock(goldOreSpawn, "goldOreSpawn");
		GameRegistry.registerBlock(emeraldOreSpawn, "emeraldOreSpawn");
		GameRegistry.registerBlock(ironOreSpawn, "ironOreSpawn");
		GameRegistry.registerBlock(sandstoneSpawn, "sandstoneSpawn");
		GameRegistry.registerBlock(sandSpawn, "sandSpawn");
		GameRegistry.registerBlock(dirtSpawn, "dirtSpawn");
		GameRegistry.registerBlock(gravelSpawn, "gravelSpawn");
		GameRegistry.registerBlock(blueCobbleSpawn, "blueCobbleSpawn");

		GameRegistry.registerBlock(miningLevelWall, "miningLevelWall");
		GameRegistry.registerBlock(agilityLevelWall, "agilityLevelWall");
		GameRegistry.registerBlock(combatLevelWall, "combatLevelWall");

		Item.getItemFromBlock(addyOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(mithOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(runeOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(coalOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(diamondOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(cobblestoneSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(redstoneOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(goldOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(emeraldOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(ironOreSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(sandstoneSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(sandSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(dirtSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(gravelSpawn).setHasSubtypes(true);
		Item.getItemFromBlock(blueCobbleSpawn).setHasSubtypes(true);

		Item.getItemFromBlock(miningLevelWall).setHasSubtypes(true);
		Item.getItemFromBlock(agilityLevelWall).setHasSubtypes(true);
		Item.getItemFromBlock(combatLevelWall).setHasSubtypes(true);

		GameRegistry.registerTileEntity(TileEntityBlockSpawner.class, "blockSpawner");
	}
}
