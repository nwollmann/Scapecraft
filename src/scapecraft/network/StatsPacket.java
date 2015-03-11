package scapecraft.network;

import io.netty.buffer.ByteBuf;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import scapecraft.Stats;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StatsPacket implements IMessage, IMessageHandler<StatsPacket, IMessage>
{

	private int combatXp;
	private int agilityXp;
	private int miningXp;
	private int combatLevel;
	private int agilityLevel;
	private int miningLevel;
	private int energy;

	public StatsPacket(){}

	public StatsPacket(EntityPlayer player)
	{
		combatXp = Stats.getCombatxp(player);
		agilityXp = Stats.getAgilityxp(player);
		miningXp = Stats.getMiningxp(player);
		combatLevel = Stats.getCombatLevel(player);
		agilityLevel = Stats.getAgilityLevel(player);
		miningLevel = Stats.getMiningLevel(player);
		energy = Stats.getEnergy(player);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		combatXp = buf.readInt();
		agilityXp = buf.readInt();
		miningXp = buf.readInt();
		combatLevel = buf.readInt();
		agilityLevel = buf.readInt();
		miningLevel = buf.readInt();
		energy = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(combatXp);
		buf.writeInt(agilityXp);
		buf.writeInt(miningXp);
		buf.writeInt(combatLevel);
		buf.writeInt(agilityLevel);
		buf.writeInt(miningLevel);
		buf.writeInt(energy);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IMessage onMessage(StatsPacket message, MessageContext ctx)
	{
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "combatxp", message.combatXp);
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "agilityxp", message.agilityXp);
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "miningxp", message.miningXp);
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "combatLevel", message.combatLevel);
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "agilityLevel", message.agilityLevel);
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "miningLevel", message.miningLevel);
		Stats.setStat(Minecraft.getMinecraft().thePlayer, "energy", message.energy);
		return null;
	}
}
