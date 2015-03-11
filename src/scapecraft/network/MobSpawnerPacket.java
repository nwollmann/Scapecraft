package scapecraft.network;

import io.netty.buffer.ByteBuf;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;

import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MobSpawnerPacket implements IMessage, IMessageHandler<MobSpawnerPacket, IMessage>
{
	public NBTTagCompound tagCompound;
	public int dimensionId;
	public int playerId;
	public MobSpawnerPacket(){}

	@SideOnly(Side.CLIENT)
	public MobSpawnerPacket(TileEntity te)
	{
		tagCompound = new NBTTagCompound();
		te.writeToNBT(tagCompound);
		dimensionId = te.getWorld().provider.dimensionId;
		playerId = Minecraft.getMinecraft().thePlayer.getEntityId();
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		tagCompound = ByteBufUtils.readTag(buf);
		dimensionId = buf.readInt();
		playerId = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		ByteBufUtils.writeTag(buf, tagCompound);
		buf.writeInt(dimensionId);
		buf.writeInt(playerId);
	}

	@Override
	public IMessage onMessage(MobSpawnerPacket message, MessageContext ctx)
	{
		EntityPlayer player = (EntityPlayer) MinecraftServer.getServer().worldServers[message.dimensionId].getEntityByID(message.playerId);

		if(player.capabilities.isCreativeMode)
			MinecraftServer.getServer().worldServers[message.dimensionId].getTileEntity(message.tagCompound.getInteger("x"), message.tagCompound.getInteger("y"), message.tagCompound.getInteger("z")).readFromNBT(message. tagCompound);

		return null;
	}
}
