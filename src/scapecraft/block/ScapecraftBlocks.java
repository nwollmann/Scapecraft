package scapecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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

	public static Block addyOre;
	public static Block mithOre;
	public static Block runeOre;
	
	public static Block addyOreSpawn, coalOreSpawn, diamondOreSpawn, mithOreSpawn, runeOreSpawn;

	public static void registerBlocks()
	{
		barbarianSpawn = new BlockSpawn("EntityBarbarian", 0, true).setUnlocalizedName("barbarianSpawn");
		botSpawn = new BlockSpawn("EntityBot", 0, true).setUnlocalizedName("botSpawn");
		darkwizardSpawn = new BlockSpawn("EntityDarkwizard", 0, true).setUnlocalizedName("darkwizardSpawn");
		dwarfSpawn = new BlockSpawn("EntityDwarf", 0, true).setUnlocalizedName("dwarfSpawn");
		goblinSpawn = new BlockSpawn("EntityGoblin", 0, true).setUnlocalizedName("goblinSpawn");
		guardSpawn = new BlockSpawn("EntityGuard", 0, true).setUnlocalizedName("guardSpawn");
		iceGiantSpawn = new BlockSpawn("EntityIceGiant", 0, true).setUnlocalizedName("iceGiantSpawn");
		//TODO there's something special with this one
		ironDragonSpawn = new BlockSpawn("EntityIronDragon", 0, true).setUnlocalizedName("ironDragonSpawn");
		lesserSpawn = new BlockSpawn("EntityLesserDemon", 0, true).setUnlocalizedName("lesserSpawn");
		manSpawn = new BlockSpawn("EntityMan", 0, true).setUnlocalizedName("manSpawn");
		muggerSpawn = new BlockSpawn("EntityMugger", 0, true).setUnlocalizedName("muggerSpawn");
		ratSpawn = new BlockSpawn("EntityRat", 0, true).setUnlocalizedName("ratSpawn");
		smallRatSpawn = new BlockSpawn("EntityRatSmall", 0, true).setUnlocalizedName("smallRatSpawn");
		theifSpawn = new BlockSpawn("EntityTheif", 0, true).setUnlocalizedName("theifSpawn");
		whiteKnightSpawn = new BlockSpawn("EntityWhiteKnight", 0, true).setUnlocalizedName("whiteKnightSpawn");
		wizardSpawn = new BlockSpawn("EntityWizard", 0, true).setUnlocalizedName("wizardSpawn");
		abbyDemonSpawn = new BlockSpawn("EntityAbbyDemon", 0, true).setUnlocalizedName("abbyDemonSpawn");
		blackDemonSpawn = new BlockSpawn("EntityBlackDemon", 0, true).setUnlocalizedName("blackDemonSpawn");
		blackDragonSpawn = new BlockSpawn("EntityBlackDragon", 0, true).setUnlocalizedName("blackDragonSpawn");
		blackKnightSpawn = new BlockSpawn("EntityBlackKnight", 0, true).setUnlocalizedName("blackKnightSpawn");
		caveCrawlerSpawn = new BlockSpawn("EntityCaveCrawler", 0, true).setUnlocalizedName("caveCrawlerSpawn");
		fireGiantSpawn = new BlockSpawn("EntityFireGiant", 0, true).setUnlocalizedName("fireGiantSpawn");
		ghostSpawn = new BlockSpawn("EntityGhost", 0, true).setUnlocalizedName("ghostSpawn");
		greenDragonSpawn = new BlockSpawn("EntityGreenDragon", 0, true).setUnlocalizedName("greenDragonSpawn");
		hillGiantSpawn = new BlockSpawn("EntityHillGiant", 0, true).setUnlocalizedName("hillGiantSpawn");
		kq2Spawn = new BlockSpawn("EntityKQ2", 0, true).setUnlocalizedName("kq2Spawn");
		mossGiantSpawn = new BlockSpawn("EntityMossGiant", 0, true).setUnlocalizedName("mossGiantSpawn");
		scorpionSpawn = new BlockSpawn("EntityScorpion", 0, true).setUnlocalizedName("scorpionSpawn");
		kingGuardSpawn = new BlockSpawn("EntityKingsGuard", 5, true).setUnlocalizedName("kingGuardSpawn");
		kosSpawn = new BlockSpawn("EntityKos1", 20).setUnlocalizedName("kosSpawn");
		tdSpawn = new BlockSpawn("EntityTD", 20).setUnlocalizedName("tdSpawn");
		cookSpawn = new BlockSpawn("EntityCook", 200).setUnlocalizedName("cookSpawn");
		doctorSpawn = new BlockSpawn("EntityDoctor", 200).setUnlocalizedName("doctorSpawn");
		fremGuardSpawn = new BlockSpawn("EntityFremGuard", 200).setUnlocalizedName("fremGuardSpawn");
		morganSpawn = new BlockSpawn("EntityMorgan", 200).setUnlocalizedName("morganSpawn");
		shopKeeperSpawn = new BlockSpawn("EntityShopKeeper", 200).setUnlocalizedName("shopKeeperSpawn");
		varzeSpawn = new BlockSpawn("EntityVarze", 200).setUnlocalizedName("varzeSpawn");
		blackGuard2Spawn = new BlockSpawn("EntityBlackGuard2", 1800).setUnlocalizedName("blackGuard2Spawn");
		heroKnightSpawn = new BlockSpawn("EntityHeroKnight", 4000).setUnlocalizedName("heroKnightSpawn");
		ahrimSpawn = new BlockSpawn("EntityAhrim", 6000).setUnlocalizedName("ahrimSpawn");
		akrisaeSpawn = new BlockSpawn("EntityAkrisae", 6000).setUnlocalizedName("akrisaeSpawn");
		dharokSpawn = new BlockSpawn("EntityDharok", 6000).setUnlocalizedName("dharokSpawn");
		eliteBlackKnightSpawn = new BlockSpawn("EntityEliteBlackKnight", 6000).setUnlocalizedName("eliteBlackKnightSpawn");
		guthanSpawn = new BlockSpawn("EntityGuthan", 6000).setUnlocalizedName("guthanSpawn");
		karilSpawn = new BlockSpawn("EntityKaril", 6000).setUnlocalizedName("karilSpawn");
		toragSpawn = new BlockSpawn("EntityTorag", 6000).setUnlocalizedName("toragSpawn");
		veracSpawn = new BlockSpawn("EntityVerac", 6000).setUnlocalizedName("veracSpawn");
		banditSpawn = new BlockSpawn("EntityBandit", 8000).setUnlocalizedName("banditSpawn");
		highMageSpawn = new BlockSpawn("EntityHighMage", 12000).setUnlocalizedName("highMageSpawn");
		kingSpawn = new BlockSpawn("EntityKing", 12000).setUnlocalizedName("kingSpawn");
		kqSpawn = new BlockSpawn("EntityKQ", 12000).setUnlocalizedName("kqSpawn");
		kkSpawn = new BlockSpawn("EntityKK", 24000).setUnlocalizedName("kkSpawn");
		hellhoundSpawn = new BlockSpawn("EntityHellhound", 72000).setUnlocalizedName("hellhoundSpawn");

		addyOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:addyOre").setHardness(30.0F).setResistance(5.0F).setUnlocalizedName("addyOre");
		mithOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:mithOre").setHardness(60.0F).setResistance(5.0F).setUnlocalizedName("mithOre");
		runeOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:runeOre").setHardness(80.0F).setResistance(50.0F).setUnlocalizedName("runeOre");

		addyOre.setHarvestLevel("pickaxe", 2);

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

		GameRegistry.registerBlock(addyOre, "addyOre");
		GameRegistry.registerBlock(mithOre, "mithOre");
		GameRegistry.registerBlock(runeOre, "runeOre");

	}
}
