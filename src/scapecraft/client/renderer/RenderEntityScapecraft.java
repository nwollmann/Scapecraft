package scapecraft.client.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityScapecraft extends RenderLiving
{
	private ResourceLocation texture;
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
}
