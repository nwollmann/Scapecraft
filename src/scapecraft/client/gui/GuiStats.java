package scapecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiStats extends GuiScreen
{
	//This isn't finished yet
	//private static final ResourceLocation guiBackground = new ResourceLocation("scapecraft", "textures/gui/Stats.png");
	//private Minecraft mc;
	//private FontRenderer fontRenderer;

	public GuiStats(Minecraft mc)
	{
		super();
		//this.mc = mc;
		//this.fontRenderer = mc.fontRendererObj;
	}

	@Override
	public void drawScreen(int x, int y, float f)
	{
		super.drawScreen(x, y, f);
		this.drawDefaultBackground();
	}
}
