package scapecraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderEntityScapecraft extends RenderLiving
{
	private ResourceLocation texture;
	float scale = 1F;
	float xOffset, yOffset, zOffset = 0F;
	public RenderEntityScapecraft(ModelBase modelBase, float par2, ResourceLocation texture)
	{
		super(modelBase, par2);
		this.texture = texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return texture;
	}

	public RenderEntityScapecraft setScale(float scale)
	{
		this.scale = scale;
		return this;
	}

	public RenderEntityScapecraft setOffset(float x, float y, float z)
	{
		this.xOffset = x;
		this.yOffset = y;
		this.zOffset = z;
		return this;
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entityLiving, float f)
	{
		GL11.glScalef(scale, scale, scale);
		GL11.glTranslatef(xOffset, yOffset, zOffset);
	}
}
