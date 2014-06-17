package src;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class mod_BlocksGalore {
	public static final String modid = "mod_BlocksGalore";
	 public static ToolMaterial ADDY = EnumHelper.addToolMaterial("ADDY", 2, 700, 7.5F, 3.0F, 10);
	 public static ToolMaterial MITH = EnumHelper.addToolMaterial("MITH", 2, 400, 6.5F, 2.0F, 10);
	 public static ToolMaterial RUNE = EnumHelper.addToolMaterial("RUNE", 3, 2000, 10.5F, 4.0F, 10);
	 public static ToolMaterial CHAOTIC = EnumHelper.addToolMaterial("CHAOTIC", 3, 5000, 15.0F, 7.0F, 30);
	 public static ToolMaterial GALOREG = EnumHelper.addToolMaterial("GALOREG", 3, 500, 100.0F, 7.0F, 30);
	 public static ToolMaterial KORASIS = EnumHelper.addToolMaterial("KORASIS", 3, 100, 5.0F, 8.0F, 10);
	 public static ToolMaterial DRAGON = EnumHelper.addToolMaterial("DRAGON", 3, 2500, 15.0F, 5.0F, 30);
	 public static ToolMaterial DRAGONC = EnumHelper.addToolMaterial("DRAGONC", 3, 250, 15.0F, 7.0F, 30);	 
	 public static ToolMaterial BLACK = EnumHelper.addToolMaterial("BLACK", 2, 300, 6.0F, 2.0F, 15);
	 public static ToolMaterial BLACKH = EnumHelper.addToolMaterial("BLACKH", 2, 1500, 6.0F, 3.0F, 15);
	 	 
	 public static ToolMaterial AGSM = EnumHelper.addToolMaterial("AGS", 3, 30000, 15.0F, 16.0F, 30);
	 public static ToolMaterial BGSM = EnumHelper.addToolMaterial("BGS", 3, 30000, 15.0F, 14.0F, 30);
	 public static ToolMaterial SGSM = EnumHelper.addToolMaterial("SGS", 3, 30000, 15.0F, 14.0F, 30);
	 public static ToolMaterial ZGSM = EnumHelper.addToolMaterial("ZGS", 3, 30000, 15.0F, 14.0F, 30);
	 public static ToolMaterial SSM = EnumHelper.addToolMaterial("SS", 3, 30000, 15.0F, 10.0F, 30);
	 
	 public static ToolMaterial CHICKEN = EnumHelper.addToolMaterial("Chicken", 3, 15000000, 15.0F, -4.0F, 100);
	 public static ToolMaterial KERISM = EnumHelper.addToolMaterial("Keris", 3, 15000000, 15.0F, 6.0F, 40);
	 public static ToolMaterial STAKEM = EnumHelper.addToolMaterial("Stake", 3, 150, 15.0F, 1.0F, 40);
	 public static ToolMaterial PITCHFORK = EnumHelper.addToolMaterial("PitchFork", 1, 5000, 3.0F, 1.0F, 100);
	 public static ToolMaterial RAPIERM = EnumHelper.addToolMaterial("RAPIER", 3, 30000, 15.0F, 14.0F, 30);
	 public static ToolMaterial MAULM = EnumHelper.addToolMaterial("MAUL", 3, 30000, 15.0F, 21.0F, 30);	 
	 public static ToolMaterial DRAGOND = EnumHelper.addToolMaterial("DRAGOND", 3, 2500, 15.0F, 3.0F, 30);
	 public static ToolMaterial DRAGONB = EnumHelper.addToolMaterial("DRAGONB", 3, 2500, 15.0F, 8.0F, 30);
	 public static ToolMaterial DRAGONS = EnumHelper.addToolMaterial("DRAGONS", 3, 2500, 15.0F, 7.0F, 30);
	 public static ToolMaterial WHIP = EnumHelper.addToolMaterial("WHIP", 3, 30000, 15.0F, 9.0F, 30);
	 public static ToolMaterial FREMM = EnumHelper.addToolMaterial("FREM", 3, 1000, 15.0F, 7.0F, 5);
	 public static ToolMaterial FREMFM = EnumHelper.addToolMaterial("FREMF", 3, 30000, 15.0F, 12.0F, 5);
	 public static ToolMaterial VESTA = EnumHelper.addToolMaterial("VESTA", 3, 100, 15.0F, 12.0F, 1);
	 public static ToolMaterial AGILITY = EnumHelper.addToolMaterial("AGILITY", 3, 500, 15.0F, 4.0F, 10);
	 public static ToolMaterial DRYGORE = EnumHelper.addToolMaterial("DRYGORE", 3, 30000, 15.0F, 12.0F, 15);
	 
	 
	 public static ToolMaterial STEELH = EnumHelper.addToolMaterial("STEEL", 2, 200, 5.5F, 2.0F, 10);
	 public static ToolMaterial ADDYH = EnumHelper.addToolMaterial("ADDY", 2, 700, 7.5F, 4.0F, 10);
	 public static ToolMaterial MITHH = EnumHelper.addToolMaterial("MITH", 2, 400, 6.5F, 3.0F, 10);
	 public static ToolMaterial RUNEH = EnumHelper.addToolMaterial("RUNE", 3, 2000, 10.5F, 5.0F, 10);
	 
	 public static ToolMaterial TORAG = EnumHelper.addToolMaterial("TORAG", 3, 10000, 15.0F, 11.0F, 8);
	 public static ToolMaterial VERAC = EnumHelper.addToolMaterial("VERAC", 3, 10000, 15.0F, 7.0F, 8);
	 public static ToolMaterial GUTHAN = EnumHelper.addToolMaterial("GUTHAN", 3, 10000, 15.0F, 8.0F, 8);
	 public static ToolMaterial DHAROK = EnumHelper.addToolMaterial("DHAROK", 3, 10000, 15.0F, 9.0F, 8);
	 public static ToolMaterial AHRIM = EnumHelper.addToolMaterial("AHRIM", 3, 10000, 15.0F, 8.0F, 8);
	 public static ToolMaterial AKRISAE = EnumHelper.addToolMaterial("AKRISAE", 3, 10000, 15.0F, 9.0F, 8);
	 
	public static final Block bluecobblestone = (new BlockBlueCobblestone(167,26).setHardness(7.5F).setResistance(10.0F).setBlockName("bluecobblestone"));
	public static final Block KQSpawn = (new BlockKQSpawn(168, 65).setHardness(200000.0F).setResistance(5000.0F).setBlockName("KQspawn"));
	public static final Block KQ2Spawn = (new BlockKQ2Spawn(169, 65).setHardness(200000.0F).setResistance(5000.0F).setBlockName("KQspawn2"));
	public static final Block BLKSpawn = (new BlockBLKSpawn(192, 81).setHardness(40.0F).setResistance(5000.0F).setBlockName("BlackKnightspawn"));
	public static final Block WHITESpawn = (new BlockWHITESpawn(193, 80).setHardness(40.0F).setResistance(5000.0F).setBlockName("WhiteKnightspawn"));
	public static final Block BLKBlock = (new BlockBLKBlock(194, 81).setHardness(40.0F).setResistance(5000.0F).setBlockName("BlackKnightBlock"));
	public static final Block WHITEBlock = (new BlockWHITEBlock(195, 80).setHardness(40.0F).setResistance(5000.0F).setBlockName("WhiteKnightBlock"));
	public static final Block THEIFSpawn = (new BlockTHEIFSpawn(196, 81).setHardness(40.0F).setResistance(5000.0F).setBlockName("Theifspawn"));
	public static final Block GUARDSpawn = (new BlockGUARDSpawn(197, 80).setHardness(40.0F).setResistance(5000.0F).setBlockName("Guardspawn"));
	public static final Block LESSERSpawn = (new BlockLesserSpawn(176, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("Lesserspawn"));
	public static final Block LESSERSpawn2 = (new BlockLesserSpawn2(198, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("Lesserspawn2"));
	public static final Block WIZARDSpawn = (new BlockWizardSpawn(162, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("Wizardspawn"));
	public static final Block DARKWIZARDSpawn = (new BlockDarkwizardSpawn(163, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("DarkWizardspawn"));
	public static final Block GOBLINSpawn = (new BlockGoblinSpawn(164, 92).setHardness(40.0F).setResistance(5000.0F).setBlockName("Goblinspawn"));
	public static final Block SCORPIONSpawn = (new BlockScorpionSpawn(165, 93).setHardness(40.0F).setResistance(5000.0F).setBlockName("Scorpionspawn"));
	public static final Block ABBYDEMONSpawn = (new BlockAbbyDemonSpawn(166, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("AbbyDemonSpawn"));
	public static final Block GreenDragonSpawn = (new BlockGreenDragonSpawn(183, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("GreenDragonSpawn"));
	public static final Block IronDragonSpawn = (new BlockIronDragonSpawn(188).setHardness(40.0F).setResistance(5000.0F).setBlockName("IronDragonSpawn"));
	public static final Block HardIceBlock = (new BlockHardIce(189).setHardness(40.0F).setResistance(5000.0F).setBlockName("HardIceBlock"));
	public static final Block IceGiantSpawn = (new BlockIceGiantSpawn(184, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("IceGiantSpawn"));
	public static final Block BotSpawn = (new BlockBotSpawn(185, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("BotSpawn"));
	public static final Block DwarfSpawn = (new BlockDwarfSpawn(186, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("DwarfSpawn"));
	public static final Block HighMageSpawn = (new BlockHighMageSpawn(190, 90).setHardness(1500.0F).setResistance(5000.0F).setBlockName("HighMageSpawn"));
	public static final Block HellhoundSpawn = (new BlockHellhoundSpawn(191, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("HellhoundSpawn"));
	public static final Block KingSpawn = (new BlockKingSpawn(223, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("KingSpawn"));
	public static final Block KingGuardSpawn = (new BlockKingGuardSpawn(222, 80).setHardness(40.0F).setResistance(5000.0F).setBlockName("KingGuardSpawn"));
	public static final Block HeroKnightSpawn = (new BlockHeroKnightSpawn(221, 80).setHardness(40.0F).setResistance(5000.0F).setBlockName("HeroKnightSpawn"));
	public static final Block EliteBlackSpawn = (new BlockEliteBlackKnightSpawn(229, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("EliteBlackKnightSpawn"));
	public static final Block BarbSpawn = (new BlockBarbSpawn(2290, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("BarbSpawn"));
	public static final Block ShopKeeperSpawn = (new BlockShopKeeperSpawn(2291, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("ShopKeeperSpawn"));
	public static final Block Coffin = (new BlockCoffin(2292, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("Coffin"));
	public static final Block Coffin2 = (new BlockCoffin2(2293, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("Coffin2"));
	public static final Block DoctorSpawn = (new BlockDoctorSpawn(2294, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("DoctorSpawn"));
	public static final Block ManSpawn = (new BlockManSpawn(2295, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("ManSpawn"));
	public static final Block MorganSpawn = (new BlockMorganSpawn(2296, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("MorganSpawn"));
	public static final Block TDSpawn = (new BlockTDSpawn(2297, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("TDSpawn"));
	public static final Block RatSpawn = (new BlockRatSpawn(2298, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("RatSpawn"));
	public static final Block SmallRatSpawn = (new BlockSmallRatSpawn(2299, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("SmallRatSpawn"));
	public static final Block FremGuardSpawn = (new BlockFremGuardSpawn(2300, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("FremGuardSpawn"));
	public static final Block KosSpawn = (new BlockKosSpawn(2301, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("KosSpawn"));
	public static final Block KosTele = (new BlockKosTele(2302, 80).setHardness(400000.0F).setResistance(5000.0F).setBlockName("KosTele"));
	public static final Block BlackDragonSpawn = (new BlockBlackDragonSpawn(2303, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("BlackDragonSpawn"));
	public static final Block bluecobblestonec = (new BlockBlueCobblestoneC(2304,26).setHardness(7.5F).setResistance(10.0F).setBlockName("bluecobblestonec"));
	public static final Block VarzeSpawn = (new BlockVarzeSpawn(3000, 90).setHardness(40.0F).setResistance(5000.0F).setBlockName("VarzeSpawn"));
	public static final Block BlackGuardSpawn = (new BlockBlackGuardpawn(3001, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("BlackGuardSpawn"));
	public static final Block BlackGuard2Spawn = (new BlockBlackGuard2Spawn(3002, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("BlackGuard2Spawn"));
	public static final Block HillGiantSpawn = (new BlockHillGiantSpawn(3003, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("HillGiantSpawn"));
	public static final Block FireGiantSpawn = (new BlockFireGiantSpawn(3004, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("FireGiantSpawn"));	
	public static final Block MossGiantSpawn = (new BlockMossGiantSpawn(3005, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("MossGiantSpawn"));
	public static final Block CaveCrawlerSpawn = (new BlockCaveCrawlerSpawn(3006, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("CaveCrawlerSpawn"));
	public static final Block GhostSpawn = (new BlockGhostSpawn(3007, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("GhostSpawn"));
	public static final Block BlackDemonSpawn = (new BlockBlackDemonSpawn(3008, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("BlackDemonSpawn"));
	public static final Block CookSpawn = (new BlockCookSpawn(3009, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("CookSpawn"));
	public static final Block AgilityBlock = (new BlockAgilityBlock(3010, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("AgilityBlock"));
	public static final Block AgilityBlock2 = (new BlockAgilityBlock2(3011, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("AgilityBlock2"));
	public static final Block AgilityBlock3 = (new BlockAgilityBlock3(3012, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("AgilityBlock3"));
	public static final Block KKSpawn = (new BlockKKSpawn(3013, 90).setHardness(400.0F).setResistance(5000.0F).setBlockName("KKSpawn"));
	
	
	public static final Block BandosMinion1Spawn = (new BlockBandosMinion1(224, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("BandosMinion1Spawn"));
	public static final Block BandosMinion2Spawn = (new BlockBandosMinion2(225, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("BandosMinion2Spawn"));
	public static final Block BandosMinion3Spawn = (new BlockBandosMinion3(226, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("BandosMinion3Spawn"));
	public static final Block BandosBossSpawn = (new BlockBandosBoss(227, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("BandosBoss"));
	
	public static final Block KeyBlock = (new BlockKeyBlock(230, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("KeyBlock"));
	public static final Block OpenKeyBlock = (new BlockOpenKeyBlock(231, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("OpenKeyBlock"));
	public static final Block KeyBlock2 = (new BlockKeyBlock2(2305, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("KeyBlock2"));
	public static final Block OpenKeyBlock2 = (new BlockOpenKeyBlock2(2306, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("OpenKeyBlock2"));
	
	
	public static final Block Mithore = (new BlockMithore(178, 29).setHardness(30.0F).setResistance(5.0F).setBlockName("Mithore"));
	public static final Block Addyore = (new BlockAddyore(179, 41).setHardness(60.0F).setResistance(5.0F).setBlockName("Addyore"));
	public static final Block Runeore = (new BlockRuneore(180, 53).setHardness(80.0F).setResistance(50.0F).setBlockName("Runeore"));
	public static final Block Scapecraft = (new BlockScapecraft(228, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("Scapecraft"));
	//public static final Block gifblock = (new Blockgifblock(220, 200).setHardness(40.0F).setResistance(50.0F));
	public static final Block FarmerSpawn = (new BlockFarmerSpawner(239, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("FarmerSpawn"));
	public static final Block WoolGate = (new BlockWoolGate(2500, 80).setHardness(200000.0F).setResistance(5000.0F).setBlockName("WoolGate"));
	
	
	public static final Block MithoreSpawn = (new BlockMithoreSpawn(2600, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("MithoreSpawn"));
	public static final Block RuneoreSpawn = (new BlockRuneoreSpawn(2601, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("RuneoreSpawn"));
	public static final Block AddyoreSpawn = (new BlockAddyoreSpawn(2602, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("AddyoreSpawn"));
	public static final Block CobblestoneSpawn = (new BlockCobblestoneSpawn(2603, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("CobblestoneSpawn"));
	public static final Block CoalSpawn = (new BlockCoalSpawn(2604, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("CoalSpawn"));
	public static final Block RedStoneSpawn = (new BlockRedStoneSpawn(2605, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("RedStoneSpawn"));
	public static final Block DiamondSpawn = (new BlockDiamondSpawn(2606, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("DiamondSpawn"));
	public static final Block BlueCobbleSpawn = (new BlockBlueCobbleSpawn(2607, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("BlueCobbleSpawn"));
	public static final Block GoldSpawn = (new BlockGoldSpawn(2608, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("GoldSpawn"));
	public static final Block EmeraldSpawn = (new BlockEmeraldSpawn(2609, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("EmeraldSpawn"));
	public static final Block IronSpawn = (new BlockIronSpawn(2610, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("IronSpawn"));
	public static final Block SandSpawn = (new BlockSandSpawn(2611, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("SandSpawn"));
	public static final Block DirtSpawn = (new BlockDirtSpawn(2612, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("DirtSpawn"));
	public static final Block SandStoneSpawn = (new BlockStoneSpawn(2613, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("SandstoneSpawn"));
	public static final Block CabbageSpawn = (new BlockCabbageSpawn(2614, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("CabbageSpawn"));
	public static final Block GravelSpawn = (new BlockGravelSpawn(2615, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("GravelSpawn"));
	public static final Block AnvilSpawn = (new BlockAnvilSpawn(2616, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("AnvilSpawn"));
	public static final Block OakTreeSpawn = (new BlockOakTreeSpawn(2617, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("OakTreeAnvilSpawn"));
	public static final Block YewTreeSpawn = (new BlockYewTreeSpawn(2618, 29).setHardness(200000.0F).setResistance(5000.0F).setBlockName("YewTreeSpawn"));	
	
	public static final Item pickaxeGalore = new ItemPickaxeGalore(1351, DRAGON).setTextureName("mod_BlocksGalore:pickaxegalore");
	public static final Item PickaxeGaloreg = new ItemPickaxeGaloreg(1352, GALOREG).setTextureName("mod_BlocksGalore:pickaxegaloreg");
	public static final Item Mithpickaxe = new ItemMithpickaxe(1540, MITH).setTextureName("mod_BlocksGalore:Mithpickaxe");
	public static final Item Mithsword = new ItemMithsword(1550, MITH).setTextureName("mod_BlocksGalore:Mithsword");
	public static final Item Mithhoe = new ItemMithhoe(1560, MITH).setTextureName("mod_BlocksGalore:MithHoe");
	public static final Item Mithshovel = new ItemMithshovel(1570, MITH).setTextureName("mod_BlocksGalore:Mithshovel");
	public static final Item Mithaxe = new ItemMithaxe(1580,  MITH).setTextureName("mod_BlocksGalore:Mithaxe");
	public static final Item Mithlump = new ItemMithlump(1590).setTextureName("mod_BlocksGalore:mithlump");
	public static final Item Mithingot = new ItemMithingot(1600).setTextureName("mod_BlocksGalore:mithingot");
	
	public static final Item Addypickaxe = new ItemAddypickaxe(1610,ADDY).setTextureName("mod_BlocksGalore:Addypickaxe");
	public static final Item Addysword = new ItemAddysword(1620,ADDY).setTextureName("mod_BlocksGalore:Addysword");
	public static final Item Addyhoe = new ItemAddyhoe(1630,  ADDY).setTextureName("mod_BlocksGalore:Addyhoe");
	public static final Item Addyshovel = new ItemAddyshovel(1640,ADDY).setTextureName("mod_BlocksGalore:Addyshovel");
	public static final Item Addyaxe = new ItemAddyaxe(1650, ADDY).setTextureName("mod_BlocksGalore:Addyaxe");
	public static final Item Addylump = new ItemAddylump(1660).setTextureName("mod_BlocksGalore:Addylump");
	public static final Item Addyingot = new ItemAddyingot(1670).setTextureName("mod_BlocksGalore:Addyingot");
	
	public static final Item Runepickaxe = new ItemRunepickaxe(1680, RUNE).setTextureName("mod_BlocksGalore:Runepickaxe");
	public static final Item Runesword = new ItemRunesword(1690, RUNE).setTextureName("mod_BlocksGalore:Runesword");
	public static final Item Runehoe = new ItemRunehoe(1700, RUNE).setTextureName("mod_BlocksGalore:Runehoe");
	public static final Item Runeshovel = new ItemRuneshovel(1710, RUNE).setTextureName("mod_BlocksGalore:Runeshovel");
	public static final Item Runeaxe = new ItemRuneaxe(1720,  RUNE).setTextureName("mod_BlocksGalore:Runeaxe");
	public static final Item Runelump = new ItemRunelump(1730).setTextureName("mod_BlocksGalore:Runelump");
	public static final Item Runeingot = new ItemRuneingot(1740).setTextureName("mod_BlocksGalore:Runeingot");
	
	public static final Item dlong = new Itemdlong(1350,  DRAGON).setTextureName("mod_BlocksGalore:dlong");
	public static final Item Blacksword = new ItemBlacksword(1750, BLACK).setTextureName("mod_BlocksGalore:BlackSword");
	public static final Item Whitesword = new ItemWhitesword(1760, BLACK).setTextureName("mod_BlocksGalore:WhiteSword");
	public static final Item korasis = new Itemkorasis(15300, KORASIS).setTextureName("mod_BlocksGalore:Korasisword");
	
	
	public static final Item RAPIER = new ItemRAPIER(20300, RAPIERM).setTextureName("mod_BlocksGalore:Rapier").setFull3D();
	public static final Item DD = new ItemDD(20201, DRAGOND).setTextureName("mod_BlocksGalore:DragonDagger").setFull3D();
	public static final Item DDS = new ItemDDS(20202, DRAGOND).setTextureName("mod_BlocksGalore:DragonDaggerS").setFull3D();
	public static final Item DBA = new ItemDBA(20200, DRAGONB).setTextureName("mod_BlocksGalore:DragonBattleaxe").setFull3D();
	public static final Item Sarastaff = new ItemSarastaff(13380).setTextureName("mod_BlocksGalore:Sarastaff").setFull3D();
	public static final Item Zammystaff = new ItemZammystaff(13390).setTextureName("mod_BlocksGalore:Zammystaff").setFull3D();
	public static final Item Guthixstaff = new ItemGuthixstaff(13400).setTextureName("mod_BlocksGalore:Guthixstaff").setFull3D();
	public static final Item Armastaff = new ItemArmastaff(13401).setTextureName("mod_BlocksGalore:Armastaff").setFull3D();
	public static final Item Whip = new ItemWhip(14000, WHIP).setTextureName("mod_BlocksGalore:Whip").setFull3D();
	public static final Item BGS = new ItemBGS(14100,BGSM).setTextureName("mod_BlocksGalore:BandosGodsword").setFull3D();
	public static final Item ZGS = new ItemZGS(14101,ZGSM).setTextureName("mod_BlocksGalore:ZamorakGodsword").setFull3D();
	public static final Item AGS = new ItemAGS(14102,AGSM).setTextureName("mod_BlocksGalore:ArmadylGodsword").setFull3D();
	public static final Item SGS = new ItemSGS(14103,SGSM).setTextureName("mod_BlocksGalore:SaradominGodsword").setFull3D();
	public static final Item SteelHammer = new ItemSteelHammer(14104, STEELH).setTextureName("mod_BlocksGalore:SteelWarhammer").setFull3D();
	public static final Item MithHammer = new ItemMithHammer(14105, MITHH).setTextureName("mod_BlocksGalore:MithHammer").setFull3D();
	public static final Item AddyHammer = new ItemAddyHammer(14108,ADDYH).setTextureName("mod_BlocksGalore:AddyHammer").setFull3D();
	public static final Item RuneHammer = new ItemRuneHammer(14109, RUNEH).setTextureName("mod_BlocksGalore:RuneHammer").setFull3D();
	
	public static final Item Dragonaxe = new ItemDragonaxe(13530,  DRAGONB).setTextureName("mod_BlocksGalore:Dragonaxe");
	public static final Item DragonScimmy = new ItemDragonScimmy(13531, DRAGONS).setTextureName("mod_BlocksGalore:DragonScimmy");
	public static final Item chicken = new Itemchicken(13532, CHICKEN).setTextureName("mod_BlocksGalore:chicken");
	public static final Item keris = new ItemKeris(13533, KERISM).setTextureName("mod_BlocksGalore:keris");
	public static final Item Stake = new ItemStake(18888, STAKEM).setTextureName("mod_BlocksGalore:stake");
	public static final Item fremsword = new ItemFremSword(18889, FREMM).setTextureName("mod_BlocksGalore:fremsword");
	public static final Item fremswordf = new ItemFremSwordf(18890, FREMFM).setTextureName("mod_BlocksGalore:fremswordf");
	public static final Item VestaSword = new ItemVestaSword(18891, VESTA).setTextureName("mod_BlocksGalore:VestaSword");
	public static final Item DragonCscimmy = new ItemDragonCscimmy(18892, DRAGONC).setTextureName("mod_BlocksGalore:DragonCscimmy");
	public static final Item AgilitySword = new ItemAgilitySword(18893, AGILITY).setTextureName("mod_BlocksGalore:AgilitySword");
	
	public static final Item DryRapier = new ItemDryRapier(18894, DRYGORE).setTextureName("mod_BlocksGalore:DryRapier");
	public static final Item DryLong = new ItemDryLong(18895, DRYGORE).setTextureName("mod_BlocksGalore:DryLong");	
	public static final Item DryMace = new ItemDryMace(18896, DRYGORE).setTextureName("mod_BlocksGalore:DryMace");
	public static final Item D2H = new ItemD2H(18897, WHIP).setTextureName("mod_BlocksGalore:D2H");
	 
	
	public static final Item contract = new ItemContract(13402).setTextureName("mod_BlocksGalore:contract");
	public static final Item contract2 = new ItemContract2(13403).setTextureName("mod_BlocksGalore:contract2");
	public static final Item contract3 = new ItemContract3(13404).setTextureName("mod_BlocksGalore:contract3");
	public static final Item contract4 = new ItemContract4(13416).setTextureName("mod_BlocksGalore:contract4");
	
	public static final Item note1 = new ItemNote1(13405).setTextureName("mod_BlocksGalore:goldnote1");
	public static final Item note2 = new ItemNote2(13406).setTextureName("mod_BlocksGalore:goldnote2");
	public static final Item note3 = new ItemNote3(13407).setTextureName("mod_BlocksGalore:goldnote3");

	public static final Item shard1 = new ItemShard1(13408).setTextureName("mod_BlocksGalore:shard1");
	public static final Item shard2 = new ItemShard2(13409).setTextureName("mod_BlocksGalore:shard2");
	public static final Item shard3 = new ItemShard3(13410).setTextureName("mod_BlocksGalore:shard3");
	public static final Item Hilt = new ItemHilt(13415).setTextureName("mod_BlocksGalore:hilt");
	
	public static final Item BandosHilt = new ItemBandosHilt(13411).setTextureName("mod_BlocksGalore:BandosHilt");
	public static final Item ArmadylHilt = new ItemArmadylHilt(13412).setTextureName("mod_BlocksGalore:ArmadylHilt");
	public static final Item SaradominHilt = new ItemSaradominHilt(13413).setTextureName("mod_BlocksGalore:SaradominHilt");
	public static final Item ZamorakHilt = new ItemZamorakHilt(13414).setTextureName("mod_BlocksGalore:ZamorakHilt");

	public static final Item sarasword = new ItemSaraSword(14110, SSM).setTextureName("mod_BlocksGalore:sarasword").setFull3D();

	public static final Item ToragHammer = new ItemToragHammer(14111, TORAG).setTextureName("mod_BlocksGalore:ToragHammerinv").setFull3D();
	public static final Item VeracFlail = new ItemVeracFlail(14112, VERAC).setTextureName("mod_BlocksGalore:VeracFlailinv").setFull3D();
	public static final Item GuthanSpear = new ItemGuthanSpear(14113, GUTHAN).setTextureName("mod_BlocksGalore:GuthanSpearinv").setFull3D();
	public static final Item DharokAxe = new ItemDharokAxe(14114, DHAROK).setTextureName("mod_BlocksGalore:DharokAxeinv").setFull3D();
	public static final Item AhrimStaff = new ItemAhrimStaff(14115, AHRIM).setTextureName("mod_BlocksGalore:AhrimStaffinv").setFull3D();
	public static final Item AkrisaeMace = new ItemAkrisaeMace(14116, AKRISAE).setTextureName("mod_BlocksGalore:AkrisaeMaceinv").setFull3D();
	public static final Item PitchFork = new ItemPitchFork(14117, PITCHFORK).setTextureName("mod_BlocksGalore:PitchFork").setFull3D();
	
	public static final Item BlackHalberd = new ItemBlackHalberd(14118, BLACKH).setTextureName("mod_BlocksGalore:BlackHalberd").setFull3D();
	public static final Item Cmaul = new ItemCmaul(14119, MAULM).setTextureName("mod_BlocksGalore:Cmaul").setFull3D();
	

	public void load()

	{		    
		GameRegistry.registerBlock(bluecobblestone, null);
		LanguageRegistry.addName(bluecobblestone, "Blue Cobblestone");
		GameRegistry.registerBlock(bluecobblestonec, null);
		LanguageRegistry.addName(bluecobblestonec, "Concentrated Blue Cobblestone");
		GameRegistry.registerBlock(KKSpawn, null);
		LanguageRegistry.addName(KKSpawn, "Kalaphite King spawner");
		GameRegistry.registerBlock(KQSpawn, null);
		LanguageRegistry.addName(KQSpawn, "Kalaphite Queen spawner");
		GameRegistry.registerBlock(KQ2Spawn, null);
		LanguageRegistry.addName(KQ2Spawn, "Kalaphite spawner");
		GameRegistry.registerBlock(BLKSpawn, null);
		LanguageRegistry.addName(BLKSpawn, "Black Knight spawner");
		GameRegistry.registerBlock(WHITESpawn, null);
		LanguageRegistry.addName(WHITESpawn, "White Knight spawner");
		GameRegistry.registerBlock(BLKBlock, null);
		LanguageRegistry.addName(BLKBlock, "Black Block");
		GameRegistry.registerBlock(WHITEBlock, null);
		LanguageRegistry.addName(WHITEBlock, "White Block");
		GameRegistry.registerBlock(THEIFSpawn, null);
		LanguageRegistry.addName(THEIFSpawn, "Thief spawner");
		GameRegistry.registerBlock(GUARDSpawn, null);
		LanguageRegistry.addName(GUARDSpawn, "Guard spawner");
		GameRegistry.registerBlock(LESSERSpawn, null);
		LanguageRegistry.addName(LESSERSpawn, "Old Lesser Demon spawner");
		GameRegistry.registerBlock(LESSERSpawn2, null);
		LanguageRegistry.addName(LESSERSpawn2, "Lesser Demon spawner");
		GameRegistry.registerBlock(WIZARDSpawn, null);
		LanguageRegistry.addName(WIZARDSpawn, "Good Wizard spawner");
		GameRegistry.registerBlock(DARKWIZARDSpawn, null);
		LanguageRegistry.addName(DARKWIZARDSpawn, "Dark Wizard spawner");
		GameRegistry.registerBlock(HighMageSpawn, null);
		LanguageRegistry.addName(HighMageSpawn, "High Mage spawner");
		GameRegistry.registerBlock(GOBLINSpawn, null);
		LanguageRegistry.addName(GOBLINSpawn, "Goblin spawner");
		GameRegistry.registerBlock(SCORPIONSpawn, null);
		LanguageRegistry.addName(SCORPIONSpawn, "Scorpion spawner");
		GameRegistry.registerBlock(ABBYDEMONSpawn, null);
		LanguageRegistry.addName(ABBYDEMONSpawn, "Abyssal Demon spawner");
		GameRegistry.registerBlock(GreenDragonSpawn, null);
		LanguageRegistry.addName(GreenDragonSpawn, "Green Dragon spawner");
		GameRegistry.registerBlock(BlackDragonSpawn, null);
		LanguageRegistry.addName(BlackDragonSpawn, "Black Dragon spawner");
		GameRegistry.registerBlock(IronDragonSpawn, null);
		LanguageRegistry.addName(IronDragonSpawn, "Iron Dragon spawner");
		GameRegistry.registerBlock(IceGiantSpawn, null);
		LanguageRegistry.addName(IceGiantSpawn, "Ice Giant spawner");
		GameRegistry.registerBlock(BotSpawn, null);
		LanguageRegistry.addName(BotSpawn, "Bot spawner");
		GameRegistry.registerBlock(DwarfSpawn, null);
		LanguageRegistry.addName(DwarfSpawn, "Dwarf spawner");
		GameRegistry.registerBlock(HardIceBlock, null);
		LanguageRegistry.addName(HardIceBlock, "Hardened Ice Block");
		GameRegistry.registerBlock(HellhoundSpawn, null);
		LanguageRegistry.addName(HellhoundSpawn, "Hellhound spawner");
		GameRegistry.registerBlock(KingSpawn, null);
		LanguageRegistry.addName(KingSpawn, "King spawner");
		GameRegistry.registerBlock(KingGuardSpawn, null);
		LanguageRegistry.addName(KingGuardSpawn, "King's Guard spawner");
		GameRegistry.registerBlock(HeroKnightSpawn, null);
		LanguageRegistry.addName(HeroKnightSpawn, "Hero Knight Spawner");
		GameRegistry.registerBlock(EliteBlackSpawn, null);
		LanguageRegistry.addName(EliteBlackSpawn, "Elite Black Knight Spawner");
		LanguageRegistry.addName(FarmerSpawn, "Farmer spawner");GameRegistry.registerBlock(FarmerSpawn, null);
		LanguageRegistry.addName(BarbSpawn, "Barbarian spawner");GameRegistry.registerBlock(BarbSpawn, null);
		LanguageRegistry.addName(ShopKeeperSpawn, "ShopKeeper spawner");GameRegistry.registerBlock(ShopKeeperSpawn, null);
		LanguageRegistry.addName(Coffin, "Coffin");GameRegistry.registerBlock(Coffin, null);
		LanguageRegistry.addName(Coffin2, "Coffin");GameRegistry.registerBlock(Coffin2, null);
		LanguageRegistry.addName(DoctorSpawn, "Dr Harlow spawner(quest)");GameRegistry.registerBlock(DoctorSpawn, null);
		LanguageRegistry.addName(ManSpawn, "Normal Man spawner");GameRegistry.registerBlock(ManSpawn, null);
		LanguageRegistry.addName(MorganSpawn, "Morgan spawner (quest)");GameRegistry.registerBlock(MorganSpawn, null);
		LanguageRegistry.addName(TDSpawn, "Tormented Demon Spawner");GameRegistry.registerBlock(TDSpawn, null);
		LanguageRegistry.addName(RatSpawn, "Rat Spawner");GameRegistry.registerBlock(RatSpawn, null);
		LanguageRegistry.addName(SmallRatSpawn, "Small Rat Spawner");GameRegistry.registerBlock(SmallRatSpawn, null);
		LanguageRegistry.addName(FremGuardSpawn, "Fremmick Guard Spawner");GameRegistry.registerBlock(FremGuardSpawn, null);
		LanguageRegistry.addName(KosSpawn, "Kos Spawner");GameRegistry.registerBlock(KosSpawn, null);
		LanguageRegistry.addName(KosTele, "Kos Teleport Block");GameRegistry.registerBlock(KosTele, null);
		GameRegistry.registerBlock(VarzeSpawn, null);LanguageRegistry.addName(VarzeSpawn, "Sir Amik Varze Spawner");
		GameRegistry.registerBlock(BlackGuardSpawn, null);LanguageRegistry.addName(BlackGuardSpawn, "Black Guard Spawner");
		GameRegistry.registerBlock(BlackGuard2Spawn, null);LanguageRegistry.addName(BlackGuard2Spawn, "Black Fortress Guard Spawner");
		GameRegistry.registerBlock(HillGiantSpawn, null);LanguageRegistry.addName(HillGiantSpawn, "Hill Giant Spawner");
		GameRegistry.registerBlock(FireGiantSpawn, null);LanguageRegistry.addName(FireGiantSpawn, "Fire Giant Spawner");		
		GameRegistry.registerBlock(MossGiantSpawn, null);LanguageRegistry.addName(MossGiantSpawn, "Moss Giant Spawner");
		GameRegistry.registerBlock(CaveCrawlerSpawn, null);LanguageRegistry.addName(CaveCrawlerSpawn, "Cave Crawler Spawner");
		GameRegistry.registerBlock(GhostSpawn, null);LanguageRegistry.addName(CaveCrawlerSpawn, "Ghost Spawner");
		GameRegistry.registerBlock(BlackDemonSpawn, null);LanguageRegistry.addName(BlackDemonSpawn, "Black Demon Spawner");
		GameRegistry.registerBlock(CookSpawn, null);LanguageRegistry.addName(CookSpawn, "Cook Spawner");
		GameRegistry.registerBlock(AgilityBlock, null);LanguageRegistry.addName(AgilityBlock, "Agility Block 1xp");
		GameRegistry.registerBlock(AgilityBlock2, null);LanguageRegistry.addName(AgilityBlock2, "Agility Block 5xp");
		GameRegistry.registerBlock(AgilityBlock3, null);LanguageRegistry.addName(AgilityBlock3, "Agility Block 20xp");
		
		
		LanguageRegistry.addName(BandosMinion1Spawn, "Sergeant Grimspike spawner");GameRegistry.registerBlock(BandosMinion1Spawn, null);
		LanguageRegistry.addName(BandosMinion2Spawn, "Sergeant Steelwill spawner");GameRegistry.registerBlock(BandosMinion2Spawn, null);
		LanguageRegistry.addName(BandosMinion3Spawn, "Sergeant Strongstack spawner");GameRegistry.registerBlock(BandosMinion3Spawn, null);
		LanguageRegistry.addName(BandosBossSpawn, "General Graardor spawner");GameRegistry.registerBlock(BandosBossSpawn, null);
		
		GameRegistry.registerBlock(MithoreSpawn, null);LanguageRegistry.addName(MithoreSpawn, "Mithril Ore Spawn");
		GameRegistry.registerBlock(AddyoreSpawn, null);LanguageRegistry.addName(AddyoreSpawn, "Adamant Ore Spawn");
		GameRegistry.registerBlock(RuneoreSpawn, null);LanguageRegistry.addName(RuneoreSpawn, "Rune Ore Spawn");
		GameRegistry.registerBlock(CoalSpawn, null);LanguageRegistry.addName(CoalSpawn, "Coal Ore Spawn");
		GameRegistry.registerBlock(CobblestoneSpawn, null);LanguageRegistry.addName(CobblestoneSpawn, "Cobblestone Spawn");
		GameRegistry.registerBlock(DirtSpawn, null);LanguageRegistry.addName(DirtSpawn, "Dirt Spawn");
		GameRegistry.registerBlock(BlueCobbleSpawn, null);LanguageRegistry.addName(BlueCobbleSpawn, "BlueCobble Spawn");
		GameRegistry.registerBlock(SandSpawn, null);LanguageRegistry.addName(SandSpawn, "Sand Spawn");
		GameRegistry.registerBlock(SandStoneSpawn, null);LanguageRegistry.addName(SandStoneSpawn, "SandStone Spawn");
		GameRegistry.registerBlock(DiamondSpawn, null);LanguageRegistry.addName(DiamondSpawn, "Diamond Spawn");
		GameRegistry.registerBlock(EmeraldSpawn, null);LanguageRegistry.addName(EmeraldSpawn, "Emerald Spawn");
		GameRegistry.registerBlock(RedStoneSpawn, null);LanguageRegistry.addName(RedStoneSpawn, "Redstone Ore Spawn");
		GameRegistry.registerBlock(IronSpawn, null);LanguageRegistry.addName(IronSpawn, "Iron Ore Spawn");
		GameRegistry.registerBlock(GoldSpawn, null);LanguageRegistry.addName(GoldSpawn, "Gold Ore Spawn");
		GameRegistry.registerBlock(CabbageSpawn, null);LanguageRegistry.addName(CabbageSpawn, "Cabbage Spawn");
		GameRegistry.registerBlock(GravelSpawn, null);LanguageRegistry.addName(GravelSpawn, "Gravel Spawn");
		GameRegistry.registerBlock(AnvilSpawn, null);LanguageRegistry.addName(AnvilSpawn, "Anvil Spawn");
		GameRegistry.registerBlock(OakTreeSpawn, null);LanguageRegistry.addName(OakTreeSpawn, "OakTree Spawn");
		GameRegistry.registerBlock(YewTreeSpawn, null);LanguageRegistry.addName(YewTreeSpawn, "YewTree Spawn");
		
		
		
		
		LanguageRegistry.addName(Scapecraft, "Read This Block!");GameRegistry.registerBlock(Scapecraft, null);
		LanguageRegistry.addName(KeyBlock, "Locked Door (Barrows)");GameRegistry.registerBlock(KeyBlock, null);
		LanguageRegistry.addName(OpenKeyBlock, "Open Door(Barrows)");GameRegistry.registerBlock(OpenKeyBlock, null);
		LanguageRegistry.addName(KeyBlock2, "Locked Door (Fortress)");GameRegistry.registerBlock(KeyBlock2, null);
		LanguageRegistry.addName(OpenKeyBlock2, "Open Door(Fortress)");GameRegistry.registerBlock(OpenKeyBlock2, null);
		LanguageRegistry.addName(WoolGate, "20 wool block (Quest)");GameRegistry.registerBlock(WoolGate, null);
		
		
	
		GameRegistry.registerBlock(Mithore, null);
		GameRegistry.registerBlock(Addyore, null);
		GameRegistry.registerBlock(Runeore, null);
		
		LanguageRegistry.addName(Mithpickaxe, "Mithril Pickaxe");
		LanguageRegistry.addName(Mithsword, "Mithril Sword");
		LanguageRegistry.addName(Mithhoe, "Mithril Hoe");
		LanguageRegistry.addName(Mithshovel, "Mithril Shovel");
		LanguageRegistry.addName(Mithaxe, "Mithril Axe");
		LanguageRegistry.addName(Mithore, "Mithril Ore");
		LanguageRegistry.addName(Mithlump, "Mithril Lump");
		LanguageRegistry.addName(Mithingot, "Mithril Ingot");

		
		LanguageRegistry.addName(Addypickaxe, "Adamant Pickaxe");
		LanguageRegistry.addName(Addysword, "Adamant Sword");
		LanguageRegistry.addName(Addyhoe, "Adamant Hoe");
		LanguageRegistry.addName(Addyshovel, "Adamant Shovel");
		LanguageRegistry.addName(Addyaxe, "Adamant Axe");
		LanguageRegistry.addName(Addyore, "Adamant Ore");
		LanguageRegistry.addName(Addylump, "Adamant Lump");
		LanguageRegistry.addName(Addyingot, "Adamant Ingot");
		
		LanguageRegistry.addName(Runepickaxe, "Rune Pickaxe");
		LanguageRegistry.addName(Runesword, "Rune Sword");
		LanguageRegistry.addName(Runehoe, "Rune Hoe");
		LanguageRegistry.addName(Runeshovel, "Rune Shovel");
		LanguageRegistry.addName(Runeaxe, "Rune Axe");
		LanguageRegistry.addName(Runeore, "Rune Ore");
		LanguageRegistry.addName(Runelump, "Rune Lump");
		LanguageRegistry.addName(Runeingot, "Rune Ingot");
		
		LanguageRegistry.addName(pickaxeGalore, "Dragon Pickaxe");
		LanguageRegistry.addName(PickaxeGaloreg, "Dragon Pickaxe(G)");
		LanguageRegistry.addName(dlong, "Dragon Longsword");
		LanguageRegistry.addName(DragonScimmy, "Dragon Scimitar");
		LanguageRegistry.addName(DBA, "Dragon Battleaxe");
		LanguageRegistry.addName(DD, "Dragon Dagger");
		LanguageRegistry.addName(DDS, "Dragon Dagger(s)");
		LanguageRegistry.addName(Blacksword, "Black Sword");
		LanguageRegistry.addName(Whitesword, "White Sword");
		LanguageRegistry.addName(korasis, "Korasi's sword");
		
		LanguageRegistry.addName(BGS, "Bandos Godsword");
		LanguageRegistry.addName(ZGS, "Zamorak Godsword");
		LanguageRegistry.addName(AGS, "Armadyl Godsword");
		LanguageRegistry.addName(SGS, "Saradomin Godsword");
		LanguageRegistry.addName(RAPIER, "Chaotic Rapier");
		LanguageRegistry.addName(Whip, "Abyssal Whip");
		LanguageRegistry.addName(Sarastaff, "Saradomin's Staff");
		LanguageRegistry.addName(Zammystaff, "Zamorak's Staff");
		LanguageRegistry.addName(Guthixstaff, "Guthix's Staff");
		LanguageRegistry.addName(Armastaff, "Armadyl's Staff");
		LanguageRegistry.addName(Dragonaxe, "Dragon Axe");
		LanguageRegistry.addName(chicken, "Rubber Chicken");
		LanguageRegistry.addName(keris, "Keris");
		LanguageRegistry.addName(Stake, "Wooden Stake");
		
		LanguageRegistry.addName(SteelHammer, "Iron Warhammer");
		LanguageRegistry.addName(MithHammer, "Mithril Warhammer");
		LanguageRegistry.addName(AddyHammer, "Adamant Warhammer");
		LanguageRegistry.addName(RuneHammer, "Rune Warhammer");
		
		LanguageRegistry.addName(sarasword, "Saradomin Sword");
		LanguageRegistry.addName(DryRapier, "Drygore Rapier");
		LanguageRegistry.addName(DryLong, "Drygore Longsword");
		LanguageRegistry.addName(DryMace, "Drygore Mace");
		LanguageRegistry.addName(D2H, "Dragon 2H Sword");
		
		LanguageRegistry.addName(contract, "White Knight Contract");
		LanguageRegistry.addName(contract2, "Guard Contract");
		LanguageRegistry.addName(contract3, "Wizard Contract");
		LanguageRegistry.addName(contract4, "White Knight Hero Contract");
		
		LanguageRegistry.addName(note1, "Gold Note - Gold Block X9");
		LanguageRegistry.addName(note2, "Gold Contract - Gold Note X9");
		LanguageRegistry.addName(note3, "Donation Token");
		
		LanguageRegistry.addName(shard1, "GodSword Shard 1");
		LanguageRegistry.addName(shard2, "GodSword Shard 2");
		LanguageRegistry.addName(shard3, "GodSword Shard 3");
		LanguageRegistry.addName(Hilt, "Godsword Blade");
		
		LanguageRegistry.addName(BandosHilt, "Bandos Hilt");
		LanguageRegistry.addName(SaradominHilt, "Saradomin Hilt");
		LanguageRegistry.addName(ArmadylHilt, "Armadyl Hilt");
		LanguageRegistry.addName(ZamorakHilt, "Zamorak Hilt");
		
		
		LanguageRegistry.addName(ToragHammer, "Torag's Hammer");
		LanguageRegistry.addName(VeracFlail, "Verac's Flail");
		LanguageRegistry.addName(GuthanSpear, "Guthan's Spear");
		LanguageRegistry.addName(DharokAxe, "Dharok's Axe");
		LanguageRegistry.addName(AhrimStaff, "Ahrim's Staff");
		LanguageRegistry.addName(AkrisaeMace, "Akrisae's Mace");
		
		LanguageRegistry.addName(PitchFork, "PitchFork");
		LanguageRegistry.addName(BlackHalberd, "Black Halberd");
		LanguageRegistry.addName(fremsword, "Fremmick Blade");
		LanguageRegistry.addName(fremswordf, "Blazing Fremmick Blade");
		LanguageRegistry.addName(VestaSword, "Corrupt Vesta Longsword");
		LanguageRegistry.addName(DragonCscimmy, "Corrupt Dragon Scimitar");
		LanguageRegistry.addName(AgilitySword, "Agile Blade");
		LanguageRegistry.addName(Cmaul, "Chaotic Maul");
			
		

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithpickaxe, 1),	new Object[] { "XXX", " Y ", " Y ", 'X', mod_BlocksGalore.Mithingot, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithhoe, 1),	new Object[] { "XX ", " Y ", " Y ", 'X', mod_BlocksGalore.Mithingot,  'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithsword, 1), new Object[] { " X ", " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithaxe, 1), new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithshovel, 1), new Object[] { " X ", " Y ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.MithHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),mod_BlocksGalore.Mithingot, Character.valueOf('Y'), Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addypickaxe, 1),	new Object[] { "XXX", " Y ", " Y ", 'X', mod_BlocksGalore.Addyingot, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addyhoe, 1),	new Object[] { "XX ", " Y ", " Y ", 'X', mod_BlocksGalore.Addyingot,  'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addysword, 1), new Object[] { " X ", " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addyaxe, 1), new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addyshovel, 1), new Object[] { " X ", " Y ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.AddyHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),mod_BlocksGalore.Addyingot, Character.valueOf('Y'), Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runepickaxe, 1),	new Object[] { "XXX", " Y ", " Y ", 'X', mod_BlocksGalore.Runeingot, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runehoe, 1),	new Object[] { "XX ", " Y ", " Y ", 'X', mod_BlocksGalore.Runeingot,  'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runesword, 1), new Object[] { " X ", " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runeaxe, 1), new Object[] { "XX ", "XY ", " Y ", Character.valueOf('X'), mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runeshovel, 1), new Object[] { " X ", " Y ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Items.stick });
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.RuneHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),mod_BlocksGalore.Runeingot, Character.valueOf('Y'), Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.SteelHammer, 1), new Object[] { "XXX", "XYX", " Y ", Character.valueOf('X'),Items.iron_ingot, Character.valueOf('Y'), Items.stick });
		
		GameRegistry.addSmelting(Mithlump, new ItemStack(Mithingot), 1.0F);
		GameRegistry.addSmelting(Addylump, new ItemStack(Addyingot), 1.0F);
		GameRegistry.addSmelting(Runelump, new ItemStack(Runeingot), 1.0F);

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Mithlump, 1),
				new Object[] { "XYX", Character.valueOf('X'), Items.coal,
						Character.valueOf('Y'), mod_BlocksGalore.Mithore });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Addylump, 1),
				new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), Items.coal,
						Character.valueOf('Y'), mod_BlocksGalore.Addyore });

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Runelump, 1),
				new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Items.coal,
						Character.valueOf('Y'), mod_BlocksGalore.Runeore });
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.KQSpawn, 1),
		//		new Object[] { "X", Character.valueOf('X'), Block.dirt });
		
		//GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.KQ2Spawn, 1),
		//		new Object[] { "X", Character.valueOf('X'), Block.sand });
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract, 1),
				new Object[] { "XYX", Character.valueOf('X'), Items.gold_ingot,
						Character.valueOf('Y'), Items.paper });
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.WHITESpawn, 1),
	//			new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.contract,
		//				});
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract, 9),
	//			new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.WHITESpawn,
	//					});
	//
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract2, 1),
				new Object[] { "XY", Character.valueOf('X'), Items.gold_ingot,
						Character.valueOf('Y'), Items.paper });
		
//		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.GUARDSpawn, 1),
	//			new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.contract2,
	//					});
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract2, 9),
	//			new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.GUARDSpawn,
	//					});
		
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract3, 1),
				new Object[] { " X ","XYX"," X ", Character.valueOf('X'), Items.gold_ingot,
						Character.valueOf('Y'), Items.paper });
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.WIZARDSpawn, 1),
	//			new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.contract3,
		//				});
		
	//	GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract3, 9),
	//			new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.WIZARDSpawn,
	//				});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.contract4, 1),
				new Object[] { "XXX","XYX","XXX", Character.valueOf('X'), Items.diamond,
						Character.valueOf('Y'), Items.paper });
		
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note1, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), Blocks.gold_block,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note2, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.note1,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note1, 9),
				new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.note2,
						});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 9),
				new Object[] { "X", Character.valueOf('X'), mod_BlocksGalore.note1,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.note3, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.note2,
						});
		

		GameRegistry.addRecipe(
				new ItemStack(mod_BlocksGalore.PickaxeGaloreg, 1),
				new Object[] { "Y", "Y", "X", Character.valueOf('X'),
						mod_BlocksGalore.pickaxeGalore, Character.valueOf('Y'),
						Items.gold_ingot});
		
		
		GameRegistry.addRecipe(
				new ItemStack(mod_BlocksGalore.DDS, 1),
				new Object[] { "Y Y", " X ", "Y Y", Character.valueOf('X'),
						mod_BlocksGalore.DD, Character.valueOf('Y'),
						Items.fermented_spider_eye});

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.bluecobblestonec, 1),
				new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), mod_BlocksGalore.bluecobblestone,
						});
		
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.Hilt, 1), new Object[] { " X ", " Y ", " Z ", Character.valueOf('X'),mod_BlocksGalore.shard1, Character.valueOf('Y'),mod_BlocksGalore.shard2, Character.valueOf('Z'),mod_BlocksGalore.shard3});

		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.BGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.BandosHilt,});
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.ZGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.ZamorakHilt,});
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.AGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.ArmadylHilt,});
		GameRegistry.addRecipe(new ItemStack(mod_BlocksGalore.SGS, 1), new Object[] { " X ", " Y ", Character.valueOf('X'),mod_BlocksGalore.Hilt, Character.valueOf('Y'),mod_BlocksGalore.SaradominHilt,});
	
	
	
	}

	
	public void generateSurface(World world, Random random, int i, int j) {
		for (int i4 = 0; i4 < 20; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(128);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.bluecobblestone, 8))
					.generate(world, random, j7, k10, j13);
		}
		for (int i4 = 0; i4 < 17; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(45);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.Mithore, 8))
					.generate(world, random, j7, k10, j13);
		}
		for (int i4 = 0; i4 < 9; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(23);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.Addyore, 8))
					.generate(world, random, j7, k10, j13);
		}
		for (int i4 = 0; i4 < 4; i4++) {
			int j7 = i + random.nextInt(16);
			int k10 = random.nextInt(11);
			int j13 = j + random.nextInt(16);
			(new WorldGenMinable(mod_BlocksGalore.Runeore, 8))
					.generate(world, random, j7, k10, j13);
		}
	}
	
	
	

	public String getVersion() {
		return ("1.6.4");
	}
}