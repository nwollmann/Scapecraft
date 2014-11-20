package scapecraft.tileentity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityBlockSpawner extends TileEntity
{
	public long startTime = 0L;
	public int regenTime = 6000;
	public int uses = -1;

	@Override
	public void updateEntity()
	{
		if(this.worldObj != null && !this.worldObj.isRemote && this.worldObj.getTotalWorldTime() % 20L == 0L)
		{
			if(startTime == 0L)
			{
				startTime = MinecraftServer.getServer().getEntityWorld().getTotalWorldTime();
				return;
			}
			int metadata;
			if((metadata = worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord)) == 15)
				return;
			if(regenTime < 320)
			{
				worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, metadata + 320 / regenTime > 15 ? 15 : metadata + 320 / regenTime, 3);
				return;
			}

			if((MinecraftServer.getServer().getEntityWorld().getTotalWorldTime() - startTime) * 16 / regenTime > metadata)
			{
				worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, metadata + 1, 3);

				for(Object obj : worldObj.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(this.xCoord, this.yCoord, this.xCoord, this.xCoord + 1, this.yCoord + 1, this.zCoord + 1)))
				{
					EntityLivingBase entity = (EntityLivingBase) obj;
					entity.setPosition(entity.posX, entity.posY + 0.2, entity.posZ);
				}
			}
		}
	}

	public void writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("regenTime", regenTime);
		compound.setLong("startTime", startTime);
		compound.setInteger("uses", uses);
	}

	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.regenTime = compound.getInteger("regenTime");
		this.startTime = compound.getLong("startTime");
		this.uses = compound.getInteger("uses");
	}

	public TileEntityBlockSpawner setRegenTime(int regenTime)
	{
		this.regenTime = regenTime;
		return this;
	}

}
