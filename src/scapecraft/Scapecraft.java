package scapecraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Constants;

import scapecraft.block.ScapecraftBlocks;
import scapecraft.client.gui.GuiHandler;
import scapecraft.economy.EconomyHandler;
import scapecraft.entity.Drop;
import scapecraft.entity.EntityScapecraft;
import scapecraft.entity.ScapecraftEntities;
import scapecraft.item.ScapecraftItems;
import scapecraft.network.StatsPacket;
import scapecraft.util.UpdateHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "Scapecraft", name = "Scapecraft", version = Scapecraft.version)
public class Scapecraft
{
	public static final String version = "@VERSION@";
	public static boolean requireLevels = false;

	/*start armor*/
	public static final CreativeTabs tabScapecraftArmor = new CreativeTabs("tabScapecraftArmor")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.phatHelmet;
		}
	};

	public static final CreativeTabs tabScapecraftBlock = new CreativeTabs("tabScapecraftBlock")
	{
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ScapecraftBlocks.runeOre);
		}
	};

	public static final CreativeTabs tabScapecraftWeapon = new CreativeTabs("tabScapecraftWeapon")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.SGS;
		}
	};

	public static final CreativeTabs tabScapecraftTool = new CreativeTabs("tabScapecraftTool")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.dragonAxe;
		}
	};

	public static final CreativeTabs tabScapecraftMisc = new CreativeTabs("tabScapecraftMisc")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.questPoint;
		}
	};

	@SidedProxy(clientSide = "scapecraft.client.ClientProxy", serverSide = "scapecraft.CommonProxy")
	public static CommonProxy proxy;

	@Instance("Scapecraft")
	public static Scapecraft instance;
	
	public static SimpleNetworkWrapper network;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ScapecraftBlocks.registerBlocks();
		ScapecraftItems.registerItems();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderers();

		ScapecraftEntities.registerEntities();

		ScapecraftRecipes.registerRecipes();

		ScapecraftEventHandler eventHandler = new ScapecraftEventHandler();
		MinecraftForge.EVENT_BUS.register(eventHandler);
		FMLCommonHandler.instance().bus().register(eventHandler);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		network = NetworkRegistry.INSTANCE.newSimpleChannel("scapecraft");
		network.registerMessage(StatsPacket.class, StatsPacket.class, 0, Side.CLIENT);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
/*
		for(Item item : (Iterable<Item>) GameData.getItemRegistry())
		{
			if(GameRegistry.findUniqueIdentifierFor(item).modId.equals("Scapecraft"))
			{
				List subItems = new ArrayList();
				item.getSubItems(item, null, subItems);
				for(ItemStack stack : (Iterable<ItemStack>) subItems)
				{
					String stackName = item.getItemStackDisplayName(stack);
					if(stackName.contains("item."))
						System.out.println(stackName);
				}
				if(item instanceof ItemSpecialWeapon)
					System.out.println(item.getUnlocalizedName() + ".special");
				if(item instanceof ItemSetWeapon)
					System.out.println(item.getUnlocalizedName() + ".fullseteffect");
			}
		}
		for(Block block : (Iterable<Block>) GameData.getBlockRegistry())
		{
			if(GameRegistry.findUniqueIdentifierFor(block).modId.equals("Scapecraft"))
			{
				if(block.getLocalizedName().contains("tile."))
					System.out.println(block.getLocalizedName());
			}
		}
		for(Entry<String, Class<? extends Entity>> entry : ScapecraftEntities.entityNames.entrySet())
		{
			System.out.println("entity." + entry.getKey() + ".name");
		}
/**/

		//Updating from 1.6.4
		if(MinecraftServer.getServer() != null && MinecraftServer.getServer().isDedicatedServer())
		{
			File levelDat = new File(MinecraftServer.getServer().getFile("world"), "level.dat");
			if(levelDat.exists())
			{
				try
				{
					List<String> oldIds = Arrays.asList(new String[] {"mod_BlocksGalore", "mod_Botter", "mod_Flower", "mod_MagicBow", "mod_MagicTree", "mod_mobs", "mod_phat", "mod_WorldGenBarrows", "mod_WorldGenBlackFortress", "mod_WorldGenBlacktower", "mod_WorldGenCastle", "mod_WorldGenDragons", "mod_WorldGenIceDragons", "mod_WorldGen", "mod_WorldGenLummy", "mod_WorldGenVarrock", "mod_WorldGenWar", "mod_WorldGenWhitetower", "mod_YewTree", "You_Must_Update_Scapecraft"});
					NBTTagCompound nbt = CompressedStreamTools.readCompressed(new FileInputStream(levelDat));

					NBTTagList itemList = nbt.getCompoundTag("FML").getTagList("ModItemData", 10);
					for(int i = 0; i < itemList.tagCount(); i++)
					{
						if(oldIds.contains(itemList.getCompoundTagAt(i).getString("ModId")))
						{
							itemList.getCompoundTagAt(i).setString("ModId", "Scapecraft");
							itemList.getCompoundTagAt(i).setString("ForcedName", UpdateHandler.mappings.containsKey(itemList.getCompoundTagAt(i).getInteger("ItemId")) ? UpdateHandler.mappings.get(itemList.getCompoundTagAt(i).getInteger("ItemId")) : "UNKNOWN" + itemList.getCompoundTagAt(i).getInteger("ItemId"));
						}
					}

					CompressedStreamTools.writeCompressed(nbt, new FileOutputStream(levelDat));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		EconomyHandler.initEconomy();

		File dataFile = event.getServer().worldServers[0].getSaveHandler().getMapFileFromName("ScapecraftData");
		if(dataFile != null && dataFile.exists())
		{
			NBTTagCompound nbt;
			try {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(dataFile));
			} catch(IOException e) {
				e.printStackTrace();
				return;
			}

			NBTTagCompound drops = nbt.getCompoundTag("drops");
			boolean update = !drops.getString("version").equals(version) || version.isEmpty();
			if(update)
				ScapecraftEntities.addDrops();

			if(!drops.hasNoTags())
				for(Object id : drops.getKeySet())
				{
					NBTTagList list = drops.getTagList((String) id, Constants.NBT.TAG_COMPOUND);
					@SuppressWarnings("unchecked") //Decompiling causes type erasure, so this is necessary to prevent warnings
						Class<? extends EntityScapecraft> entityClass = (Class<? extends EntityScapecraft>) EntityList.stringToClassMapping.get((String) id);
					while(list.tagCount() > 0)
						if(!update || list.getCompoundTagAt(0).getBoolean("custom"))
							EntityScapecraft.addDrop(entityClass, Drop.fromNBT((NBTTagCompound) list.removeTag(0)));

				}
		}
	}

	@EventHandler
	public void onMissingMapping(FMLMissingMappingsEvent event)
	{
		System.out.println(event.getAll().size());
		//UpdateHandler.onMissingMapping(event);
	}
}
