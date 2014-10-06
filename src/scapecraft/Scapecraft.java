package scapecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import scapecraft.block.BlockScapecraft;
import scapecraft.block.BlockSpawn;
import scapecraft.client.ClientProxy;
import scapecraft.client.gui.GuiHandler;
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
import scapecraft.entity.EntityZilyana;
import scapecraft.item.ItemArmorBandos;
import scapecraft.item.ItemArmorScapecraft;
import scapecraft.item.ItemDryWeapon;
import scapecraft.item.ItemHammer;
import scapecraft.item.ItemScapecraftAxe;
import scapecraft.item.ItemScapecraftHoe;
import scapecraft.item.ItemScapecraftPickaxe;
import scapecraft.item.ItemScapecraftShovel;
import scapecraft.item.ItemScapecraftSpawnEgg;
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

	public static final Item santaHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.SANTA, 0, 0, "santa");

	public static final Item phatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.PHAT, 0, 0, "phat");

	public static final Item wphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.WPHAT, 0, 0, "whitephat");

	public static final Item yphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.YPHAT, 0, 0, "yellowphat");

	public static final Item gphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GPHAT, 0, 0, "greenphat");

	public static final Item rphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RPHAT, 0, 0, "redphat");

	public static final Item pphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.PPHAT, 0, 0, "purplephat");

	public static final Item dragonHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 0, 0, "dragon");
	public static final Item dragonChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 1, 1, "dragon");
	public static final Item dragonLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 2, 2, "dragon");
	public static final Item dragonBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGON, 3, 3, "dragon");

	public static final Item blackHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 0, 0, "black");
	public static final Item blackChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 1, 1, "black");
	public static final Item blackLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 2, 2, "black");
	public static final Item blackBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACK, 3, 3, "black");

	public static final Item whiteHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 0, 0, "white");
	public static final Item whiteChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 1, 1, "white");
	public static final Item whiteLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 2, 2, "white");
	public static final Item whiteBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.WHITE, 3, 3, "white");

	public static final Item guardHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 0, 0, "guard");
	public static final Item guardChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 1, 1, "guard");
	//public static final Item guardLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 2, 2, "guard");
	//public static final Item guardBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUARD, 3, 3, "guard");

	public static final Item mithHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 0, 0, "mith");
	public static final Item mithChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 1, 1, "mith");
	public static final Item mithLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 2, 2, "mith");
	public static final Item mithBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.MITH, 3, 3, "mith");

	public static final Item addyHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 0, 0, "addy");
	public static final Item addyChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 1, 1, "addy");
	public static final Item addyLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 2, 2, "addy");
	public static final Item addyBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.ADDY, 3, 3, "addy");

	public static final Item runeHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 0, 0, "rune");
	public static final Item runeChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 1, 1, "rune");
	public static final Item runeLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 2, 2, "rune");
	public static final Item runeBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNE, 3, 3, "rune");

	public static final Item runegHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 0, 0, "runeg");
	public static final Item runegChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 1, 1, "runeg");
	public static final Item runegLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 2, 2, "runeg");
	public static final Item runegBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.RUNEG, 3, 3, "runeg");

	public static final Item graniteHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 0, 0, "granite");
	public static final Item graniteChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 1, 1, "granite");
	public static final Item graniteLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 2, 2, "granite");
	public static final Item graniteBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GRANITE, 3, 3, "granite");

	public static final Item blackgHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 0, 0, "blackg");
	public static final Item blackgChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 1, 1, "blackg");
	public static final Item blackgLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 2, 2, "blackg");
	public static final Item blackgBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKG, 3, 3, "blackg");

	public static final Item toragHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 0, 0, "Torag");
	public static final Item toragChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 1, 1, "Torag");
	public static final Item toragLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 2, 2, "Torag");
	public static final Item toragBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.TORAG, 3, 3, "Torag");

	public static final Item veracHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 0, 0, "Verac");
	public static final Item veracChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 1, 1, "Verac");
	public static final Item veracLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 2, 2, "Verac");
	public static final Item veracBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.VERAC, 3, 3, "Verac");

	public static final Item guthanHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 0, 0, "Guthan");
	public static final Item guthanChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 1, 1, "Guthan");
	public static final Item guthanLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 2, 2, "Guthan");
	public static final Item guthanBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GUTHAN, 3, 3, "Guthan");

	public static final Item dharokHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 0, 0, "Dharok");
	public static final Item dharokChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 1, 1, "Dharok");
	public static final Item dharokLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 2, 2, "Dharok");
	public static final Item dharokBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.DHAROK, 3, 3, "Dharok");

	public static final Item karilHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 0, 0, "Karil");
	public static final Item karilChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 1, 1, "Karil");
	public static final Item karilLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 2, 2, "Karil");
	public static final Item karilBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.KARIL, 3, 3, "Karil");

	public static final Item ahrimHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 0, 0, "Ahrim");
	public static final Item ahrimChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 1, 1, "Ahrim");
	public static final Item ahrimLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 2, 2, "Ahrim");
	public static final Item ahrimBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.AHRIM, 3, 3, "Ahrim");

	public static final Item akrisaeHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 0, 0, "Akrisae");
	public static final Item akrisaeChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 1, 1, "Akrisae");
	public static final Item akrisaeLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 2, 2, "Akrisae");
	public static final Item akrisaeBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.AKRISAE, 3, 3, "Akrisae");


	public static final Item greendHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 0, 0, "greend");
	public static final Item greendChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 1, 1, "greend");
	public static final Item greendLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 2, 2, "greend");
	public static final Item greendBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GREEND, 3, 3, "greend");

	public static final Item blackdHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 0, 0, "blackd");
	public static final Item blackdChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 1, 1, "blackd");
	public static final Item blackdLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 2, 2, "blackd");
	public static final Item blackdBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.BLACKD, 3, 3, "blackd");


	public static final Item dragonlHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 0, 0, "dragonl");
	public static final Item dragonlChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 1, 1, "dragonl");
	public static final Item dragonlLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 2, 2, "dragonl");
	public static final Item dragonlBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.DRAGONL, 3, 3, "dragonl");

	public static final Item bandosHelmet = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 0, 0, "Bandos");
	public static final Item bandosChestplate = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 1, 1, "Bandos");
	public static final Item bandosLeggings = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 2, 2, "Bandos");
	public static final Item bandosBoots = new ItemArmorBandos(ScapecraftArmorMaterial.BANDOS, 3, 3, "Bandos");
	public static final Item stoneHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 0, 0, "stone");
	public static final Item stoneChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 1, 1, "stone");
	public static final Item stoneLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 2, 2, "stone");
	public static final Item stoneBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.STONE, 3, 3, "stone");


	public static final Item dragonCHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 0, 0, "dragonC");
	public static final Item dragonCChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 1, 1, "dragonC");
	public static final Item dragonCLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 2, 2, "dragonC");
	public static final Item dragonCBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.CDRAGON, 3, 3, "dragonC");
	/*end armor*/

	public static final CreativeTabs tabScapecraftBlock = new CreativeTabs("tabScapecraftBlock")
	{
		@Override
		public Item getTabIconItem()
		{
			return phatHelmet;
		}
	};

	public static final Block barbarianSpawn = new BlockSpawn(EntityBarbarian.class, 0, true).setUnlocalizedName("barbarianSpawn");
	public static final Block botSpawn = new BlockSpawn(EntityBot.class, 0, true).setUnlocalizedName("botSpawn");
	public static final Block darkwizardSpawn = new BlockSpawn(EntityDarkwizard.class, 0, true).setUnlocalizedName("darkwizardSpawn");
	public static final Block dwarfSpawn = new BlockSpawn(EntityDwarf.class, 0, true).setUnlocalizedName("dwarfSpawn");
	public static final Block goblinSpawn = new BlockSpawn(EntityGoblin.class, 0, true).setUnlocalizedName("goblinSpawn");
	public static final Block guardSpawn = new BlockSpawn(EntityGuard.class, 0, true).setUnlocalizedName("guardSpawn");
	public static final Block iceGiantSpawn = new BlockSpawn(EntityIceGiant.class, 0, true).setUnlocalizedName("iceGiantSpawn");
	//TODO there's something special with this one
	public static final Block ironDragonSpawn = new BlockSpawn(EntityIronDragon.class, 0, true).setUnlocalizedName("ironDragonSpawn");
	public static final Block lesserSpawn = new BlockSpawn(EntityLesserDemon.class, 0, true).setUnlocalizedName("lesserSpawn");
	public static final Block manSpawn = new BlockSpawn(EntityMan.class, 0, true).setUnlocalizedName("manSpawn");
	public static final Block muggerSpawn = new BlockSpawn(EntityMugger.class, 0, true).setUnlocalizedName("muggerSpawn");
	public static final Block ratSpawn = new BlockSpawn(EntityRat.class, 0, true).setUnlocalizedName("ratSpawn");
	public static final Block smallRatSpawn = new BlockSpawn(EntityRatSmall.class, 0, true).setUnlocalizedName("smallRatSpawn");
	public static final Block theifSpawn = new BlockSpawn(EntityTheif.class, 0, true).setUnlocalizedName("theifSpawn");
	public static final Block whiteKnightSpawn = new BlockSpawn(EntityWhiteKnight.class, 0, true).setUnlocalizedName("whiteKnightSpawn");
	public static final Block wizardSpawn = new BlockSpawn(EntityWizard.class, 0, true).setUnlocalizedName("wizardSpawn");
	public static final Block abbyDemonSpawn = new BlockSpawn(EntityAbbyDemon.class, 0, true).setUnlocalizedName("abbyDemonSpawn");
	public static final Block blackDemonSpawn = new BlockSpawn(EntityBlackDemon.class, 0, true).setUnlocalizedName("blackDemonSpawn");
	public static final Block blackDragonSpawn = new BlockSpawn(EntityBlackDragon.class, 0, true).setUnlocalizedName("blackDragonSpawn");
	public static final Block blackKnightSpawn = new BlockSpawn(EntityBlackKnight.class, 0, true).setUnlocalizedName("blackKnightSpawn");
	public static final Block caveCrawlerSpawn = new BlockSpawn(EntityCaveCrawler.class, 0, true).setUnlocalizedName("caveCrawlerSpawn");
	public static final Block fireGiantSpawn = new BlockSpawn(EntityFireGiant.class, 0, true).setUnlocalizedName("fireGiantSpawn");
	public static final Block ghostSpawn = new BlockSpawn(EntityGhost.class, 0, true).setUnlocalizedName("ghostSpawn");
	public static final Block greenDragonSpawn = new BlockSpawn(EntityGreenDragon.class, 0, true).setUnlocalizedName("greenDragonSpawn");
	public static final Block hillGiantSpawn = new BlockSpawn(EntityHillGiant.class, 0, true).setUnlocalizedName("hillGiantSpawn");
	public static final Block kq2Spawn = new BlockSpawn(EntityKQ2.class, 0, true).setUnlocalizedName("kq2Spawn");
	public static final Block mossGiantSpawn = new BlockSpawn(EntityMossGiant.class, 0, true).setUnlocalizedName("mossGiantSpawn");
	public static final Block scorpionSpawn = new BlockSpawn(EntityScorpion.class, 0, true).setUnlocalizedName("scorpionSpawn");
	public static final Block kingGuardSpawn = new BlockSpawn(EntityKingsGuard.class, 5, true).setUnlocalizedName("kingGuardSpawn");
	public static final Block kosSpawn = new BlockSpawn(EntityKos1.class, 20).setUnlocalizedName("kosSpawn");
	public static final Block tdSpawn = new BlockSpawn(EntityTD.class, 20).setUnlocalizedName("tdSpawn");
	public static final Block cookSpawn = new BlockSpawn(EntityCook.class, 200).setUnlocalizedName("cookSpawn");
	public static final Block doctorSpawn = new BlockSpawn(EntityDoctor.class, 200).setUnlocalizedName("doctorSpawn");
	public static final Block fremGuardSpawn = new BlockSpawn(EntityFremGuard.class, 200).setUnlocalizedName("fremGuardSpawn");
	public static final Block morganSpawn = new BlockSpawn(EntityMorgan.class, 200).setUnlocalizedName("morganSpawn");
	public static final Block shopKeeperSpawn = new BlockSpawn(EntityShopKeeper.class, 200).setUnlocalizedName("shopKeeperSpawn");
	public static final Block varzeSpawn = new BlockSpawn(EntityVarze.class, 200).setUnlocalizedName("varzeSpawn");
	public static final Block blackGuard2Spawn = new BlockSpawn(EntityBlackGuard2.class, 1800).setUnlocalizedName("blackGuard2Spawn");
	public static final Block heroKnightSpawn = new BlockSpawn(EntityHeroKnight.class, 4000).setUnlocalizedName("heroKnightSpawn");
	public static final Block ahrimSpawn = new BlockSpawn(EntityAhrim.class, 6000).setUnlocalizedName("ahrimSpawn");
	public static final Block akrisaeSpawn = new BlockSpawn(EntityAkrisae.class, 6000).setUnlocalizedName("akrisaeSpawn");
	public static final Block dharokSpawn = new BlockSpawn(EntityDharok.class, 6000).setUnlocalizedName("dharokSpawn");
	public static final Block eliteBlackKnightSpawn = new BlockSpawn(EntityEliteBlackKnight.class, 6000).setUnlocalizedName("eliteBlackKnightSpawn");
	public static final Block guthanSpawn = new BlockSpawn(EntityGuthan.class, 6000).setUnlocalizedName("guthanSpawn");
	public static final Block karilSpawn = new BlockSpawn(EntityKaril.class, 6000).setUnlocalizedName("karilSpawn");
	public static final Block toragSpawn = new BlockSpawn(EntityTorag.class, 6000).setUnlocalizedName("toragSpawn");
	public static final Block veracSpawn = new BlockSpawn(EntityVerac.class, 6000).setUnlocalizedName("veracSpawn");
	public static final Block banditSpawn = new BlockSpawn(EntityBandit.class, 8000).setUnlocalizedName("banditSpawn");
	public static final Block highMageSpawn = new BlockSpawn(EntityHighMage.class, 12000).setUnlocalizedName("highMageSpawn");
	public static final Block kingSpawn = new BlockSpawn(EntityKing.class, 12000).setUnlocalizedName("kingSpawn");
	public static final Block kqSpawn = new BlockSpawn(EntityKQ.class, 12000).setUnlocalizedName("kqSpawn");
	public static final Block kkSpawn = new BlockSpawn(EntityKK.class, 24000).setUnlocalizedName("kkSpawn");
	public static final Block hellhoundSpawn = new BlockSpawn(EntityHellhound.class, 72000).setUnlocalizedName("hellhoundSpawn");

	public static final Block addyOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:addyOre").setHardness(30.0F).setResistance(5.0F).setUnlocalizedName("addyOre");
	public static final Block mithOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:mithOre").setHardness(60.0F).setResistance(5.0F).setUnlocalizedName("mithOre");
	public static final Block runeOre = new BlockScapecraft(Material.rock).setTextureName("scapecraft:runeOre").setHardness(80.0F).setResistance(50.0F).setUnlocalizedName("runeOre");

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
	public static final Item fremSword = new ItemWeapon(ScapecraftToolMaterial.FREM, 5F, "FremSword");
	public static final Item fremSwordf = new ItemWeapon(ScapecraftToolMaterial.FREMF, 5F, "FremSword");
	public static final Item rapier = new ItemWeapon(ScapecraftToolMaterial.RAPIER, 4F, "Rapier");

	public static final Item steelHammer = new ItemHammer(ScapecraftToolMaterial.STEEL, "SteelHammer");
	public static final Item mithHammer = new ItemHammer(ScapecraftToolMaterial.MITH, "MithHammer");
	public static final Item addyHammer = new ItemHammer(ScapecraftToolMaterial.ADDY, "AddyHammer");
	public static final Item runeHammer = new ItemHammer(ScapecraftToolMaterial.RUNE, "RuneHammer");

	public static final Item dryMace = new ItemDryWeapon(5F, "DryMace");
	public static final Item dryRapier = new ItemDryWeapon(10F, "DryRapier");
	public static final Item dryLong = new ItemDryWeapon(15F, "DryLong");

	public static final Item whip = new ItemSpecialWeapon(ScapecraftToolMaterial.WHIP, 4F, "Whip", 5000);
	public static final Item dragonScimmy = new ItemSpecialWeapon(ScapecraftToolMaterial.DRAGONS, 5F, "DragonScimmy", 5500);
	public static final Item DBA = new ItemSpecialWeapon(ScapecraftToolMaterial.DRAGONB, 6F, "DBA", 9900);
	public static final Item DD = new ItemSpecialWeapon(ScapecraftToolMaterial.DRAGOND, 1F, "DD", 2500);
	public static final Item DDS = new ItemSpecialWeapon(ScapecraftToolMaterial.DRAGONDS, 1F, "DDS", 2500);
	public static final Item saraSword = new ItemSpecialWeapon(ScapecraftToolMaterial.SS, 7F, "SaraSword", 9900);
	public static final Item AGS = new ItemSpecialWeapon(ScapecraftToolMaterial.AGS, 12F, "AGS", 5000);
	public static final Item BGS = new ItemSpecialWeapon(ScapecraftToolMaterial.BGS, 10F, "BGS", 9900);
	public static final Item SGS = new ItemSpecialWeapon(ScapecraftToolMaterial.SGS, 9F, "SGS", 5500);
	public static final Item ZGS = new ItemSpecialWeapon(ScapecraftToolMaterial.ZGS, 9F, "ZGS", 7500);

	public static final Item toragHammer = new ItemSetWeapon(ScapecraftToolMaterial.TORAG, ScapecraftArmorMaterial.TORAG, "ToragHammerinv");
	public static final Item veracFlail = new ItemSetWeapon(ScapecraftToolMaterial.VERAC, ScapecraftArmorMaterial.VERAC, "VeracFlailinv");
	public static final Item guthanSpear = new ItemSetWeapon(ScapecraftToolMaterial.GUTHAN, ScapecraftArmorMaterial.GUTHAN, "GuthanSpearinv");
	public static final Item dharokAxe = new ItemSetWeapon(ScapecraftToolMaterial.DHAROK, ScapecraftArmorMaterial.DHAROK, "DharokAxeinv");
	public static final Item akrisaeMace = new ItemSetWeapon(ScapecraftToolMaterial.AKRISAE, ScapecraftArmorMaterial.AKRISAE, "AkrisaeMaceinv");

	public static final CreativeTabs tabScapecraftTool = new CreativeTabs("tabScapecraftTool")
	{
		@Override
		public Item getTabIconItem()
		{
			return dragonAxe;
		}
	};

	public static final Item mithShovel = new ItemScapecraftShovel(ScapecraftToolMaterial.MITH).setTextureName("scapecraft:mithShovel");
	public static final Item addyShovel = new ItemScapecraftShovel(ScapecraftToolMaterial.ADDY).setTextureName("scapecraft:addyShovel");
	public static final Item runeShovel = new ItemScapecraftShovel(ScapecraftToolMaterial.RUNE).setTextureName("scapecraft:runeShovel");
	public static final Item mithPickaxe = new ItemScapecraftPickaxe(ScapecraftToolMaterial.MITH).setTextureName("scapecraft:mithPickaxe");
	public static final Item addyPickaxe = new ItemScapecraftPickaxe(ScapecraftToolMaterial.ADDY).setTextureName("scapecraft:addyPickaxe");
	public static final Item runePickaxe = new ItemScapecraftPickaxe(ScapecraftToolMaterial.RUNE).setTextureName("scapecraft:runePickaxe");
	public static final Item mithAxe = new ItemScapecraftAxe(ScapecraftToolMaterial.MITH).setTextureName("scapecraft:mithAxe");
	public static final Item addyAxe = new ItemScapecraftAxe(ScapecraftToolMaterial.ADDY).setTextureName("scapecraft:addyAxe");
	public static final Item runeAxe = new ItemScapecraftAxe(ScapecraftToolMaterial.RUNE).setTextureName("scapecraft:runeAxe");
	public static final Item dragonAxe = new ItemScapecraftAxe(ScapecraftToolMaterial.DRAGONB).setTextureName("scapecraft:DragonAxe");
	public static final Item mithHoe = new ItemScapecraftHoe(ScapecraftToolMaterial.MITH).setTextureName("scapecraft:mithHoe");
	public static final Item addyHoe = new ItemScapecraftHoe(ScapecraftToolMaterial.ADDY).setTextureName("scapecraft:addyHoe");
	public static final Item runeHoe = new ItemScapecraftHoe(ScapecraftToolMaterial.RUNE).setTextureName("scapecraft:runeHoe");

	public static final CreativeTabs tabScapecraftMisc = new CreativeTabs("tabScapecraftMisc")
	{
		@Override
		public Item getTabIconItem()
		{
			return questPoint;
		}
	};

	public static final Item mithLump = new Item().setTextureName("scapecraft:mithLump").setUnlocalizedName("mithLump");
	public static final Item addyLump = new Item().setTextureName("scapecraft:addyLump").setUnlocalizedName("addyLump");
	public static final Item runeLump = new Item().setTextureName("scapecraft:runeLump").setUnlocalizedName("runeLump");
	public static final Item mithIngot = new Item().setTextureName("scapecraft:mithIngot").setUnlocalizedName("mithIngot");
	public static final Item addyIngot = new Item().setTextureName("scapecraft:addyIngot").setUnlocalizedName("addyIngot");
	public static final Item runeIngot = new Item().setTextureName("scapecraft:runeIngot").setUnlocalizedName("runeIngot");
	public static final Item graniteLump = new Item().setUnlocalizedName("graniteLump").setTextureName("scapecraft:GraniteLump").setCreativeTab(tabScapecraftMisc);
	public static final Item greenDLeather = new Item().setUnlocalizedName("greenDLeather").setTextureName("scapecraft:GreenDLeather").setCreativeTab(tabScapecraftMisc);
	public static final Item greenDHide = new Item().setUnlocalizedName("blackDHide").setTextureName("scapecraft:BlackDHide").setCreativeTab(tabScapecraftMisc);
	public static final Item blackDLeather = new Item().setUnlocalizedName("blackDLeather").setTextureName("scapecraft:BlackDLeather").setCreativeTab(tabScapecraftMisc);
	public static final Item blackDHide = new Item().setUnlocalizedName("blackDHide").setTextureName("scapecraft:BlackDHide").setCreativeTab(tabScapecraftMisc);
	public static final Item yewStick = new Item().setUnlocalizedName("yewStick").setTextureName("scapecraft:YewStick").setCreativeTab(tabScapecraftMisc);
	public static final Item magicFruit = new ItemFood(20, false).setUnlocalizedName("magicFruit").setTextureName("scapecraft:MagicFruit").setCreativeTab(tabScapecraftMisc);
	public static final Item cabbagepieuncooked = new Item().setUnlocalizedName("cabbagepieuncooked").setTextureName("scapecraft:CabbagePie").setCreativeTab(tabScapecraftMisc);
	public static final Item meatpieuncooked = new Item().setUnlocalizedName("meatuncooked").setTextureName("scapecraft:MeatPie").setCreativeTab(tabScapecraftMisc);
	public static final Item applepieuncooked = new Item().setUnlocalizedName("applepieuncooked").setTextureName("scapecraft:ApplePie").setCreativeTab(tabScapecraftMisc);
	public static final Item fishpieuncooked = new Item().setUnlocalizedName("fishpieuncooked").setTextureName("scapecraft:FishPie").setCreativeTab(tabScapecraftMisc);
	public static final Item shard1 = new Item().setUnlocalizedName("shard1").setTextureName("scapecraft:Shard1").setCreativeTab(tabScapecraftMisc);
	public static final Item shard2 = new Item().setUnlocalizedName("shard2").setTextureName("scapecraft:Shard2").setCreativeTab(tabScapecraftMisc);
	public static final Item shard3 = new Item().setUnlocalizedName("shard3").setTextureName("scapecraft:Shard3").setCreativeTab(tabScapecraftMisc);
	public static final Item ratTail = new Item().setUnlocalizedName("ratTail").setTextureName("scapecraft:RatTail").setCreativeTab(tabScapecraftMisc);
	public static final Item note1 = new Item().setUnlocalizedName("note1").setTextureName("scapecraft:goldnote1").setCreativeTab(tabScapecraftMisc);
	public static final Item note2 = new Item().setUnlocalizedName("note2").setTextureName("scapecraft:goldnote2").setCreativeTab(tabScapecraftMisc);
	public static final Item note3 = new Item().setUnlocalizedName("note3").setTextureName("scapecraft:goldnote3").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint = new Item().setUnlocalizedName("questPoint").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint1 = new Item().setUnlocalizedName("questPoint1").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint2 = new Item().setUnlocalizedName("questPoint2").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item questPoint3 = new Item().setUnlocalizedName("questPoint3").setTextureName("scapecraft:QuestPoint").setCreativeTab(tabScapecraftMisc);
	public static final Item armadylHilt = new Item().setUnlocalizedName("armadylHilt").setTextureName("scapecraft:ArmadylHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item bandosHilt = new Item().setUnlocalizedName("bandosHilt").setTextureName("scapecraft:BandosHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item saradominHilt = new Item().setUnlocalizedName("saradominHilt").setTextureName("scapecraft:SaradominHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item zamorakHilt = new Item().setUnlocalizedName("zamorakHilt").setTextureName("scapecraft:ZamorakHilt").setCreativeTab(tabScapecraftMisc);
	public static final Item hilt = new Item().setUnlocalizedName("hilt").setTextureName("scapecraft:Hilt").setCreativeTab(tabScapecraftMisc);
	public static final Item veracKey = new Item().setUnlocalizedName("veracKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item toragKey = new Item().setUnlocalizedName("toragKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item dharokKey = new Item().setUnlocalizedName("dharokKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item karilKey = new Item().setUnlocalizedName("karilKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item ahrimKey = new Item().setUnlocalizedName("ahrimKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item guthanKey = new Item().setUnlocalizedName("guthanKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	public static final Item akrisaeKey = new Item().setUnlocalizedName("akrisaeKey").setTextureName("scapecraft:Key1").setCreativeTab(tabScapecraftMisc);
	//public static final Item tombKey = new itemTombKey().setUnlocalizedName("scapecraft:tombKey").setCreativeTab(tabScapecraftMisc);
	//public static final Item doorKey = new itemDoorKey().setUnlocalizedName("scapecraft:doorKey").setCreativeTab(tabScapecraftMisc);
	//public static final Item RewardChest = new ItemRewardChest().setUnlocalizedName("scapecraft:RewardChest").setCreativeTab(tabScapecraftMisc);
	public static final Item scapecraftSpawnEgg = new ItemScapecraftSpawnEgg();

	public static Item addyOreSpawn, ahrimStaff, armaStaff, Armastaff, bandosTab, beer, boltRack, bTab, cabbageSpawn, cMaul, coalOreSpawn, coalSpawn, crystalBow, cTab, darkBow, diamondOreSpawn, doorKey, fishPie, fTab, guthixStaff, hTab, invincibilityPotion, KarilBow, keris, korasis, lTab, magicBoat, magicLog, magicSapling, mithOreSpawn, pickaxeGalore, pickaxeGaloreg, QuestPoint3, RewardChest, runeOreSpawn, sandSpawn, saraStaff, stake, tdTab, vTab, zammyStaff = new Item();
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

		GameRegistry.registerItem(mithLump, "mithLump");
		GameRegistry.registerItem(addyLump, "addyLump");
		GameRegistry.registerItem(runeLump, "runeLump");
		GameRegistry.registerItem(mithIngot, "mithIngot");
		GameRegistry.registerItem(addyIngot, "addyIngot");
		GameRegistry.registerItem(runeIngot, "runeIngot");

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

		GameRegistry.registerItem(addySword, "addySword");
		GameRegistry.registerItem(runeSword, "runeSword");
		GameRegistry.registerItem(blackSword, "BlackSword");
		GameRegistry.registerItem(whiteSword, "WhiteSword");
		GameRegistry.registerItem(chicken, "Chicken");
		GameRegistry.registerItem(D2H, "D2H");
		GameRegistry.registerItem(dragonLongsword, "DragonLongsword");
		GameRegistry.registerItem(dragonCScimmy, "DragonCScimmy");
		GameRegistry.registerItem(pitchFork, "PitchFork");
		GameRegistry.registerItem(steelHammer, "SteelHammer");
		GameRegistry.registerItem(mithHammer, "mithHammer");
		GameRegistry.registerItem(addyHammer, "addyHammer");
		GameRegistry.registerItem(runeHammer, "runeHammer");
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
		GameRegistry.registerItem(veracKey, "veracKey");
		GameRegistry.registerItem(toragKey, "toragKey");
		GameRegistry.registerItem(dharokKey, "dharokKey");
		GameRegistry.registerItem(karilKey, "karilKey");
		GameRegistry.registerItem(ahrimKey, "ahrimKey");
		GameRegistry.registerItem(guthanKey, "guthanKey");
		GameRegistry.registerItem(akrisaeKey, "akrisaeKey");

		GameRegistry.registerItem(scapecraftSpawnEgg, "scapecraftSpawnEgg");

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
		registerEntity(EntityZilyana.class, "Zilyana");

		//recipes
		GameRegistry.addRecipe(new ItemStack(AGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), hilt, Character.valueOf('Y'), armadylHilt});
		GameRegistry.addRecipe(new ItemStack(BGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), hilt, Character.valueOf('Y'), bandosHilt});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 9), new Object[] {"X", Character.valueOf('X'), note1});
		//;GameRegistry.addRecipe(new ItemStack(boltRack, 3), new Object[] { " X ", " Y ", Character.valueOf('X'), magicPlank, Character.valueOf('Y'), Items.arrow});
		GameRegistry.addRecipe(new ItemStack(DDS, 1), new Object[] {"Y Y", " X ", "Y Y", Character.valueOf('X'), DD, Character.valueOf('Y'), Items.fermented_spider_eye});
		//;GameRegistry.addRecipe(new ItemStack(LOL, 1), new Object[] {" X ", "XYX", "XXY", Character.valueOf('X'), Blocks.dirt, Character.valueOf('Y'), Blocks.planks});
		GameRegistry.addRecipe(new ItemStack(SGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), hilt, Character.valueOf('Y'), saradominHilt});
		//;GameRegistry.addRecipe(new ItemStack(tombKey, 2), new Object[] { "XYZ", "ABC", " U ", Character.valueOf('X'), ahrimKey, Character.valueOf('Y'), akrisaeKey, Character.valueOf('Z'), dharokKey, Character.valueOf('A'), karilKey, Character.valueOf('B'), guthanKey, Character.valueOf('C'), toragKey, Character.valueOf('U'), veracKey});
		//;GameRegistry.addRecipe(new ItemStack(yewBow, 1), new Object[] { " XY", "X Y", " XY", Character.valueOf('X'), yewStick, Character.valueOf('Y'), Items.string});
		//;GameRegistry.addRecipe(new ItemStack(yewPlank, 2), new Object[] { "X", Character.valueOf('X'), yewLog});
		//;GameRegistry.addRecipe(new ItemStack(yewStairs, 4), new Object[] { "  X", " XX", "XXX", Character.valueOf('X'), yewPlank});
		//;GameRegistry.addRecipe(new ItemStack(yewStick, 1), new Object[] { "X", "X", Character.valueOf('X'), yewPlank});
		GameRegistry.addRecipe(new ItemStack(ZGS, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), hilt, Character.valueOf('Y'), zamorakHilt});
		GameRegistry.addRecipe(new ItemStack(addyAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), addyIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(addyBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), addyIngot});
		GameRegistry.addRecipe(new ItemStack(addyChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), addyIngot});
		GameRegistry.addRecipe(new ItemStack(addyHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), addyIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(addyHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), addyIngot});
		GameRegistry.addRecipe(new ItemStack(addyLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), addyIngot});
		GameRegistry.addRecipe(new ItemStack(addyLump, 1), new Object[] {" X ", "XYX", " X ", Character.valueOf('X'), Items.coal, Character.valueOf('Y'), addyOre});
		GameRegistry.addRecipe(new ItemStack(addyPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(addyShovel, 1), new Object[] {" X ", " Y ", " Y ", Character.valueOf('X'), addyIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(addySword, 1), new Object[] {" X ", " X ", " Y ", Character.valueOf('X'), addyIngot, Character.valueOf('Y'), Items.stick});
		//;GameRegistry.addRecipe(new ItemStack(addyhoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', addyIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(applepieuncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.apple, Character.valueOf('Y'), Items.bread});
		GameRegistry.addRecipe(new ItemStack(blackDLeather, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), blackDHide});
		GameRegistry.addRecipe(new ItemStack(blackdBoots, 1), new Object[] {"X X", "X X", Character.valueOf('X'), blackDLeather});     	         
		GameRegistry.addRecipe(new ItemStack(blackdChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), blackDLeather});
		GameRegistry.addRecipe(new ItemStack(blackdHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), blackDLeather});
		GameRegistry.addRecipe(new ItemStack(blackdLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), blackDLeather});
		//;GameRegistry.addRecipe(new ItemStack(blueCobblestonec, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), bluecobblestone});
		//;GameRegistry.addRecipe(new ItemStack(cabbagepieuncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), cutcabbage, Character.valueOf('Y'), Items.bread});
		//;GameRegistry.addRecipe(new ItemStack(cabbagepieuncooked, 1), new Object[] {" X ", "XYX", Character.valueOf('X'), Blocks.wood, Character.valueOf('Y'), Blocks.torchWood});
		//;GameRegistry.addRecipe(new ItemStack(contract, 1), new Object[] {"XYX", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(contract2, 1), new Object[] {"XY", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(contract3, 1), new Object[] {" X ", "XYX", " X ", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(contract4, 1), new Object[] {"XXX", "XYX", "XXX", Character.valueOf('X'), Items.diamond, Character.valueOf('Y'), Items.paper});
		//;GameRegistry.addRecipe(new ItemStack(cutcabbage, 1), new Object[] {"X", Character.valueOf('X'), cabbage});
		//;GameRegistry.addRecipe(new ItemStack(fishpieuncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.fishCooked, Character.valueOf('Y'), Items.bread});
		GameRegistry.addRecipe(new ItemStack(graniteBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), graniteLump});
		GameRegistry.addRecipe(new ItemStack(graniteChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), graniteLump});
		GameRegistry.addRecipe(new ItemStack(graniteHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), graniteLump});
		GameRegistry.addRecipe(new ItemStack(graniteLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), graniteLump});
		//;GameRegistry.addRecipe(new ItemStack(greenDLeather, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.gold_ingot, Character.valueOf('Y'), GreenDhide});
		GameRegistry.addRecipe(new ItemStack(greendBoots, 1), new Object[] {"X X", "X X", Character.valueOf('X'), greenDLeather});
		GameRegistry.addRecipe(new ItemStack(greendChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), greenDLeather});
		GameRegistry.addRecipe(new ItemStack(greendHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), greenDLeather});
		GameRegistry.addRecipe(new ItemStack(greendLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), greenDLeather});
		GameRegistry.addRecipe(new ItemStack(hilt, 1), new Object[] {" X ", " Y ", " Z ", Character.valueOf('X'), shard1, Character.valueOf('Y'), shard2, Character.valueOf('Z'), shard3});
		//;GameRegistry.addRecipe(new ItemStack(magicBoat, 1), new Object[] { "X X", "XXX", Character.valueOf('X'), magicPlank});
		//;GameRegistry.addRecipe(new ItemStack(magicBow, 1), new Object[] { " XY", "X Y", " XY", Character.valueOf('X'), magicstick, Character.valueOf('Y'), Items.string});
		//;GameRegistry.addRecipe(new ItemStack(magicPlank, 2), new Object[] { "X", Character.valueOf('X'), magiclog});
		//;GameRegistry.addRecipe(new ItemStack(magicSapling, 1), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Items.diamond, Character.valueOf('X'), Yewsapling});
		//;GameRegistry.addRecipe(new ItemStack(magicStairs, 4), new Object[] {"  X", " XX", "XXX", Character.valueOf('X'), magicPlank});
		//;GameRegistry.addRecipe(new ItemStack(magicStick, 1), new Object[] { "X", "X", Character.valueOf('X'), magicPlank});
		GameRegistry.addRecipe(new ItemStack(meatpieuncooked, 1), new Object[] {" X ", " Y ", Character.valueOf('X'), Items.cooked_porkchop, Character.valueOf('Y'), Items.bread});
		GameRegistry.addRecipe(new ItemStack(mithAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(mithBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), mithIngot});
		GameRegistry.addRecipe(new ItemStack(mithChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), mithIngot});
		GameRegistry.addRecipe(new ItemStack(mithHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(mithHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), mithIngot});
		GameRegistry.addRecipe(new ItemStack(mithHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(mithLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), mithIngot});
		GameRegistry.addRecipe(new ItemStack(mithLump, 1), new Object[] {"XYX", Character.valueOf('X'), Items.coal, Character.valueOf('Y'), mithOre});
		GameRegistry.addRecipe(new ItemStack(mithPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', mithIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(mithShovel, 1), new Object[] {" X ", " Y ", " Y ", Character.valueOf('X'), mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(mithSword, 1), new Object[] {" X ", " X ", " Y ", Character.valueOf('X'), mithIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(note1, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(note1, 9), new Object[] {"X", Character.valueOf('X'), note2});
		GameRegistry.addRecipe(new ItemStack(note2, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), note1});
		GameRegistry.addRecipe(new ItemStack(note3, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), note2});
		GameRegistry.addRecipe(new ItemStack(pickaxeGaloreg, 1), new Object[] {"Y", "Y", "X", Character.valueOf('X'), pickaxeGalore, Character.valueOf('Y'), Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(runeAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(runeBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), runeIngot});
		GameRegistry.addRecipe(new ItemStack(runeChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), runeIngot});
		GameRegistry.addRecipe(new ItemStack(runeHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(runeHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), runeIngot});
		GameRegistry.addRecipe(new ItemStack(runeHoe, 1), new Object[] {"XX ", " Y ", " Y ", 'X', runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(runeLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), runeIngot});
		GameRegistry.addRecipe(new ItemStack(runeLump, 1), new Object[] {"XXX", "XYX", "XXX", Character.valueOf('X'), Items.coal, Character.valueOf('Y'), runeOre});
		GameRegistry.addRecipe(new ItemStack(runePickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', runeIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(runeShovel, 1), new Object[] {" X ", " Y ", " Y ", Character.valueOf('X'), runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(runeSword, 1), new Object[] {" X ", " X ", " Y ", Character.valueOf('X'), runeIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addRecipe(new ItemStack(steelHammer, 1), new Object[] {"XXX", "XYX", " Y ", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Y'), Items.stick});
		//;GameRegistry.addRecipe(new ItemStack(stoneBoots, 1), new Object[] { "X X", "X X", Character.valueOf('X'), bluecobblestonec});
		//;GameRegistry.addRecipe(new ItemStack(stoneChestplate, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), bluecobblestonec});
		//;GameRegistry.addRecipe(new ItemStack(stoneHelmet, 1), new Object[] {"XXX", "X X", Character.valueOf('X'), bluecobblestonec});
		//;GameRegistry.addRecipe(new ItemStack(stoneLeggings, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), bluecobblestonec});

		GameRegistry.addSmelting(addyLump, new ItemStack(addyIngot), 1.0F);
		//;GameRegistry.addSmelting(applepieuncooked, new ItemStack(applepie), 1.0F);
		//;GameRegistry.addSmelting(cabbagepieuncooked, new ItemStack(cabbagepie), 1.0F);
		//;GameRegistry.addSmelting(fishpieuncooked, new ItemStack(fishpie), 1.0F);
		//;GameRegistry.addSmelting(meatpieuncooked, new ItemStack(meatpie), 1.0F);
		GameRegistry.addSmelting(mithLump, new ItemStack(mithIngot), 1.0F);
		GameRegistry.addSmelting(runeLump, new ItemStack(runeIngot), 1.0F);


		MinecraftForge.EVENT_BUS.register(new ScapecraftEventHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}

	@SuppressWarnings("unchecked")
	public void registerEntity(Class<? extends Entity> entityClass, String name)
	{
		EntityRegistry.registerModEntity(entityClass, name, currentEntityIdOffset, this, 80, 3, true);
		if(EntityScapecraft.class.isAssignableFrom(entityClass))
			ItemScapecraftSpawnEgg.classes.add((Class<? extends EntityScapecraft>) entityClass);
		currentEntityIdOffset++;
	}
}
