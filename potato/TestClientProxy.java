package potato;
import models.ModelAbbyDemon;
import models.ModelAhrim;
import models.ModelAkrisae;
import models.ModelBandosArm;
import models.ModelBlackDemon;
import models.ModelCaveCrawler;
import models.ModelDharok;
import models.ModelFireGiant;
import models.ModelGeneralGraardor;
import models.ModelGhost;
import models.ModelGoblin;
import models.ModelGreenDragon;
import models.ModelGuthan;
import models.ModelHellhound;
import models.ModelHillGiant;
import models.ModelIceGiant;
import models.ModelKK;
import models.ModelKKspawn;
import models.ModelKaril;
import models.ModelLavaBlock;
import models.ModelLesserDemon;
import models.ModelLesserDemon2;
import models.ModelLootChest;
import models.ModelMossGiant;
import models.ModelRat;
import models.ModelSergeantGrimSpike;
import models.ModelSergeantSteelWill;
import models.ModelSergeantStrongStack;
import models.ModelTD;
import models.ModelTorag;
import models.ModelVerac;
import models.ModelScorpion;
import models.ModelDwarf;
import src.*;
import models.ModelBot;
import models.ModelKQ;
import models.ModelKQ2;
import models.ModelMagicBoat;
import src.RenderAbbyDemon;
import src.RenderBot;
import src.RenderGoblin;
import src.RenderDwarf;
import src.RenderGreenDragon;
import src.RenderHellhound;
import src.RenderIceGiant;
import src.RenderIronDragon;
import src.RenderKQ;
import src.RenderKQ2;
import src.RenderLesserDemon;
import src.RenderLesserDemon2;
import src.RenderMagicBoat;
import src.RenderRatSmall;
import src.RenderScorpion;
import src.mod_BlocksGalore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class TestClientProxy extends TestCommonProxy
{

	private static final ModelBandosArm tutChest = new ModelBandosArm(1.0f);
	private static final ModelBandosArm tutLegs = new ModelBandosArm(0.5f);

	@Override
	public ModelBiped getArmorModel(int id){
		switch (id) {
			case 0:
				return tutChest;
			case 1:
				return tutLegs;
			default:
				break;
		}
		return tutChest; //default, if whenever you should have passed on a wrong id
	}

	public static void addModerCapes() {

		String capeURL = "http://i.imgur.com/ZT124P8.png";
		String[] devs = {"999134fishy"};

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

			Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (ITextureObject) image);
		}
	}

	@Override
	public void registerRenderThings()
	{


		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKQ.class, new RenderKQ(new ModelKQ(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKQ2.class, new RenderKQ2(new ModelKQ2(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityLesserDemon.class, new RenderLesserDemon(new ModelLesserDemon(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityGoblin.class, new RenderGoblin(new ModelGoblin(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityScorpion.class, new RenderScorpion(new ModelScorpion(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityAbbyDemon.class, new RenderAbbyDemon(new ModelAbbyDemon(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityGreenDragon.class, new RenderGreenDragon(new ModelGreenDragon(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityDwarf.class, new RenderDwarf(new ModelDwarf(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityIceGiant.class, new RenderIceGiant(new ModelIceGiant(), 0.5F));	  
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityIronDragon.class, new RenderIronDragon(new ModelGreenDragon(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityHellhound.class, new RenderHellhound(new ModelHellhound(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityLesserDemon2.class, new RenderLesserDemon2(new ModelLesserDemon2(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackDragon.class, new RenderBlackDragon(new ModelGreenDragon(), 0.5F));


		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBot.class, new RenderBot(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBot2.class, new RenderBot2(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBot3.class, new RenderBot3(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityTheif.class, new RenderTheif(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackKnight.class, new RenderBlackKnight(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityWhiteKnight.class, new RenderWhiteKnight(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityHeroKnight.class, new RenderHeroKnight(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityGuard.class, new RenderGuard(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityWizard.class, new RenderWizard(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityDarkwizard.class, new RenderDarkwizard(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityHighMage.class, new RenderHighMage(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKing.class, new RenderKing(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKingsGuard.class, new RenderKingsGuard(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityEliteBlackKnight.class, new RenderEliteBlackKnight(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBarbarian.class, new RenderBarbarian(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityShopKeeper.class, new RenderShopKeeper(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityVampire.class, new RenderVampire(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityDoctor.class, new RenderDoctor(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityMan.class, new RenderMan(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityMorgan.class, new RenderMorgan(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityCook.class, new RenderCook(new ModelBiped(), 0.5F));


		RenderingRegistry.instance().registerEntityRenderingHandler(EntityGeneralGraardor.class, new RenderGeneralGraardor(new ModelGeneralGraardor(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntitySergeantGrimspike.class, new RenderSergeantGrimspike(new ModelSergeantGrimSpike(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntitySergeantSteelwill.class, new RenderSergeantSteelwill(new ModelSergeantSteelWill(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntitySergeantStrongstack.class, new RenderSergeantStrongstack(new ModelSergeantStrongStack(), 0.5F));

		RenderingRegistry.instance().registerEntityRenderingHandler(EntityDharok.class, new RenderDharok(new ModelDharok(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityTorag.class, new RenderTorag(new ModelTorag(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityVerac.class, new RenderVerac(new ModelVerac(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityGuthan.class, new RenderGuthan(new ModelGuthan(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKaril.class, new RenderKaril(new ModelKaril(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityAkrisae.class, new RenderAkrisae(new ModelAkrisae(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityAhrim.class, new RenderAhrim(new ModelAhrim(), 0.5F));

		RenderingRegistry.instance().registerEntityRenderingHandler(EntityFarmer.class, new RenderFarmer(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityRat.class, new RenderRat(new ModelRat(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityRatSmall.class, new RenderRatSmall(new ModelRat(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityTD.class, new RenderTD(new ModelTD(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityMossGiant.class, new RenderMossGiant(new ModelMossGiant(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityHillGiant.class, new RenderHillGiant(new ModelHillGiant(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityFireGiant.class, new RenderFireGiant(new ModelFireGiant(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderCaveCrawler(new ModelCaveCrawler(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackDemon.class, new RenderBlackDemon(new ModelBlackDemon(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityGhost.class, new RenderGhost(new ModelGhost(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKK.class, new RenderKK(new ModelKK(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKKspawn.class, new RenderKKspawn(new ModelKKspawn(), 0.5F));


		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos1.class, new RenderKos1(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos2.class, new RenderKos2(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos3.class, new RenderKos3(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos4.class, new RenderKos4(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityFremGuard.class, new RenderFremGuard(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackGuard.class, new RenderBlackGuard(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityVarze.class, new RenderVarze(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackGuard2.class, new RenderBlackGuard2(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBandit.class, new RenderBandit(new ModelBiped(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityMugger.class, new RenderMugger(new ModelBiped(), 0.5F));


		RenderingRegistry.instance().registerEntityRenderingHandler(EntityLavaBlock.class, new RenderLavaBlock(new ModelLavaBlock(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityLootChest.class, new RenderLootChest(new ModelLootChest(), 0.5F));
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityTNTXPrimed.class, new RenderTNTPrimed());
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityTinyTNTPrimed.class, new RenderTNTPrimed());


		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DBA,(IItemRenderer) new ItemRenderDBA());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DDS,(IItemRenderer) new ItemRenderDDS());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DD,(IItemRenderer) new ItemRenderDD());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.RAPIER,(IItemRenderer) new ItemRenderRAPIER());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Sarastaff,(IItemRenderer) new ItemRenderSARASTAFF());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Zammystaff,(IItemRenderer) new ItemRenderZAMMYSTAFF());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Guthixstaff,(IItemRenderer) new ItemRenderGUTHIXSTAFF());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Whip,(IItemRenderer) new ItemRenderWhip());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.BGS,(IItemRenderer) new ItemRenderBGS());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.ZGS,(IItemRenderer) new ItemRenderZGS());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AGS,(IItemRenderer) new ItemRenderAGS());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.SGS,(IItemRenderer) new ItemRenderSGS());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.SteelHammer,(IItemRenderer) new ItemRenderSteelHammer());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.MithHammer,(IItemRenderer) new ItemRenderMithHammer());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AddyHammer,(IItemRenderer) new ItemRenderAddyHammer());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.RuneHammer,(IItemRenderer) new ItemRenderRuneHammer());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.sarasword,(IItemRenderer) new ItemRenderSaraSword());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.ToragHammer,(IItemRenderer) new ItemRenderToragHammer());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.VeracFlail,(IItemRenderer) new ItemRenderVeracFlail());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.GuthanSpear,(IItemRenderer) new ItemRenderGuthanSpear());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DharokAxe,(IItemRenderer) new ItemRenderDharokAxe());
		MinecraftForgeClient.registerItemRenderer(mod_MagicBow.KarilBow,(IItemRenderer) new ItemRenderKarilBow());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AhrimStaff,(IItemRenderer) new ItemRenderAhrimStaff());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AkrisaeMace,(IItemRenderer) new ItemRenderAkrisaeMace());
		MinecraftForgeClient.registerItemRenderer(mod_MagicBow.DarkBow,(IItemRenderer) new ItemRenderDarkBow());

		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.PitchFork,(IItemRenderer) new ItemRenderPitchFork());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.BlackHalberd,(IItemRenderer) new ItemRenderBlackHalberd());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Cmaul,(IItemRenderer) new ItemRenderCmaul());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DryRapier,(IItemRenderer) new ItemRenderDryRapier());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DryMace,(IItemRenderer) new ItemRenderDryMace());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DryLong,(IItemRenderer) new ItemRenderDryLong());
		MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.D2H,(IItemRenderer) new ItemRenderD2H());



		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFireEntity.class, new TileEntityFireRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStallEntity.class, new TileStallRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockStallEntity.class, new TileEntityBlockStallRenderer());

		RenderingRegistry.registerEntityRenderingHandler(EntityMagicBoat.class, new RenderMagicBoat());

	}
	//These are the texture files with the item/block textures
}

