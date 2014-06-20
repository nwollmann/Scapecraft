package scapecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import scapecraft.item.ItemArmorBandos;
import scapecraft.item.ItemArmorScapecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Scapecraft", name = "Scapecraft")
public class Scapecraft
{
	public static final CreativeTabs tabScapecraft = new CreativeTabs("tabScapecraft")
	{
		@Override
		public Item getTabIconItem()
		{
			return phatHelmet;
		}
	};

	static ArmorMaterial armorSANTA= EnumHelper.addArmorMaterial("SANTA", 50000, new int[]{4, 1, 1, 1}, 10);
	public static final Item santaHelmet = new ItemArmorScapecraft(armorSANTA, 0, 0,"santa");
	//public static final Item santaChestplate = new ItemArmorScapecraft(armorSANTA,1, 1,"santa");
	//public static final Item santaLeggings = new ItemArmorScapecraft(armorSANTA, 2, 2,"santa");
	//public static final Item santaBoots = new ItemArmorScapecraft(armorSANTA, 3, 3,"santa");

	static ArmorMaterial armorPHAT= EnumHelper.addArmorMaterial("PHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item phatHelmet = new ItemArmorScapecraft(armorPHAT, 0, 0,"phat");
	//public static final Item phatChestplate = new ItemArmorScapecraft(armorPHAT,1, 1,"phat");
	//public static final Item phatLeggings = new ItemArmorScapecraft(armorPHAT, 2, 2,"phat");
	//public static final Item phatBoots = new ItemArmorScapecraft(armorPHAT, 3, 3,"phat");

	static ArmorMaterial armorWPHAT= EnumHelper.addArmorMaterial("WPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item wphatHelmet = new ItemArmorScapecraft(armorWPHAT, 0, 0,"whitephat");
	//public static final Item wphatChestplate = new ItemArmorScapecraft(armorWPHAT,1, 1,"whitephat");
	//public static final Item wphatLeggings = new ItemArmorScapecraft(armorWPHAT, 2, 2,"whitephat");
	//public static final Item wphatBoots = new ItemArmorScapecraft(armorWPHAT, 3, 3,"whitephat");

	static ArmorMaterial armorYPHAT= EnumHelper.addArmorMaterial("YPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item yphatHelmet = new ItemArmorScapecraft(armorYPHAT, 0, 0,"yellowphat");
	//public static final Item yphatChestplate = new ItemArmorScapecraft(armorYPHAT,1, 1,"yellowphat");
	//public static final Item yphatLeggings = new ItemArmorScapecraft(armorYPHAT, 2, 2,"yellowphat");
	//public static final Item yphatBoots = new ItemArmorScapecraft(armorYPHAT, 3, 3,"yellowphat");

	static ArmorMaterial armorGPHAT= EnumHelper.addArmorMaterial("GPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item gphatHelmet = new ItemArmorScapecraft(armorGPHAT, 0, 0,"greenphat");
	//public static final Item gphatChestplate = new ItemArmorScapecraft(armorGPHAT,1, 1,"greenphat");
	//public static final Item gphatLeggings = new ItemArmorScapecraft(armorGPHAT, 2, 2,"greenphat");
	//public static final Item gphatBoots = new ItemArmorScapecraft(armorGPHAT, 3, 3,"greenphat");

	static ArmorMaterial armorRPHAT= EnumHelper.addArmorMaterial("RPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item rphatHelmet = new ItemArmorScapecraft(armorRPHAT, 0, 0,"redphat");
	//public static final Item rphatChestplate = new ItemArmorScapecraft(armorRPHAT,1, 1,"redphat");
	//public static final Item rphatLeggings = new ItemArmorScapecraft(armorRPHAT, 2, 2,"redphat");
	//public static final Item rphatBoots = new ItemArmorScapecraft(armorRPHAT, 3, 3,"redphat");

	static ArmorMaterial armorPPHAT= EnumHelper.addArmorMaterial("PPHAT", 500000, new int[]{4, 1, 1, 1}, 10);
	public static final Item pphatHelmet = new ItemArmorScapecraft(armorPPHAT, 0, 0,"purplephat");
	//public static final Item pphatChestplate = new ItemArmorScapecraft(armorPPHAT,1, 1,"purplephat");
	//public static final Item pphatLeggings = new ItemArmorScapecraft(armorPPHAT, 2, 2,"purplephat");
	//public static final Item pphatBoots = new ItemArmorScapecraft(armorPPHAT, 3, 3,"purplephat");

	static ArmorMaterial armorDRAGON= EnumHelper.addArmorMaterial("DRAGON", 5000, new int[]{3, 9, 6, 3}, 30);
	public static final Item dragonHelmet = new ItemArmorScapecraft(armorDRAGON, 0, 0,"dragon");
	public static final Item dragonChestplate = new ItemArmorScapecraft(armorDRAGON,1, 1,"dragon");
	public static final Item dragonLeggings = new ItemArmorScapecraft(armorDRAGON, 2, 2,"dragon");
	public static final Item dragonBoots = new ItemArmorScapecraft(armorDRAGON, 3, 3,"dragon");

	static ArmorMaterial armorBLACK= EnumHelper.addArmorMaterial("BLACK", 60, new int[]{2, 4, 3, 2}, 10);
	public static final Item blackHelmet = new ItemArmorScapecraft(armorBLACK, 0, 0,"black");
	public static final Item blackChestplate = new ItemArmorScapecraft(armorBLACK,1, 1,"black");
	public static final Item blackLeggings = new ItemArmorScapecraft(armorBLACK, 2, 2,"black");
	public static final Item blackBoots = new ItemArmorScapecraft(armorBLACK, 3, 3,"black");

	static ArmorMaterial armorWHITE= EnumHelper.addArmorMaterial("WHITE", 60, new int[]{2, 4, 3, 2}, 10);
	public static final Item whiteHelmet = new ItemArmorScapecraft(armorWHITE, 0, 0,"white");
	public static final Item whiteChestplate = new ItemArmorScapecraft(armorWHITE,1, 1,"white");
	public static final Item whiteLeggings = new ItemArmorScapecraft(armorWHITE, 2, 2,"white");
	public static final Item whiteBoots = new ItemArmorScapecraft(armorWHITE, 3, 3,"white");

	static ArmorMaterial armorGUARD= EnumHelper.addArmorMaterial("GUARD", 80, new int[]{2, 3, 5, 2}, 10);
	public static final Item guardHelmet = new ItemArmorScapecraft(armorGUARD, 0, 0,"guard");
	public static final Item guardChestplate = new ItemArmorScapecraft(armorGUARD,1, 1,"guard");
	//public static final Item guardLeggings = new ItemArmorScapecraft(armorGUARD, 2, 2,"guard");
	//public static final Item guardBoots = new ItemArmorScapecraft(armorGUARD, 3, 3,"guard");

	static ArmorMaterial armorMITH= EnumHelper.addArmorMaterial("MITH",190, new int[]{2, 6, 5, 2}, 10);
	public static final Item mithHelmet = new ItemArmorScapecraft(armorMITH, 0, 0,"mith");
	public static final Item mithChestplate = new ItemArmorScapecraft(armorMITH,1, 1,"mith");
	public static final Item mithLeggings = new ItemArmorScapecraft(armorMITH, 2, 2,"mith");
	public static final Item mithBoots = new ItemArmorScapecraft(armorMITH, 3, 3,"mith");

	static ArmorMaterial armorADDY= EnumHelper.addArmorMaterial("ADDY",250, new int[]{2, 7, 5, 2}, 10);
	public static final Item addyHelmet = new ItemArmorScapecraft(armorADDY, 0, 0,"addy");
	public static final Item addyChestplate = new ItemArmorScapecraft(armorADDY,1, 1,"addy");
	public static final Item addyLeggings = new ItemArmorScapecraft(armorADDY, 2, 2,"addy");
	public static final Item addyBoots = new ItemArmorScapecraft(armorADDY, 3, 3,"addy");

	static ArmorMaterial armorRUNE= EnumHelper.addArmorMaterial("RUNE",290, new int[]{3, 7, 5, 3}, 10);
	public static final Item runeHelmet = new ItemArmorScapecraft(armorRUNE, 0, 0,"rune");
	public static final Item runeChestplate = new ItemArmorScapecraft(armorRUNE,1, 1,"rune");
	public static final Item runeLeggings = new ItemArmorScapecraft(armorRUNE, 2, 2,"rune");
	public static final Item runeBoots = new ItemArmorScapecraft(armorRUNE, 3, 3,"rune");

	static ArmorMaterial armorRUNEG= EnumHelper.addArmorMaterial("RUNEG",330, new int[]{3, 7, 5, 3}, 30);
	public static final Item runegHelmet = new ItemArmorScapecraft(armorRUNEG, 0, 0,"runeg");
	public static final Item runegChestplate = new ItemArmorScapecraft(armorRUNEG,1, 1,"runeg");
	public static final Item runegLeggings = new ItemArmorScapecraft(armorRUNEG, 2, 2,"runeg");
	public static final Item runegBoots = new ItemArmorScapecraft(armorRUNEG, 3, 3,"runeg");

	static ArmorMaterial armorGRANITE= EnumHelper.addArmorMaterial("GRANITE",1500, new int[]{3, 8, 6, 3}, 20);
	public static final Item graniteHelmet = new ItemArmorScapecraft(armorGRANITE, 0, 0,"granite");
	public static final Item graniteChestplate = new ItemArmorScapecraft(armorGRANITE,1, 1,"granite");
	public static final Item graniteLeggings = new ItemArmorScapecraft(armorGRANITE, 2, 2,"granite");
	public static final Item graniteBoots = new ItemArmorScapecraft(armorGRANITE, 3, 3,"granite");

	static ArmorMaterial armorBLACKG= EnumHelper.addArmorMaterial("BLACKG", 5000, new int[]{3, 7, 5, 2}, 30);
	public static final Item blackgHelmet = new ItemArmorScapecraft(armorBLACKG, 0, 0,"blackg");
	public static final Item blackgChestplate = new ItemArmorScapecraft(armorBLACKG,1, 1,"blackg");
	public static final Item blackgLeggings = new ItemArmorScapecraft(armorBLACKG, 2, 2,"blackg");
	public static final Item blackgBoots = new ItemArmorScapecraft(armorBLACKG, 3, 3,"blackg");

	static ArmorMaterial armorTORAG= EnumHelper.addArmorMaterial("TORAG", 20000, new int[]{3, 9, 6, 3}, 30);
	public static final Item toragHelmet = new ItemArmorScapecraft(armorTORAG, 0, 0,"Torag");
	public static final Item toragChestplate = new ItemArmorScapecraft(armorTORAG,1, 1,"Torag");
	public static final Item toragLeggings = new ItemArmorScapecraft(armorTORAG, 2, 2,"Torag");
	public static final Item toragBoots = new ItemArmorScapecraft(armorTORAG, 3, 3,"Torag");

	static ArmorMaterial armorVERAC= EnumHelper.addArmorMaterial("VERAC", 10000, new int[]{3, 7, 6, 3}, 30);
	public static final Item veracHelmet = new ItemArmorScapecraft(armorVERAC, 0, 0,"Verac");
	public static final Item veracChestplate = new ItemArmorScapecraft(armorVERAC,1, 1,"Verac");
	public static final Item veracLeggings = new ItemArmorScapecraft(armorVERAC, 2, 2,"Verac");
	public static final Item veracBoots = new ItemArmorScapecraft(armorVERAC, 3, 3,"Verac");

	static ArmorMaterial armorGUTHAN= EnumHelper.addArmorMaterial("GUTHAN", 10000, new int[]{3, 9, 6, 3}, 30);
	public static final Item guthanHelmet = new ItemArmorScapecraft(armorGUTHAN, 0, 0,"Guthan");
	public static final Item guthanChestplate = new ItemArmorScapecraft(armorGUTHAN,1, 1,"Guthan");
	public static final Item guthanLeggings = new ItemArmorScapecraft(armorGUTHAN, 2, 2,"Guthan");
	public static final Item guthanBoots = new ItemArmorScapecraft(armorGUTHAN, 3, 3,"Guthan");

	static ArmorMaterial armorDHAROK= EnumHelper.addArmorMaterial("DHAROK", 10000, new int[]{3, 9, 6, 3}, 30);
	public static final Item dharokHelmet = new ItemArmorScapecraft(armorDHAROK, 0, 0,"Dharok");
	public static final Item dharokChestplate = new ItemArmorScapecraft(armorDHAROK,1, 1,"Dharok");
	public static final Item dharokLeggings = new ItemArmorScapecraft(armorDHAROK, 2, 2,"Dharok");
	public static final Item dharokBoots = new ItemArmorScapecraft(armorDHAROK, 3, 3,"Dharok");

	static ArmorMaterial armorKARIL= EnumHelper.addArmorMaterial("KARIL", 10000, new int[]{3, 7, 4, 3}, 30);
	public static final Item karilHelmet = new ItemArmorScapecraft(armorKARIL, 0, 0,"Karil");
	public static final Item karilChestplate = new ItemArmorScapecraft(armorKARIL,1, 1,"Karil");
	public static final Item karilLeggings = new ItemArmorScapecraft(armorKARIL, 2, 2,"Karil");
	public static final Item karilBoots = new ItemArmorScapecraft(armorKARIL, 3, 3,"Karil");

	static ArmorMaterial armorAHRIM= EnumHelper.addArmorMaterial("AHRIM", 10000, new int[]{3, 7, 4, 3}, 30);
	public static final Item ahrimHelmet = new ItemArmorScapecraft(armorAHRIM, 0, 0,"Ahrim");
	public static final Item ahrimChestplate = new ItemArmorScapecraft(armorAHRIM,1, 1,"Ahrim");
	public static final Item ahrimLeggings = new ItemArmorScapecraft(armorAHRIM, 2, 2,"Ahrim");
	public static final Item ahrimBoots = new ItemArmorScapecraft(armorAHRIM, 3, 3,"Ahrim");

	static ArmorMaterial armorAKRISAE= EnumHelper.addArmorMaterial("AKRISAE", 10000, new int[]{3, 7, 4, 3}, 30);
	public static final Item akrisaeHelmet = new ItemArmorScapecraft(armorAKRISAE, 0, 0,"Akrisae");
	public static final Item akrisaeChestplate = new ItemArmorScapecraft(armorAKRISAE,1, 1,"Akrisae");
	public static final Item akrisaeLeggings = new ItemArmorScapecraft(armorAKRISAE, 2, 2,"Akrisae");
	public static final Item akrisaeBoots = new ItemArmorScapecraft(armorAKRISAE, 3, 3,"Akrisae");


	static ArmorMaterial armorGREEND= EnumHelper.addArmorMaterial("GREEND",60, new int[]{3, 5, 4, 2}, 10);
	public static final Item greendHelmet = new ItemArmorScapecraft(armorGREEND, 0, 0,"greend");
	public static final Item greendChestplate = new ItemArmorScapecraft(armorGREEND,1, 1,"greend");
	public static final Item greendLeggings = new ItemArmorScapecraft(armorGREEND, 2, 2,"greend");
	public static final Item greendBoots = new ItemArmorScapecraft(armorGREEND, 3, 3,"greend");

	static ArmorMaterial armorBLACKD= EnumHelper.addArmorMaterial("BLACKD",100, new int[]{3, 6, 5, 2}, 20);
	public static final Item blackdHelmet = new ItemArmorScapecraft(armorBLACKD, 0, 0,"blackd");
	public static final Item blackdChestplate = new ItemArmorScapecraft(armorBLACKD,1, 1,"blackd");
	public static final Item blackdLeggings = new ItemArmorScapecraft(armorBLACKD, 2, 2,"blackd");
	public static final Item blackdBoots = new ItemArmorScapecraft(armorBLACKD, 3, 3,"blackd");


	static ArmorMaterial armorDRAGONL= EnumHelper.addArmorMaterial("DRAGONLL", 50000, new int[]{3, 8, 7, 3}, 50);
	public static final Item dragonlHelmet = new ItemArmorScapecraft(armorDRAGONL, 0, 0,"dragonl");
	public static final Item dragonlChestplate = new ItemArmorScapecraft(armorDRAGONL,1, 1,"dragonl");
	public static final Item dragonlLeggings = new ItemArmorScapecraft(armorDRAGONL, 2, 2,"dragonl");
	public static final Item dragonlBoots = new ItemArmorScapecraft(armorDRAGONL, 3, 3,"dragonl");

	static ArmorMaterial armorBANDOS= EnumHelper.addArmorMaterial("BANDOS",10000, new int[]{3, 8, 0, 4}, 10);
	public static final Item bandosHelmet = new ItemArmorBandos(armorBANDOS, 0, 0,"Bandos");
	public static final Item bandosChestplate = new ItemArmorBandos(armorBANDOS,1, 1,"Bandos");
	public static final Item bandosLeggings = new ItemArmorBandos(armorBANDOS, 2, 2,"Bandos");
	public static final Item bandosBoots = new ItemArmorBandos(armorBANDOS, 3, 3,"Bandos");
	static ArmorMaterial armorSTONE= EnumHelper.addArmorMaterial("STONE", 50000000, new int[]{1, 3, 2, 1}, 50);
	public static final Item stoneHelmet = new ItemArmorScapecraft(armorSTONE, 0, 0,"stone");
	public static final Item stoneChestplate = new ItemArmorScapecraft(armorSTONE,1, 1,"stone");
	public static final Item stoneLeggings = new ItemArmorScapecraft(armorSTONE, 2, 2,"stone");
	public static final Item stoneBoots = new ItemArmorScapecraft(armorSTONE, 3, 3,"stone");


	static ArmorMaterial armorCDRAGON= EnumHelper.addArmorMaterial("CDRAGON",90, new int[]{3, 7, 5, 3}, 10);
	public static final Item dragonCHelmet = new ItemArmorScapecraft(armorCDRAGON, 0, 0,"dragonC");
	public static final Item dragonCChestplate = new ItemArmorScapecraft(armorCDRAGON,1, 1,"dragonC");
	public static final Item dragonCLeggings = new ItemArmorScapecraft(armorCDRAGON, 2, 2,"dragonC");
	public static final Item dragonCBoots = new ItemArmorScapecraft(armorCDRAGON, 3, 3,"dragonC");

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
	}


}
