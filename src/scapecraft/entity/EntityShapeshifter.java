package scapecraft.entity;

import io.netty.buffer.ByteBuf;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityShapeshifter extends EntityScapecraft implements IEntityAdditionalSpawnData
{
	public EntityLivingBase copiedMob;
	public String mobName;
	private static Random staticRand = new Random();

	public EntityShapeshifter(World world)
	{
		this(world, ScapecraftEntities.entities.get(staticRand.nextInt(ScapecraftEntities.entities.size())));
	}

	public EntityShapeshifter(World world, String mobName)
	{
		super(world);
		this.mobName = mobName;
		copiedMob = ScapecraftEntities.spawnScapecraftEntity(mobName, world);
		this.setSize(copiedMob.width, copiedMob.height);
	}

	@Override
	public void setWorld(World world)
	{
		super.setWorld(world);
		copiedMob.setWorld(world);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount)
	{
		if(source.getSourceOfDamage() != null)
		{
			amount /= 2;
			source.getSourceOfDamage().attackEntityFrom(source, amount);
		}
		return super.attackEntityFrom(source, amount);
	}

	@Override
	protected void updateArmSwingProgress()
	{
		super.updateArmSwingProgress();
		copiedMob.swingProgressInt = this.swingProgressInt;
		copiedMob.isSwingInProgress = this.isSwingInProgress;
		copiedMob.swingProgress = this.swingProgress;
	}

	@Override
	public void moveEntityWithHeading(float strafe, float forward)
	{
		super.moveEntityWithHeading(strafe, forward);
		copiedMob.prevLimbSwingAmount = this.prevLimbSwingAmount;
		copiedMob.limbSwingAmount = this.limbSwingAmount;
		copiedMob.limbSwing = this.limbSwing;
	}
		
	@Override
	public void setLocationAndAngles(double x, double y, double z, float yaw, float pitch)
	{
		super.setLocationAndAngles(x, y, z, yaw, pitch);
		copiedMob.setLocationAndAngles(x, y, z, yaw, pitch);
	}

	@Override
	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		copiedMob.hurtTime = this.hurtTime;
		copiedMob.deathTime = this.deathTime;
	}

	@Override
	public void writeSpawnData(ByteBuf data)
	{
		ByteBufUtils.writeUTF8String(data, this.mobName);
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		this.mobName = ByteBufUtils.readUTF8String(data);
		copiedMob = ScapecraftEntities.spawnScapecraftEntity(this.mobName, this.worldObj);
		this.setSize(copiedMob.width, copiedMob.height);
	}
}
