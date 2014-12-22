package scapecraft.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import net.minecraft.command.IEntitySelector;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import scapecraft.Stats;

public abstract class EntityScapecraft extends EntityMob implements XpDropper, IEntitySelector
{
	protected HashMap<EntityPlayer, Float> attackers = new HashMap<EntityPlayer, Float>();
	public static HashMap<Class<? extends EntityScapecraft>, ArrayList<Drop>> drops = new HashMap<Class<? extends EntityScapecraft>, ArrayList<Drop>>();
	protected int lifespan;
	public Set<Class<? extends EntityLivingBase>> targetClasses = new HashSet<Class<? extends EntityLivingBase>>();

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
			Stats.addXp(entry.getKey(), (int) (damageTaken / entry.getValue() * this.getXpValue()));
	}

	public int getXpValue()
	{
		return 0;
	}

	protected void dropFewItems(boolean par1, int par2)
	{
		if(drops.get(this.getClass()) != null)
			for(Drop drop : drops.get(this.getClass()))
				if(rand.nextInt(drop.chance) == 0)
					entityDropItem(drop.stack.copy(), 1);
	}

	public static void addDrop(Class<? extends EntityScapecraft> entityClass, int chance, ItemStack stack)
	{
		addDrop(entityClass, new Drop(stack, chance, false));
	}

	public static void addDrop(Class<? extends EntityScapecraft> entityClass, Drop drop)
	{
		ArrayList<Drop> list = drops.get(entityClass);
		if(list == null)
			list = new ArrayList<Drop>();
		list.add(drop);
		drops.put(entityClass, list);
	}

	@Override
	public void onLivingUpdate()
	{
		if(lifespan != 0 && ticksExisted > lifespan && this.entityToAttack != null && !this.entityToAttack.isDead)
			setDead(); 
		super.onLivingUpdate();
	}

	@Override
	protected void attackEntity(Entity entity, float f)
	{
		if (this.attackTime <= 0 && f < 2.0F && entity.boundingBox.maxY > this.boundingBox.minY && entity.boundingBox.minY < this.boundingBox.maxY)
		{
			this.attackTime = 20;
			this.attackEntityAsMob(entity);
		}
	}

	public float getAttackStrength(Entity entity)
	{
		float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();

		if(entity instanceof EntityLivingBase)
			damage += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLivingBase)entity);

		return damage;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		if(entity.attackEntityFrom(DamageSource.causeMobDamage(this), getAttackStrength(entity)))
		{
			if(entity instanceof EntityLivingBase)
			{
				int knockback = EnchantmentHelper.getKnockbackModifier(this, (EntityLivingBase) entity);
				if(knockback > 0)
				{
					entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)knockback* 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)knockback* 0.5F));
					this.motionX *= 0.6D;
					this.motionZ *= 0.6D;
				}

				EnchantmentHelper.func_151384_a((EntityLivingBase) entity, this);
			}

			int fire = EnchantmentHelper.getFireAspectModifier(this) * 4;
			if(fire > 0)
				entity.setFire(fire);

			EnchantmentHelper.func_151385_b(this, entity);

			return true;
		}
		return false;
	}

	@Override
	public void damageEntity(DamageSource source, float damage)
	{
		float oldHealth = this.getHealth();
		super.damageEntity(source, damage);
		if(source.getSourceOfDamage() instanceof EntityPlayer)
		{
			EntityPlayer attacker = (EntityPlayer) source.getSourceOfDamage();
			if(attackers.get(attacker) == null)
				attackers.put(attacker, oldHealth - this.getHealth());
			else
				attackers.put(attacker, attackers.get(attacker) + oldHealth - this.getHealth());
		}
	}

	@Override
	public boolean isEntityApplicable(Entity entity)
	{
		return targetClasses.contains(entity.getClass());
	}

	/*
	 * Object instead of Class to avoid warnings because java is weird
	 */
	@SuppressWarnings("unchecked")
	public void addTargets(Object... entityClasses)
	{
		for(Object entityClass : entityClasses)
			if(EntityLivingBase.class.isAssignableFrom((Class<?>) entityClass))
				targetClasses.add((Class<? extends EntityLivingBase>) entityClass);
	}

}
