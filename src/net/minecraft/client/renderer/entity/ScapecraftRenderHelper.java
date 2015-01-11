package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ScapecraftRenderHelper
{
	public static ResourceLocation getEntityTexture(Entity entity)
	{
		return RenderManager.instance.getEntityRenderObject(entity).getEntityTexture(entity);
	}
}
