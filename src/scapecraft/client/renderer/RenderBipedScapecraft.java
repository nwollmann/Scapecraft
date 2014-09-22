package scapecraft.client.renderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBipedScapecraft extends RenderBiped
{
	private ResourceLocation texture;
	
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
}
