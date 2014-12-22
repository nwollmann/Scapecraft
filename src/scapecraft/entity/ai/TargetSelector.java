package scapecraft.entity.ai;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;

import scapecraft.entity.EntityScapecraft;

public class TargetSelector implements IEntitySelector
{
	public TargetSelector(EntityScapecraft entity)
	{
	}
	@Override
	public boolean isEntityApplicable(Entity target)
	{
		return false;
	}
}
