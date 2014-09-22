package scapecraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import scapecraft.Scapecraft;

public class EntityBot2 extends EntityScapecraft
{
	public EntityBot2(World par1World)
	{
		super(par1World);
		this.isImmuneToFire = true;
	}
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		// Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
		// Follow Range - default 32.0D - min 0.0D - max 2048.0D
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
		// Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.350D);
		// Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
	}


	public String getEntityName()
	{
		return "Magic Bot";
	}

	protected Entity findPlayerToAttack()
	{
		float var1 = this.getBrightness(1.0F);

		if (var1 < 0F)
		{
			double var2 = 16.0D;
			return this.worldObj.getClosestVulnerablePlayerToEntity(this, var2);
		}
		else
		{
			return null;
		}
	}

	public boolean isAIEnabled()
	{
		return false;
	}





	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
	}


	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
	}


	protected String getLivingSound()
	{
		return "mob.endermen.idle";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.endermen.hit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.endermen.death";
	}


	protected float getSoundVolume()
	{
		return 0.4F;
	}



	protected void dropFewItems(boolean par1, int par2){

		int quickvar = rand.nextInt(15000) + 1;
		int quickvar1 = rand.nextInt(20000) + 1;
		int quickvar2 = rand.nextInt(20000) + 1;
		int quickvar3 = rand.nextInt(25000) + 1;
		int quickvar4 = rand.nextInt(35) + 1;
		int quickvar5 = rand.nextInt(35) + 1;

		if(quickvar <= 1){

			entityDropItem(new ItemStack(Scapecraft.korasis), 1);

		}
		if(quickvar1 <= 1){

			entityDropItem(new ItemStack(Scapecraft.dragonLongsword), 1);

		}
		if(quickvar2 <= 1){

			entityDropItem(new ItemStack(Scapecraft.dragonaxe), 1);

		}
		if(quickvar3 <= 1){

			entityDropItem(new ItemStack(Scapecraft.dragonHelmet), 1);

		}
		if(quickvar4 <= 1){

			entityDropItem(new ItemStack(Items.stone_axe), 1);

		}
		if(quickvar5 <= 1){

			entityDropItem(new ItemStack(Items.stone_axe), 1);}


	}

	public int getAttackStrength(Entity par1Entity)
	{
		return 7;
	}



	@Override
	protected boolean canDespawn()
	{
		return true;
	}


	public void onLivingUpdate()
	{
		if(ticksExisted > 20 * 20) setDead(); 
		super.onLivingUpdate();
	}

	private static final ItemStack defaultHeldItem;
	public ItemStack getHeldItem()
	{
		return defaultHeldItem;
	}

	static
	{
		defaultHeldItem = new ItemStack(Scapecraft.dragonaxe, 1);
	}



}
