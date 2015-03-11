package scapecraft.network;

import io.netty.buffer.ByteBuf;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import scapecraft.Scapecraft;
import scapecraft.client.gui.GuiHandler;

import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MobSpawnerGuiPacket implements IMessage, IMessageHandler<MobSpawnerGuiPacket, IMessage>
{
	public NBTTagCompound tagCompound;
	public MobSpawnerGuiPacket(){}

	public MobSpawnerGuiPacket(TileEntity te)
	{
		tagCompound = new NBTTagCompound();
		te.writeToNBT(tagCompound);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		tagCompound = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		ByteBufUtils.writeTag(buf, tagCompound);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IMessage onMessage(MobSpawnerGuiPacket message, MessageContext ctx)
	{
		int x = message.tagCompound.getInteger("x"); 
		int y = message.tagCompound.getInteger("y"); 
		int z = message.tagCompound.getInteger("z"); 
		Minecraft.getMinecraft().thePlayer.worldObj.getTileEntity(x, y, z).readFromNBT(message.tagCompound);
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		player.openGui(Scapecraft.instance, GuiHandler.GuiId.SPAWNER.ordinal(), player.worldObj, x, y, z);
		return null;
	}
}
