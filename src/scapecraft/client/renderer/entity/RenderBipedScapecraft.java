package scapecraft.client.renderer.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderBipedScapecraft extends RenderBiped
{
	private ResourceLocation texture;
	float scale = 1F;
	
	public RenderBipedScapecraft(ResourceLocation texture)
	{
		super(new ModelBiped(), 0.5F);
		this.texture = texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return texture;
	}

	public RenderBipedScapecraft setScale(float scale)
	{
		this.scale = scale;
		return this;
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entityLiving, float f)
	{
		GL11.glScalef(scale, scale, scale);
	}
}
