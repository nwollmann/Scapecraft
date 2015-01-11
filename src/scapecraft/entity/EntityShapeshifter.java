package scapecraft.entity;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import scapecraft.item.ItemScapecraftSpawnEgg;

public class EntityShapeshifter extends EntityScapecraft
{
	public Entity copiedMob;
	private static Random staticRand = new Random();

	public EntityShapeshifter(World world)
	{
		this(world, ItemScapecraftSpawnEgg.entities.get(staticRand.nextInt(ItemScapecraftSpawnEgg.entities.size())));
	}

	public EntityShapeshifter(World world, String mobName)
	{
		super(world);
		System.out.println(mobName);
		copiedMob = ScapecraftEntities.spawnScapecraftEntity(mobName, world);
	}

	@Override
	public void setWorld(World world)
	{
		super.setWorld(world);
		copiedMob.setWorld(world);
	}

	@Override
	public void setLocationAndAngles(double x, double y, double z, float yaw, float pitch)
	{
		super.setLocationAndAngles(x, y, z, yaw, pitch);
		copiedMob.setLocationAndAngles(x, y, z, yaw, pitch);
	}
}
