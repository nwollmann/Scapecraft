package scapecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.MinecraftForge;

import scapecraft.block.BlockScapecraft;
import scapecraft.block.BlockSpawn;
import scapecraft.client.ClientProxy;
import scapecraft.entity.EntityAbbyDemon;
import scapecraft.entity.EntityAhrim;
import scapecraft.entity.EntityAkrisae;
import scapecraft.entity.EntityBandit;
import scapecraft.entity.EntityBarbarian;
import scapecraft.entity.EntityBlackDemon;
import scapecraft.entity.EntityBlackDragon;
import scapecraft.entity.EntityBlackGuard;
import scapecraft.entity.EntityBlackGuard2;
import scapecraft.entity.EntityBlackKnight;
import scapecraft.entity.EntityBot;
import scapecraft.entity.EntityBot2;
import scapecraft.entity.EntityBot3;
import scapecraft.entity.EntityCaveCrawler;
import scapecraft.entity.EntityCook;
import scapecraft.entity.EntityDarkwizard;
import scapecraft.entity.EntityDharok;
import scapecraft.entity.EntityDoctor;
import scapecraft.entity.EntityDwarf;
import scapecraft.entity.EntityEliteBlackKnight;
import scapecraft.entity.EntityFarmer;
import scapecraft.entity.EntityFireGiant;
import scapecraft.entity.EntityFremGuard;
import scapecraft.entity.EntityGeneralGraardor;
import scapecraft.entity.EntityGhost;
import scapecraft.entity.EntityGoblin;
import scapecraft.entity.EntityGreenDragon;
import scapecraft.entity.EntityGuard;
import scapecraft.entity.EntityGuthan;
import scapecraft.entity.EntityHellhound;
import scapecraft.entity.EntityHeroKnight;
import scapecraft.entity.EntityHighMage;
import scapecraft.entity.EntityHillGiant;
import scapecraft.entity.EntityIceGiant;
import scapecraft.entity.EntityIronDragon;
import scapecraft.entity.EntityKK;
import scapecraft.entity.EntityKKspawn;
import scapecraft.entity.EntityKQ;
import scapecraft.entity.EntityKQ2;
import scapecraft.entity.EntityKaril;
import scapecraft.entity.EntityKing;
import scapecraft.entity.EntityKingsGuard;
import scapecraft.entity.EntityKos1;
import scapecraft.entity.EntityKos2;
import scapecraft.entity.EntityKos3;
import scapecraft.entity.EntityKos4;
import scapecraft.entity.EntityLavaBlock;
import scapecraft.entity.EntityLesserDemon;
import scapecraft.entity.EntityLesserDemon2;
import scapecraft.entity.EntityLootChest;
import scapecraft.entity.EntityMagicBoat;
import scapecraft.entity.EntityMan;
import scapecraft.entity.EntityMorgan;
import scapecraft.entity.EntityMossGiant;
import scapecraft.entity.EntityMugger;
import scapecraft.entity.EntityRat;
import scapecraft.entity.EntityRatSmall;
import scapecraft.entity.EntityScapecraft;
import scapecraft.entity.EntityScorpion;
import scapecraft.entity.EntitySergeantGrimspike;
import scapecraft.entity.EntitySergeantSteelwill;
import scapecraft.entity.EntitySergeantStrongstack;
import scapecraft.entity.EntityShopKeeper;
import scapecraft.entity.EntityTD;
import scapecraft.entity.EntityTNTXPrimed;
import scapecraft.entity.EntityTheif;
import scapecraft.entity.EntityTinyTNTPrimed;
import scapecraft.entity.EntityTorag;
import scapecraft.entity.EntityVampire;
import scapecraft.entity.EntityVarze;
import scapecraft.entity.EntityVerac;
import scapecraft.entity.EntityWhiteKnight;
import scapecraft.entity.EntityWizard;
import scapecraft.item.ItemArmorBandos;
import scapecraft.item.ItemArmorScapecraft;
import scapecraft.item.ItemHammer;
import scapecraft.item.ItemSetWeapon;
import scapecraft.item.ItemSpecialWeapon;
import scapecraft.item.ItemWeapon;
import scapecraft.item.ScapecraftArmorMaterial;
import scapecraft.item.ScapecraftToolMaterial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Scapecraft", name = "Scapecraft")
public class Scapecraft
{
	public static SimpleNetworkWrapper netHandler = NetworkRegistry.INSTANCE.newSimpleChannel("Scapecraft");

	/*start armor*/
	public static final CreativeTabs tabScapecraftArmor = new CreativeTabs("tabScapecraftArmor")
	{
		@Override
		public Item getTabIconItem()
		{
			return phatHelmet;
		}
	};

	public static final Item santaHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.SANTA, 0, 0,"santa");

	public static final Item phatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.PHAT, 0, 0,"phat");

	public static final Item wphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.WPHAT, 0, 0,"whitephat");

	public static final Item yphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.YPHAT, 0, 0,"yellowphat");

	public static final Item gphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GPHAT, 0, 0,"greenphat");

	public static final Item rphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RPHAT, 0, 0,"redphat");

	public static final Item pphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.PPHAT, 0, 0,"purplephat");

	public static final Item dragonHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 0, 0,"dragon");
	public static final Item dragonChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON,1, 1,"dragon");
	public static final Item dragonLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 2, 2,"dragon");
	public static final Item dragonBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 3, 3,"dragon");

	public static final Item blackHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 0, 0,"black");
	public static final Item blackChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK,1, 1,"black");
	public static final Item blackLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 2, 2,"black");
	public static final Item blackBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 3, 3,"black");

	public static final Item whiteHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 0, 0,"white");
	public static final Item whiteChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE,1, 1,"white");
	public static final Item whiteLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 2, 2,"white");
	public static final Item whiteBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 3, 3,"white");

	public static final Item guardHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 0, 0,"guard");
	public static final Item guardChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD,1, 1,"guard");
	//public static final Item guardLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 2, 2,"guard");
	//public static final Item guardBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 3, 3,"guard");

	public static final Item mithHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 0, 0,"mith");
	public static final Item mithChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH,1, 1,"mith");
	public static final Item mithLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 2, 2,"mith");
	public static final Item mithBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 3, 3,"mith");

	public static final Item addyHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 0, 0,"addy");
	public static final Item addyChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY,1, 1,"addy");
	public static final Item addyLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 2, 2,"addy");
	public static final Item addyBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 3, 3,"addy");

	public static final Item runeHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 0, 0,"rune");
	public static final Item runeChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE,1, 1,"rune");
	public static final Item runeLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 2, 2,"rune");
	public static final Item runeBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 3, 3,"rune");

	public static final Item runegHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 0, 0,"runeg");
	public static final Item runegChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG,1, 1,"runeg");
	public static final Item runegLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 2, 2,"runeg");
	public static final Item runegBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 3, 3,"runeg");

	public static final Item graniteHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 0, 0,"granite");
	public static final Item graniteChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE,1, 1,"granite");
	public static final Item graniteLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 2, 2,"granite");
	public static final Item graniteBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 3, 3,"granite");

	public static final Item blackgHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 0, 0,"blackg");
	public static final Item blackgChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG,1, 1,"blackg");
	public static final Item blackgLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 2, 2,"blackg");
	public static final Item blackgBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 3, 3,"blackg");

	public static final Item toragHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 0, 0,"Torag");
	public static final Item toragChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG,1, 1,"Torag");
	public static final Item toragLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 2, 2,"Torag");
	public static final Item toragBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 3, 3,"Torag");

	public static final Item veracHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 0, 0,"Verac");
	public static final Item veracChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC,1, 1,"Verac");
	public static final Item veracLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 2, 2,"Verac");
	public static final Item veracBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 3, 3,"Verac");

	public static final Item guthanHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 0, 0,"Guthan");
	public static final Item guthanChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN,1, 1,"Guthan");
	public static final Item guthanLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 2, 2,"Guthan");
	public static final Item guthanBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 3, 3,"Guthan");

	public static final Item dharokHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 0, 0,"Dharok");
	public static final Item dharokChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK,1, 1,"Dharok");
	public static final Item dharokLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 2, 2,"Dharok");
	public static final Item dharokBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 3, 3,"Dharok");

	public static final Item karilHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 0, 0,"Karil");
	public static final Item karilChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL,1, 1,"Karil");
	public static final Item karilLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 2, 2,"Karil");
	public static final Item karilBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 3, 3,"Karil");

	public static final Item ahrimHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 0, 0,"Ahrim");
	public static final Item ahrimChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM,1, 1,"Ahrim");
	public static final Item ahrimLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 2, 2,"Ahrim");
	public static final Item ahrimBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 3, 3,"Ahrim");

	public static final Item akrisaeHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 0, 0,"Akrisae");
	public static final Item akrisaeChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE,1, 1,"Akrisae");
	public static final Item akrisaeLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 2, 2,"Akrisae");
	public static final Item akrisaeBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 3, 3,"Akrisae");


	public static final Item greendHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 0, 0,"greend");
	public static final Item greendChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND,1, 1,"greend");
	public static final Item greendLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 2, 2,"greend");
	public static final Item greendBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 3, 3,"greend");

	public static final Item blackdHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 0, 0,"blackd");
	public static final Item blackdChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD,1, 1,"blackd");
	public static final Item blackdLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 2, 2,"blackd");
	public static final Item blackdBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 3, 3,"blackd");


	public static final Item dragonlHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 0, 0,"dragonl");
	public static final Item dragonlChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL,1, 1,"dragonl");
	public static final Item dragonlLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 2, 2,"dragonl");
	public static final Item dragonlBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 3, 3,"dragonl");

	public static final Item bandosHelmet = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 0, 0,"Bandos");
	public static final Item bandosChestplate = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS,1, 1,"Bandos");
	public static final Item bandosLeggings = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 2, 2,"Bandos");
	public static final Item bandosBoots = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 3, 3,"Bandos");
	public static final Item stoneHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 0, 0,"stone");
	public static final Item stoneChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE,1, 1,"stone");
	public static final Item stoneLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 2, 2,"stone");
	public static final Item stoneBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 3, 3,"stone");


	public static final Item dragonCHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 0, 0,"dragonC");
	public static final Item dragonCChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON,1, 1,"dragonC");
	public static final Item dragonCLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 2, 2,"dragonC");
	public static final Item dragonCBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 3, 3,"dragonC");
	/*end armor*/

	public static final CreativeTabs tabScapecraftBlock = new CreativeTabs("tabScapecraftBlock")
	{
		@Override
		public Item getTabIconItem()
		{
			return phatHelmet;
		}
	};

	public static final Block barbarianSpawn = new BlockSpawn(EntityBarbarian.class, 0, true).setBlockName("barbarianSpawn");
	public static final Block botSpawn = new BlockSpawn(EntityBot.class, 0, true).setBlockName("botSpawn");
	public static final Block darkwizardSpawn = new BlockSpawn(EntityDarkwizard.class, 0, true).setBlockName("darkwizardSpawn");
	public static final Block dwarfSpawn = new BlockSpawn(EntityDwarf.class, 0, true).setBlockName("dwarfSpawn");
	public static final Block goblinSpawn = new BlockSpawn(EntityGoblin.class, 0, true).setBlockName("goblinSpawn");
	public static final Block guardSpawn = new BlockSpawn(EntityGuard.class, 0, true).setBlockName("guardSpawn");
	public static final Block iceGiantSpawn = new BlockSpawn(EntityIceGiant.class, 0, true).setBlockName("iceGiantSpawn");
	//TODO there's something special with this one
	public static final Block ironDragonSpawn = new BlockSpawn(EntityIronDragon.class, 0, true).setBlockName("ironDragonSpawn");
	public static final Block lesserSpawn = new BlockSpawn(EntityLesserDemon.class, 0, true).setBlockName("lesserSpawn");
	public static final Block manSpawn = new BlockSpawn(EntityMan.class, 0, true).setBlockName("manSpawn");
	public static final Block muggerSpawn = new BlockSpawn(EntityMugger.class, 0, true).setBlockName("muggerSpawn");
	public static final Block ratSpawn = new BlockSpawn(EntityRat.class, 0, true).setBlockName("ratSpawn");
	public static final Block smallRatSpawn = new BlockSpawn(EntityRatSmall.class, 0, true).setBlockName("smallRatSpawn");
	public static final Block theifSpawn = new BlockSpawn(EntityTheif.class, 0, true).setBlockName("theifSpawn");
	public static final Block whiteKnightSpawn = new BlockSpawn(EntityWhiteKnight.class, 0, true).setBlockName("whiteKnightSpawn");
	public static final Block wizardSpawn = new BlockSpawn(EntityWizard.class, 0, true).setBlockName("wizardSpawn");
	public static final Block abbyDemonSpawn = new BlockSpawn(EntityAbbyDemon.class, 0, true).setBlockName("abbyDemonSpawn");
	public static final Block blackDemonSpawn = new BlockSpawn(EntityBlackDemon.class, 0, true).setBlockName("blackDemonSpawn");
	public static final Block blackDragonSpawn = new BlockSpawn(EntityBlackDragon.class, 0, true).setBlockName("blackDragonSpawn");
	public static final Block blackKnightSpawn = new BlockSpawn(EntityBlackKnight.class, 0, true).setBlockName("blackKnightSpawn");
	public static final Block caveCrawlerSpawn = new BlockSpawn(EntityCaveCrawler.class, 0, true).setBlockName("caveCrawlerSpawn");
	public static final Block fireGiantSpawn = new BlockSpawn(EntityFireGiant.class, 0, true).setBlockName("fireGiantSpawn");
	public static final Block ghostSpawn = new BlockSpawn(EntityGhost.class, 0, true).setBlockName("ghostSpawn");
	public static final Block greenDragonSpawn = new BlockSpawn(EntityGreenDragon.class, 0, true).setBlockName("greenDragonSpawn");
	public static final Block hillGiantSpawn = new BlockSpawn(EntityHillGiant.class, 0, true).setBlockName("hillGiantSpawn");
	public static final Block kq2Spawn = new BlockSpawn(EntityKQ2.class, 0, true).setBlockName("kq2Spawn");
	public static final Block mossGiantSpawn = new BlockSpawn(EntityMossGiant.class, 0, true).setBlockName("mossGiantSpawn");
	public static final Block scorpionSpawn = new BlockSpawn(EntityScorpion.class, 0, true).setBlockName("scorpionSpawn");
	public static final Block kingGuardSpawn = new BlockSpawn(EntityKingsGuard.class, 5, true).setBlockName("kingGuardSpawn");
	public static final Block kosSpawn = new BlockSpawn(EntityKos1.class, 20).setBlockName("kosSpawn");
	public static final Block tdSpawn = new BlockSpawn(EntityTD.class, 20).setBlockName("tdSpawn");
	public static final Block cookSpawn = new BlockSpawn(EntityCook.class, 200).setBlockName("cookSpawn");
	public static final Block doctorSpawn = new BlockSpawn(EntityDoctor.class, 200).setBlockName("doctorSpawn");
	public static final Block fremGuardSpawn = new BlockSpawn(EntityFremGuard.class, 200).setBlockName("fremGuardSpawn");
	public static final Block morganSpawn = new BlockSpawn(EntityMorgan.class, 200).setBlockName("morganSpawn");
	public static final Block shopKeeperSpawn = new BlockSpawn(EntityShopKeeper.class, 200).setBlockName("shopKeeperSpawn");
	public static final Block varzeSpawn = new BlockSpawn(EntityVarze.class, 200).setBlockName("varzeSpawn");
	public static final Block blackGuard2Spawn = new BlockSpawn(EntityBlackGuard2.class, 1800).setBlockName("blackGuard2Spawn");
	public static final Block heroKnightSpawn = new BlockSpawn(EntityHeroKnight.class, 4000).setBlockName("heroKnightSpawn");
	public static final Block ahrimSpawn = new BlockSpawn(EntityAhrim.class, 6000).setBlockName("ahrimSpawn");
	public static final Block akrisaeSpawn = new BlockSpawn(EntityAkrisae.class, 6000).setBlockName("akrisaeSpawn");
	public static final Block dharokSpawn = new BlockSpawn(EntityDharok.class, 6000).setBlockName("dharokSpawn");
	public static final Block eliteBlackKnightSpawn = new BlockSpawn(EntityEliteBlackKnight.class, 6000).setBlockName("eliteBlackKnightSpawn");
	public static final Block guthanSpawn = new BlockSpawn(EntityGuthan.class, 6000).setBlockName("guthanSpawn");
	public static final Block karilSpawn = new BlockSpawn(EntityKaril.class, 6000).setBlockName("karilSpawn");
	public static final Block toragSpawn = new BlockSpawn(EntityTorag.class, 6000).setBlockName("toragSpawn");
	public static final Block veracSpawn = new BlockSpawn(EntityVerac.class, 6000).setBlockName("veracSpawn");
	public static final Block banditSpawn = new BlockSpawn(EntityBandit.class, 8000).setBlockName("banditSpawn");
	public static final Block highMageSpawn = new BlockSpawn(EntityHighMage.class, 12000).setBlockName("highMageSpawn");
	public static final Block kingSpawn = new BlockSpawn(EntityKing.class, 12000).setBlockName("kingSpawn");
	public static final Block kqSpawn = new BlockSpawn(EntityKQ.class, 12000).setBlockName("kqSpawn");
	public static final Block kkSpawn = new BlockSpawn(EntityKK.class, 24000).setBlockName("kkSpawn");
	public static final Block hellhoundSpawn = new BlockSpawn(EntityHellhound.class, 72000).setBlockName("hellhoundSpawn");

	public static final Block addyOre = new BlockScapecraft(Material.rock).setBlockTextureName("scapecraft:AddyOre").setHardness(30.0F).setResistance(5.0F).setBlockName("addyOre");
	public static final Block mithOre = new BlockScapecraft(Material.rock).setBlockTextureName("scapecraft:MithOre").setHardness(60.0F).setResistance(5.0F).setBlockName("mithOre");
	public static final Block runeOre = new BlockScapecraft(Material.rock).setBlockTextureName("scapecraft:RuneOre").setHardness(80.0F).setResistance(50.0F).setBlockName("runeOre");

	public static final CreativeTabs tabScapecraftWeapon = new CreativeTabs("tabScapecraftWeapon")
	{
		@Override
		public Item getTabIconItem()
		{
			return phatHelmet;
		}
	};

	public static final Item mithSword = new ItemWeapon(ScapecraftToolMaterial.MITH, 4, "MithSword");
	public static final Item addySword = new ItemWeapon(ScapecraftToolMaterial.ADDY, 4, "AddySword");
	public static final Item runeSword = new ItemWeapon(ScapecraftToolMaterial.RUNE, 4, "RuneSword");
	public static final Item blackSword = new ItemWeapon(ScapecraftToolMaterial.BLACK, 4, "BlackSword");
	public static final Item whiteSword = new ItemWeapon(ScapecraftToolMaterial.BLACK, 4, "WhiteSword");
	public static final Item blackHalberd = new ItemWeapon(ScapecraftToolMaterial.BLACKH, 4, "BlackHalberd");
	public static final Item chicken = new ItemWeapon(ScapecraftToolMaterial.CHICKEN, 4, "Chicken");
	public static final Item D2H = new ItemWeapon(ScapecraftToolMaterial.WHIP, 4, "D2H");
	public static final Item dragonLongsword = new ItemWeapon(ScapecraftToolMaterial.DRAGON, 4, "DragonLongsword");
	public static final Item dragonCScimmy = new ItemWeapon(ScapecraftToolMaterial.DRAGONC, 4, "DragonCScimmy");
	public static final Item pitchFork = new ItemWeapon(ScapecraftToolMaterial.PITCHFORK, 4, "PitchFork");

	public static final Item steelHammer = new ItemHammer(ScapecraftToolMaterial.STEEL, "SteelHammer");
	public static final Item mithHammer = new ItemHammer(ScapecraftToolMaterial.MITH, "MithHammer");
	public static final Item addyHammer = new ItemHammer(ScapecraftToolMaterial.ADDY, "AddyHammer");
	public static final Item runeHammer = new ItemHammer(ScapecraftToolMaterial.RUNE, "RuneHammer");

	public static final Item whip = new ItemSpecialWeapon(ScapecraftToolMaterial.WHIP, 4F, "Whip", 5000);
	public static final Item dragonScimmy = new ItemSpecialWeapon(ScapecraftToolMaterial.DRAGONS, 5F, "DragonScimmy", 5500);

	public static final Item toragHammer = new ItemSetWeapon(ScapecraftToolMaterial.TORAG, ScapecraftArmorMaterial.TORAG, "ToragHammerinv");
	public static final Item veracFlail = new ItemSetWeapon(ScapecraftToolMaterial.VERAC, ScapecraftArmorMaterial.VERAC, "VeracFlailinv");
	public static final Item guthanSpear = new ItemSetWeapon(ScapecraftToolMaterial.GUTHAN, ScapecraftArmorMaterial.GUTHAN, "GuthanSpearinv");
	public static final Item dharokAxe = new ItemSetWeapon(ScapecraftToolMaterial.DHAROK, ScapecraftArmorMaterial.DHAROK, "DharokAxeinv");
	public static final Item akrisaeMace = new ItemSetWeapon(ScapecraftToolMaterial.AKRISAE, ScapecraftArmorMaterial.AKRISAE, "AkrisaeMaceinv");

	public static final CreativeTabs tabScapecraftMisc = new CreativeTabs("tabScapecraftMisc")
	{
		@Override
		public Item getTabIconItem()
		{
			return questPoint;
		}
	};

	public static final Item mithlump = new Item().setTextureName("scapecraft:mithlump").setUnlocalizedName("mithlump");
	public static final Item addylump = new Item().setTextureName("scapecraft:Addylump").setUnlocalizedName("addylump");
	public static final Item runelump = new Item().setTextureName("scapecraft:Runelump").setUnlocalizedName("runelump");
	public static final Item mithingot = new Item().setTextureName("scapecraft:mithingot").setUnlocalizedName("mithingot");
	public static final Item addyingot = new Item().setTextureName("scapecraft:Addyingot").setUnlocalizedName("addyingot");
	public static final Item runeingot = new Item().setTextureName("scapecraft:Runeingot").setUnlocalizedName("runeingot");
	public static final Item graniteLump = new Item().setUnlocalizedName("graniteLump").setTextureName("scapecraft:GraniteLump").setCreativeTab(tabScapecraftMisc);
	public static final Item magicFruit = new ItemFood(20, false).setUnlocalizedName("magicFruit").setTextureName("scapecraft:MagicFruit").setCreativeTab(tabScapecraftMisc);
	public static final Item saradominHilt = new ItemFood(20, false).setUnlocalizedName("saradominHilt").setTextureName("scapecraft:MagicFruit").setCreativeTab(tabScapecraftMisc);
	public static final Item cabbagepieuncooked = new Item().setUnlocalizedName("cabbagepieuncooked").setTextureName("scapecraft:CabbagePie").setCreativeTab(tabScapecraftMisc);
	public static final Item meatpieuncooked = new Item().setUnlocalizedName("meatuncooked").setTextureName("scapecraft:MeatPie").setCreativeTab(tabScapecraftMisc);
	public static final Item applepieuncooked = new Item().setUnlocalizedName("applepieuncooked").setTextureName("scapecraft:ApplePie").setCreativeTab(tabScapecraftMisc);
	public static final Item fishpieuncooked = new Item().setUnlocalizedName("fishpieuncooked").setTextureName("scapecraft:FishPie").setCreativeTab(tabScapecraftMisc);
	public static final Item shard1 = new Item().setUnlocalizedName("shard1").setTextureName("scapecraft:Shard1").setCreativeTab(tabScapecraftMisc);
	public static final Item shard2 = new Item().setUnlocalizedName("shard2").setTextureName("scapecraft:Shard2").setCreativeTab(tabScapecraftMisc);
	public static final Item shard3 = new Item().setUnlocalizedName("shard3").setTextureName("scapecraft:Shard3").setCreativeTab(tabScapecraftMisc);
	public static final Item ratTail = new Item().setUnlocalizedName("ratTail").setTextureName("scapecraft:RatTail").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint = new Item().setUnlocalizedName("questPoint").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint1 = new Item().setUnlocalizedName("questPoint1").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint2 = new Item().setUnlocalizedName("questPoint2").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint3 = new Item().setUnlocalizedName("questPoint3").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item zamorakHilt = new Item().setUnlocalizedName("zamorakHilt").setTextureName("scapecraft:ZamorakHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item armadylHilt = new Item().setUnlocalizedName("armadylHilt").setTextureName("scapecraft:ArmadylHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item bandosHilt = new Item().setUnlocalizedName("bandosHilt").setTextureName("scapecraft:BandosHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item veracKey = new Item().setUnlocalizedName("VeracKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item toragKey = new Item().setUnlocalizedName("ToragKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item dharokKey = new Item().setUnlocalizedName("DharokKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item karilKey = new Item().setUnlocalizedName("KarilKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item ahrimKey = new Item().setUnlocalizedName("AhrimKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item guthanKey = new Item().setUnlocalizedName("GuthanKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item akrisaeKey = new Item().setUnlocalizedName("AkrisaeKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	//public static final Item TombKey = new ItemTombKey().setUnlocalizedName("scapecraft:TombKey").setCreativeTab(tabScapecraftMisc);
	//public static final Item DoorKey = new ItemDoorKey().setUnlocalizedName("scapecraft:DoorKey").setCreativeTab(tabScapecraftMisc);
	//public static final Item RewardChest = new ItemRewardChest().setUnlocalizedName("scapecraft:RewardChest").setCreativeTab(tabScapecraftMisc);

	public static Item addyOreSpawn, ahrimStaff, armaStaff, Armastaff, bandosTab, beer, blackDhide, boltRack, bTab, cabbageSpawn, cMaul, coalOreSpawn, coalSpawn, crystalBow, cTab, darkBow, DBA, DD, DDS, diamondOreSpawn, doorKey, dragonaxe, dragonAxe, DragonScimmy, dryLong, dryMace, dryRapier, fishPie, fremsword, fremswordf, fTab, greenDhide, guthixStaff, hTab, invincibilityPotion, KarilBow, keris, korasis, lTab, magicBoat, magicLog, magicSapling, mithAxe, mithOreSpawn, pickaxeGalore, pickaxeGaloreg, QuestPoint3, rapier, RewardChest, runeOreSpawn, sandSpawn, saraStaff, sarasword, saraSword, SGS, stake, tdTab, vTab, zammyStaff = new Item();
	private static int currentEntityIdOffset = 0;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		addyOre.setHarvestLevel("pickaxe", 2);
		if(event.getSide().isClient())
		{
			ClientProxy.registerRenderers();
		}

		GameRegistry.registerItem(mithlump, "mithlump");
		GameRegistry.registerItem(addylump, "addylump");
		GameRegistry.registerItem(runelump, "runelump");
		GameRegistry.registerItem(mithingot, "mithingot");
		GameRegistry.registerItem(addyingot, "addyingot");
		GameRegistry.registerItem(runeingot, "runeingot");

		GameRegistry.registerItem(santaHelmet, "santaHelmet");
		GameRegistry.registerItem(phatHelmet, "phatHelmet");
		GameRegistry.registerItem(wphatHelmet, "wphatHelmet");
		GameRegistry.registerItem(yphatHelmet, "yphatHelmet");
		GameRegistry.registerItem(gphatHelmet, "gphatHelmet");
		GameRegistry.registerItem(rphatHelmet, "rphatHelmet");
		GameRegistry.registerItem(pphatHelmet, "pphatHelmet");
		GameRegistry.registerItem(dragonHelmet, "dragonHelmet");
		GameRegistry.registerItem(dragonChestplate, "dragonChestplate");
		GameRegistry.registerItem(dragonLeggings, "dragonLeggings");
		GameRegistry.registerItem(dragonBoots, "dragonBoots");
		GameRegistry.registerItem(blackHelmet, "blackHelmet");
		GameRegistry.registerItem(blackChestplate, "blackChestplate");
		GameRegistry.registerItem(blackLeggings, "blackLeggings");
		GameRegistry.registerItem(blackBoots, "blackBoots");
		GameRegistry.registerItem(whiteHelmet, "whiteHelmet");
		GameRegistry.registerItem(whiteChestplate, "whiteChestplate");
		GameRegistry.registerItem(whiteLeggings, "whiteLeggings");
		GameRegistry.registerItem(whiteBoots, "whiteBoots");
		GameRegistry.registerItem(guardHelmet, "guardHelmet");
		GameRegistry.registerItem(guardChestplate, "guardChestplate");
		//GameRegistry.registerItem(guardLeggings, "guardLeggings");
		//GameRegistry.registerItem(guardBoots, "guardBoots");
		GameRegistry.registerItem(mithHelmet, "mithHelmet");
		GameRegistry.registerItem(mithChestplate, "mithChestplate");
		GameRegistry.registerItem(mithLeggings, "mithLeggings");
		GameRegistry.registerItem(mithBoots, "mithBoots");
		GameRegistry.registerItem(addyHelmet, "addyHelmet");
		GameRegistry.registerItem(addyChestplate, "addyChestplate");
		GameRegistry.registerItem(addyLeggings, "addyLeggings");
		GameRegistry.registerItem(addyBoots, "addyBoots");
		GameRegistry.registerItem(runeHelmet, "runeHelmet");
		GameRegistry.registerItem(runeChestplate, "runeChestplate");
		GameRegistry.registerItem(runeLeggings, "runeLeggings");
		GameRegistry.registerItem(runeBoots, "runeBoots");
		GameRegistry.registerItem(runegHelmet, "runegHelmet");
		GameRegistry.registerItem(runegChestplate, "runegChestplate");
		GameRegistry.registerItem(runegLeggings, "runegLeggings");
		GameRegistry.registerItem(runegBoots, "runegBoots");
		GameRegistry.registerItem(graniteHelmet, "graniteHelmet");
		GameRegistry.registerItem(graniteChestplate, "graniteChestplate");
		GameRegistry.registerItem(graniteLeggings, "graniteLeggings");
		GameRegistry.registerItem(graniteBoots, "graniteBoots");
		GameRegistry.registerItem(blackgHelmet, "blackgHelmet");
		GameRegistry.registerItem(blackgChestplate, "blackgChestplate");
		GameRegistry.registerItem(blackgLeggings, "blackgLeggings");
		GameRegistry.registerItem(blackgBoots, "blackgBoots");
		GameRegistry.registerItem(toragHelmet, "ToragHelmet");
		GameRegistry.registerItem(toragChestplate, "ToragChestplate");
		GameRegistry.registerItem(toragLeggings, "ToragLeggings");
		GameRegistry.registerItem(toragBoots, "ToragBoots");
		GameRegistry.registerItem(veracHelmet, "VeracHelmet");
		GameRegistry.registerItem(veracChestplate, "VeracChestplate");
		GameRegistry.registerItem(veracLeggings, "VeracLeggings");
		GameRegistry.registerItem(veracBoots, "veracBoots");
		GameRegistry.registerItem(guthanHelmet, "GuthanHelmet");
		GameRegistry.registerItem(guthanChestplate, "GuthanChestplate");
		GameRegistry.registerItem(guthanLeggings, "GuthanLeggings");
		GameRegistry.registerItem(guthanBoots, "GuthanBoots");
		GameRegistry.registerItem(dharokHelmet, "DharokHelmet");
		GameRegistry.registerItem(dharokChestplate, "DharokChestplate");
		GameRegistry.registerItem(dharokLeggings, "DharokLeggings");
		GameRegistry.registerItem(dharokBoots, "DharokBoots");
		GameRegistry.registerItem(karilHelmet, "KarilHelmet");
		GameRegistry.registerItem(karilChestplate, "KarilChestplate");
		GameRegistry.registerItem(karilLeggings, "KarilLeggings");
		GameRegistry.registerItem(karilBoots, "KarilBoots");
		GameRegistry.registerItem(ahrimHelmet, "AhrimHelmet");
		GameRegistry.registerItem(ahrimChestplate, "AhrimChestplate");
		GameRegistry.registerItem(ahrimLeggings, "AhrimLeggings");
		GameRegistry.registerItem(ahrimBoots, "AhrimBoots");
		GameRegistry.registerItem(akrisaeHelmet, "AkrisaeHelmet");
		GameRegistry.registerItem(akrisaeChestplate, "AkrisaeChestplate");
		GameRegistry.registerItem(akrisaeLeggings, "AkrisaeLeggings");
		GameRegistry.registerItem(akrisaeBoots, "AkrisaeBoots");
		GameRegistry.registerItem(greendHelmet, "greendHelmet");
		GameRegistry.registerItem(greendChestplate, "greendChestplate");
		GameRegistry.registerItem(greendLeggings, "greendLeggings");
		GameRegistry.registerItem(greendBoots, "greendBoots");
		GameRegistry.registerItem(blackdHelmet, "blackdHelmet");
		GameRegistry.registerItem(blackdChestplate, "blackdChestplate");
		GameRegistry.registerItem(blackdLeggings, "blackdLeggings");
		GameRegistry.registerItem(blackdBoots, "blackdBoots");
		GameRegistry.registerItem(dragonlHelmet, "dragonlHelmet");
		GameRegistry.registerItem(dragonlChestplate, "dragonlChestplate");
		GameRegistry.registerItem(dragonlLeggings, "dragonlLeggings");
		GameRegistry.registerItem(dragonlBoots, "dragonlBoots");
		GameRegistry.registerItem(bandosHelmet, "helmet");
		GameRegistry.registerItem(bandosChestplate, "chest");
		GameRegistry.registerItem(bandosLeggings, "legs");
		GameRegistry.registerItem(bandosBoots, "boots");
		GameRegistry.registerItem(stoneHelmet, "stoneHelmet");
		GameRegistry.registerItem(stoneChestplate, "stoneChestplate");
		GameRegistry.registerItem(stoneLeggings, "stoneLeggings");
		GameRegistry.registerItem(stoneBoots, "stoneBoots");
		GameRegistry.registerItem(dragonCHelmet, "dragonCHelmet");
		GameRegistry.registerItem(dragonCChestplate, "dragonCChestplate");
		GameRegistry.registerItem(dragonCLeggings, "dragonCLeggings");
		GameRegistry.registerItem(dragonCBoots, "dragonCBoots");

		GameRegistry.registerItem(addySword, "AddySword");
		GameRegistry.registerItem(runeSword, "RuneSword");
		GameRegistry.registerItem(blackSword, "BlackSword");
		GameRegistry.registerItem(whiteSword, "WhiteSword");
		GameRegistry.registerItem(chicken, "Chicken");
		GameRegistry.registerItem(D2H, "D2H");
		GameRegistry.registerItem(dragonLongsword, "DragonLongsword");
		GameRegistry.registerItem(dragonCScimmy, "DragonCScimmy");
		GameRegistry.registerItem(pitchFork, "PitchFork");
		GameRegistry.registerItem(steelHammer, "SteelHammer");
		GameRegistry.registerItem(mithHammer, "MithHammer");
		GameRegistry.registerItem(addyHammer, "AddyHammer");
		GameRegistry.registerItem(runeHammer, "RuneHammer");
		GameRegistry.registerItem(toragHammer, "ToragHammer");
		GameRegistry.registerItem(veracFlail, "VeracFlail");
		GameRegistry.registerItem(guthanSpear, "GuthanSpear");
		GameRegistry.registerItem(dharokAxe, "DharokAxe");
		GameRegistry.registerItem(akrisaeMace, "AkrisaeMace");

		GameRegistry.registerItem(graniteLump, "graniteLump");
		GameRegistry.registerItem(magicFruit, "magicFruit");
		GameRegistry.registerItem(saradominHilt, "saradominHilt");
		GameRegistry.registerItem(cabbagepieuncooked, "cabbagepieuncooked");
		GameRegistry.registerItem(meatpieuncooked, "meatuncooked");
		GameRegistry.registerItem(applepieuncooked, "applepieuncooked");
		GameRegistry.registerItem(fishpieuncooked, "fishpieuncooked");
		GameRegistry.registerItem(shard1, "shard1");
		GameRegistry.registerItem(shard2, "shard2");
		GameRegistry.registerItem(shard3, "shard3");
		GameRegistry.registerItem(ratTail, "ratTail");
		GameRegistry.registerItem(questPoint, "questPoint");
		GameRegistry.registerItem(questPoint1, "questPoint1");
		GameRegistry.registerItem(questPoint2, "questPoint2");
		GameRegistry.registerItem(questPoint3, "questPoint3");
		GameRegistry.registerItem(zamorakHilt, "zamorakHilt");
		GameRegistry.registerItem(armadylHilt, "armadylHilt");
		GameRegistry.registerItem(bandosHilt, "bandosHilt");
		GameRegistry.registerItem(veracKey, "VeracKey");
		GameRegistry.registerItem(toragKey, "ToragKey");
		GameRegistry.registerItem(dharokKey, "DharokKey");
		GameRegistry.registerItem(karilKey, "KarilKey");
		GameRegistry.registerItem(ahrimKey, "AhrimKey");
		GameRegistry.registerItem(guthanKey, "GuthanKey");
		GameRegistry.registerItem(akrisaeKey, "AkrisaeKey");

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

		registerEntity(EntityAbbyDemon.class, "AbbyDemon");
		registerEntity(EntityAhrim.class, "Ahrim");
		registerEntity(EntityAkrisae.class, "Akrisae");
		registerEntity(EntityBandit.class, "Bandit");
		registerEntity(EntityBarbarian.class, "Barbarian");
		registerEntity(EntityBlackDemon.class, "BlackDemon");
		registerEntity(EntityBlackDragon.class, "BlackDragon");
		registerEntity(EntityBlackGuard2.class, "BlackGuard2");
		registerEntity(EntityBlackGuard.class, "BlackGuard");
		registerEntity(EntityBlackKnight.class, "BlackKnight");
		registerEntity(EntityBot2.class, "Bot2");
		registerEntity(EntityBot3.class, "Bot3");
		registerEntity(EntityBot.class, "Bot");
		registerEntity(EntityCaveCrawler.class, "CaveCrawler");
		registerEntity(EntityCook.class, "Cook");
		registerEntity(EntityDarkwizard.class, "Darkwizard");
		registerEntity(EntityDharok.class, "Dharok");
		registerEntity(EntityDoctor.class, "Doctor");
		registerEntity(EntityDwarf.class, "Dwarf");
		registerEntity(EntityEliteBlackKnight.class, "EliteBlackKnight");
		registerEntity(EntityFarmer.class, "Farmer");
		registerEntity(EntityFireGiant.class, "FireGiant");
		registerEntity(EntityFremGuard.class, "FremGuard");
		registerEntity(EntityGeneralGraardor.class, "GeneralGraardor");
		registerEntity(EntityGhost.class, "Ghost");
		registerEntity(EntityGoblin.class, "Goblin");
		registerEntity(EntityGreenDragon.class, "GreenDragon");
		registerEntity(EntityGuard.class, "Guard");
		registerEntity(EntityGuthan.class, "Guthan");
		registerEntity(EntityHellhound.class, "Hellhound");
		registerEntity(EntityHeroKnight.class, "HeroKnight");
		registerEntity(EntityHighMage.class, "HighMage");
		registerEntity(EntityHillGiant.class, "HillGiant");
		registerEntity(EntityIceGiant.class, "IceGiant");
		registerEntity(EntityIronDragon.class, "IronDragon");
		registerEntity(EntityKaril.class, "Karil");
		registerEntity(EntityKing.class, "King");
		registerEntity(EntityKingsGuard.class, "KingsGuard");
		registerEntity(EntityKK.class, "KK");
		registerEntity(EntityKKspawn.class, "KKspawn");
		registerEntity(EntityKos1.class, "Kos1");
		registerEntity(EntityKos2.class, "Kos2");
		registerEntity(EntityKos3.class, "Kos3");
		registerEntity(EntityKos4.class, "Kos4");
		registerEntity(EntityKQ2.class, "KQ2");
		registerEntity(EntityKQ.class, "KQ");
		registerEntity(EntityLavaBlock.class, "LavaBlock");
		registerEntity(EntityLesserDemon2.class, "LesserDemon2");
		registerEntity(EntityLesserDemon.class, "LesserDemon");
		registerEntity(EntityLootChest.class, "LootChest");
		registerEntity(EntityMagicBoat.class, "MagicBoat");
		registerEntity(EntityMan.class, "Man");
		registerEntity(EntityMorgan.class, "Morgan");
		registerEntity(EntityMossGiant.class, "MossGiant");
		registerEntity(EntityMugger.class, "Mugger");
		registerEntity(EntityRat.class, "Rat");
		registerEntity(EntityRatSmall.class, "RatSmall");
		registerEntity(EntityScapecraft.class, "Scapecraft");
		registerEntity(EntityScorpion.class, "Scorpion");
		registerEntity(EntitySergeantGrimspike.class, "SergeantGrimspike");
		registerEntity(EntitySergeantSteelwill.class, "SergeantSteelwill");
		registerEntity(EntitySergeantStrongstack.class, "SergeantStrongstack");
		registerEntity(EntityShopKeeper.class, "ShopKeeper");
		registerEntity(EntityTD.class, "TD");
		registerEntity(EntityTheif.class, "Theif");
		registerEntity(EntityTinyTNTPrimed.class, "TinyTNTPrimed");
		registerEntity(EntityTNTXPrimed.class, "TNTXPrimed");
		registerEntity(EntityTorag.class, "Torag");
		registerEntity(EntityVampire.class, "Vampire");
		registerEntity(EntityVarze.class, "Varze");
		registerEntity(EntityVerac.class, "Verac");
		registerEntity(EntityWhiteKnight.class, "WhiteKnight");
		registerEntity(EntityWizard.class, "Wizard");

		MinecraftForge.EVENT_BUS.register(new ScapecraftEventHandler());
	}

	public void registerEntity(Class<? extends Entity> entityClass, String name)
	{
		EntityRegistry.registerModEntity(entityClass, name, currentEntityIdOffset, this, 80, 3, true);
		currentEntityIdOffset++;
	}
}
