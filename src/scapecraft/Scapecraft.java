package scapecraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import scapecraft.block.BlockSpawn;
import scapecraft.item.ItemArmorBandos;
import scapecraft.item.ItemArmorScapecraft;
import scapecraft.item.ItemHammer;
import scapecraft.item.ItemSetWeapon;
import scapecraft.item.ScapecraftArmorMaterial;
import scapecraft.item.ScapecraftToolMaterial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
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
	//public static final Item santaChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.SANTA,1, 1,"santa");
	//public static final Item santaLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.SANTA, 2, 2,"santa");
	//public static final Item santaBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.SANTA, 3, 3,"santa");

	public static final Item phatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.PHAT, 0, 0,"phat");
	//public static final Item phatChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.PHAT,1, 1,"phat");
	//public static final Item phatLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.PHAT, 2, 2,"phat");
	//public static final Item phatBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.PHAT, 3, 3,"phat");

	public static final Item wphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.WPHAT, 0, 0,"whitephat");
	//public static final Item wphatChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.WPHAT,1, 1,"whitephat");
	//public static final Item wphatLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.WPHAT, 2, 2,"whitephat");
	//public static final Item wphatBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.WPHAT, 3, 3,"whitephat");

	public static final Item yphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.YPHAT, 0, 0,"yellowphat");
	//public static final Item yphatChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.YPHAT,1, 1,"yellowphat");
	//public static final Item yphatLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.YPHAT, 2, 2,"yellowphat");
	//public static final Item yphatBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.YPHAT, 3, 3,"yellowphat");

	public static final Item gphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.GPHAT, 0, 0,"greenphat");
	//public static final Item gphatChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.GPHAT,1, 1,"greenphat");
	//public static final Item gphatLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.GPHAT, 2, 2,"greenphat");
	//public static final Item gphatBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.GPHAT, 3, 3,"greenphat");

	public static final Item rphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.RPHAT, 0, 0,"redphat");
	//public static final Item rphatChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.RPHAT,1, 1,"redphat");
	//public static final Item rphatLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.RPHAT, 2, 2,"redphat");
	//public static final Item rphatBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.RPHAT, 3, 3,"redphat");

	public static final Item pphatHelmet = new ItemArmorScapecraft(ScapecraftArmorMaterial.PPHAT, 0, 0,"purplephat");
	//public static final Item pphatChestplate = new ItemArmorScapecraft(ScapecraftArmorMaterial.PPHAT,1, 1,"purplephat");
	//public static final Item pphatLeggings = new ItemArmorScapecraft(ScapecraftArmorMaterial.PPHAT, 2, 2,"purplephat");
	//public static final Item pphatBoots = new ItemArmorScapecraft(ScapecraftArmorMaterial.PPHAT, 3, 3,"purplephat");

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

	public static final Block VeracSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block ToragSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block DharokSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block KarilSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block AhrimSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block AkrisaeSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block GuthanSpawn = new BlockSpawn(Entity.class, 80);

	public static final Block MuggerSpawn = new BlockSpawn(Entity.class, 80);
	public static final Block BanditSpawn = new BlockSpawn(Entity.class, 80);

	public static final CreativeTabs tabScapecraftWeapon = new CreativeTabs("tabScapecraftWeapon")
	{
		@Override
		public Item getTabIconItem()
		{
			return phatHelmet;
		}
	};

	public static final Item steelHammer = new ItemHammer(ScapecraftToolMaterial.STEEL, "SteelHammer");
	public static final Item mithHammer = new ItemHammer(ScapecraftToolMaterial.MITH, "MithHammer");
	public static final Item addyHammer = new ItemHammer(ScapecraftToolMaterial.ADDY, "AddyHammer");
	public static final Item runeHammer = new ItemHammer(ScapecraftToolMaterial.RUNE, "RuneHammer");

	public static final Item toragHammer = new ItemSetWeapon(ScapecraftToolMaterial.TORAG, ScapecraftArmorMaterial.TORAG, "ToragHammerinv");
	public static final Item veracFlail = new ItemSetWeapon(ScapecraftToolMaterial.VERAC, ScapecraftArmorMaterial.VERAC, "VeracFlailinv");
	public static final Item guthanSpear = new ItemSetWeapon(ScapecraftToolMaterial.GUTHAN, ScapecraftArmorMaterial.GUTHAN, "GuthanSpearinv");
	public static final Item dharokAxe = new ItemSetWeapon(ScapecraftToolMaterial.DHAROK, ScapecraftArmorMaterial.DHAROK, "DharokAxeinv");
	public static final Item akrisaeMace = new ItemSetWeapon(ScapecraftToolMaterial.AKRISAE, ScapecraftArmorMaterial.AKRISAE, "AkrisaeMaceinv");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		GameRegistry.registerItem(santaHelmet, "santaHelmet");
		//GameRegistry.registerItem(santaChestplate, "santaChestplate");
		//GameRegistry.registerItem(santaLeggings, "santaLeggings");
		//GameRegistry.registerItem(santaBoots, "santaBoots");
		GameRegistry.registerItem(phatHelmet, "phatHelmet");
		//GameRegistry.registerItem(phatChestplate, "phatChestplate");
		//GameRegistry.registerItem(phatLeggings, "phatLeggings");
		//GameRegistry.registerItem(phatBoots, "phatBoots");
		GameRegistry.registerItem(wphatHelmet, "wphatHelmet");
		//GameRegistry.registerItem(wphatChestplate, "wphatChestplate");
		//GameRegistry.registerItem(wphatLeggings, "wphatLeggings");
		//GameRegistry.registerItem(wphatBoots, "wphatBoots");
		GameRegistry.registerItem(yphatHelmet, "yphatHelmet");
		//GameRegistry.registerItem(yphatChestplate, "yphatChestplate");
		//GameRegistry.registerItem(yphatLeggings, "yphatLeggings");
		//GameRegistry.registerItem(yphatBoots, "yphatBoots");
		GameRegistry.registerItem(gphatHelmet, "gphatHelmet");
		//GameRegistry.registerItem(gphatChestplate, "gphatChestplate");
		//GameRegistry.registerItem(gphatLeggings, "gphatLeggings");
		//GameRegistry.registerItem(gphatBoots, "gphatBoots");
		GameRegistry.registerItem(rphatHelmet, "rphatHelmet");
		//GameRegistry.registerItem(rphatChestplate, "rphatChestplate");
		//GameRegistry.registerItem(rphatLeggings, "rphatLeggings");
		//GameRegistry.registerItem(rphatBoots, "rphatBoots");
		GameRegistry.registerItem(pphatHelmet, "pphatHelmet");
		//GameRegistry.registerItem(pphatChestplate, "pphatChestplate");
		//GameRegistry.registerItem(pphatLeggings, "pphatLeggings");
		//GameRegistry.registerItem(pphatBoots, "pphatBoots");
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
		GameRegistry.registerItem(veracBoots, "VeracBoots");
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

		GameRegistry.registerItem(steelHammer, "SteelHammer");
		GameRegistry.registerItem(mithHammer, "MithHammer");
		GameRegistry.registerItem(addyHammer, "AddyHammer");
		GameRegistry.registerItem(runeHammer, "RuneHammer");
		GameRegistry.registerItem(toragHammer, "ToragHammer");
		GameRegistry.registerItem(veracFlail, "VeracFlail");
		GameRegistry.registerItem(guthanSpear, "GuthanSpear");
		GameRegistry.registerItem(dharokAxe, "DharokAxe");
		GameRegistry.registerItem(akrisaeMace, "AkrisaeMace");

		GameRegistry.registerBlock(VeracSpawn, "VeracSpawn");
		GameRegistry.registerBlock(ToragSpawn, "ToragSpawn");
		GameRegistry.registerBlock(DharokSpawn, "DharokSpawn");
		GameRegistry.registerBlock(KarilSpawn, "KarilSpawn");
		GameRegistry.registerBlock(AhrimSpawn, "AhrimSpawn");
		GameRegistry.registerBlock(AkrisaeSpawn, "AkrisaeSpawn");
		GameRegistry.registerBlock(GuthanSpawn, "GuthanSpawn");
		GameRegistry.registerBlock(MuggerSpawn, "MuggerSpawn");
		GameRegistry.registerBlock(BanditSpawn, "BanditSpawn");

		MinecraftForge.EVENT_BUS.register(new ScapecraftEventHandler());
	}


}
