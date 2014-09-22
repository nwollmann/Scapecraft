package scapecraft.entity;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import scapecraft.ExtendedPlayer;

public abstract class EntityScapecraft extends EntityMob implements XpDropper
{
	protected HashMap<EntityPlayer, Float> attackers = new HashMap<EntityPlayer, Float>();
	protected static HashMap<Class<? extends EntityScapecraft>, ArrayList<AbstractMap.SimpleEntry<Integer, ItemStack>>> drops = new HashMap<Class<? extends EntityScapecraft>, ArrayList<AbstractMap.SimpleEntry<Integer, ItemStack>>>();
	protected int lifespan;

	public EntityScapecraft(World par1World) 
	{
		super(par1World);
	}

	public void giveXp()
	{
		float damageTaken = 0;
		for(Float damage : attackers.values())
			damageTaken += damage;
		for(Entry<EntityPlayer, Float> entry : attackers.entrySet())
			ExtendedPlayer.addXp(entry.getKey(), (int) (damageTaken / entry.getValue() * this.getXpValue()));
	}

	public int getXpValue(){return 0;};//TODO make this abstract

	protected void dropFewItems(boolean par1, int par2)
	{
		for(AbstractMap.SimpleEntry<Integer, ItemStack> drop : drops.get(this.getClass()))
			if(rand.nextInt(drop.getKey()) == 0)
				entityDropItem(drop.getValue().copy(), 1);
	}

	public static void addDrop(Class<? extends EntityScapecraft> entityClass, int chance, ItemStack drop)
	{
		ArrayList<AbstractMap.SimpleEntry<Integer, ItemStack>> list = drops.get(entityClass);
		if(list == null)
			list = new ArrayList<AbstractMap.SimpleEntry<Integer, ItemStack>>();
		list.add(new AbstractMap.SimpleEntry<Integer, ItemStack>(chance, drop));
		drops.put(entityClass, list);
	}

	@Override
	public void onLivingUpdate()
	{
		if(ticksExisted > lifespan && this.entityToAttack != null && !this.entityToAttack.isDead)
			setDead(); 
		super.onLivingUpdate();
	}
}
