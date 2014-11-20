package scapecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraftforge.client.GuiIngameForge;

import org.lwjgl.opengl.GL11;

import scapecraft.Stats;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiHealth extends Gui
{
	Minecraft mc = Minecraft.getMinecraft();

	public void drawHealthBar(ScaledResolution resolution)
	{
		int width = resolution.getScaledWidth();
		int height = resolution.getScaledHeight();
		this.mc.mcProfiler.startSection("health");
		
		float maxHealth = (float) this.mc.thePlayer.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
		float health = this.mc.thePlayer.getHealth();
		int x = width / 2 - 83;
		int y = height - GuiIngameForge.left_height;

		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		this.mc.fontRendererObj.drawStringWithShadow("Special: " + Stats.getEnergy(this.mc.thePlayer) + "/" + 100, x, y - 10, 0xFFFFFF);
		this.mc.fontRendererObj.drawStringWithShadow("HP: " + String.format("%.1f", health) + "/" + maxHealth, x, y, 0xFFFFFF);
		this.mc.fontRendererObj.drawStringWithShadow("Combat: " + Stats.getCombatLevel(this.mc.thePlayer) + " (" + Stats.getCombatxp(this.mc.thePlayer) + ")", width - 100, y, 0xFFFFFF);
		this.mc.fontRendererObj.drawStringWithShadow("Agility: " + Stats.getAgilityLevel(this.mc.thePlayer) + " (" + Stats.getAgilityxp(this.mc.thePlayer) + ")", width - 100, y + 10, 0xFFFFFF);
		this.mc.fontRendererObj.drawStringWithShadow("Mining: " + Stats.getMiningLevel(this.mc.thePlayer) + " (" + Stats.getMiningxp(this.mc.thePlayer) + ")", width - 100, y + 20, 0xFFFFFF);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glPopMatrix();

		mc.getTextureManager().bindTexture(Gui.icons);

		this.mc.mcProfiler.endSection();
	}
}
