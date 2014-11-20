package scapecraft.util;

import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;

public class CombatXpHelper
{
	public static HashMap<Class<? extends EntityLivingBase>, Integer> amounts = new HashMap<Class<? extends EntityLivingBase>, Integer>();

	public static void addVanilla()
	{
		amounts.put(EntitySlime.class, 10);
		amounts.put(EntitySilverfish.class, 15);
		amounts.put(EntityMagmaCube.class, 15);
		amounts.put(EntitySpider.class, 23);
		amounts.put(EntityZombie.class, 25);
		amounts.put(EntitySkeleton.class, 26);
		amounts.put(EntityCaveSpider.class, 27);
		amounts.put(EntityBlaze.class, 23);
		amounts.put(EntityCreeper.class, 25);
		amounts.put(EntityWitch.class, 30);
		amounts.put(EntityGhast.class, 30);
	}

	public static int getAmount(Entity entity)
	{
		Integer amount = amounts.get(entity.getClass());
		return amount != null ? amount : 0;
	}
}
