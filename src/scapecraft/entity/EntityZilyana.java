package scapecraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityZilyana extends EntityScapecraft
{
	public EntityZilyana(World world)
	{
		super(world);
	}
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(600.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.90D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0D);
	}

	@Override
	public int getTotalArmorValue()
	{
		return 13;
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected void attackEntity(Entity entity, float f)
	{
		if (this.attackTime <= 0 && f < 2.0F && entity.boundingBox.maxY > this.boundingBox.minY && entity.boundingBox.minY < this.boundingBox.maxY)
		{
			this.attackTime = 16;
			this.attackEntityAsMob(entity);
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		return true;
	}
}
