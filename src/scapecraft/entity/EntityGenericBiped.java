package scapecraft.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import scapecraft.item.ScapecraftItems;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;

public class EntityGenericBiped extends EntityLiving
{
	private ItemStack[] equipment = new ItemStack[5];
	public String name = "";
	public GameProfile profile = null;

	public EntityGenericBiped(World p_i1594_1_)
	{
		super(p_i1594_1_);
	}

	@Override
	public ItemStack getHeldItem()
	{
		return this.equipment[0];
	}

	@Override
	public ItemStack getEquipmentInSlot(int slot)
	{
		return this.equipment[slot];
	}

	@Override
	public void setCurrentItemOrArmor(int slot, ItemStack itemStack)
	{
		this.equipment[slot] = itemStack;
	}

	@Override
	public ItemStack[] getInventory()
	{
		return this.equipment;
	}

	@Override
	public ItemStack func_130225_q(int slot)
	{
		return this.equipment[slot + 1];
	}

	@Override
	public String getCommandSenderName()
	{
		return name;
	}

	public void setGameProfile(GameProfile profile)
	{
		if(!profile.isComplete() || !profile.getProperties().containsKey("textures"))
		{
			GameProfile cachedProfile = MinecraftServer.getServer().getPlayerProfileCache().getGameProfileForUsername(profile.getName());
			if(cachedProfile != null)
			{
				if(Iterables.getFirst(cachedProfile.getProperties().get("textures"), (Object)null) == null)
				{
					cachedProfile = MinecraftServer.getServer().getMinecraftSessionService().fillProfileProperties(cachedProfile, true);
				}
				profile = cachedProfile;
			}
		}

		this.profile = profile;
		this.name = profile.getName();
	}

	public void addRandomEquipment()
	{
		if(!worldObj.isRemote && MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(this.name) != null)
		{
			EntityPlayer player = MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(this.name);
			for(int i = 0; i < 5; i++)
				this.equipment[i] = player.getEquipmentInSlot(i);
		}
		else
		{
			this.equipment[0] = new ItemStack(ScapecraftItems.dragon2hSword);
			this.equipment[1] = new ItemStack(ScapecraftItems.dragonHelmet);
			this.equipment[2] = new ItemStack(ScapecraftItems.dragonChestplate);
			this.equipment[3] = new ItemStack(ScapecraftItems.dragonLeggings);
			this.equipment[4] = new ItemStack(ScapecraftItems.dragonBoots);
		}
	}

	@Override
	public String getCustomNameTag()
	{
		return this.name;
	}

	@Override
	public boolean hasCustomNameTag()
	{
		return this.name.length() > 0;
	}

	@Override
	public boolean getAlwaysRenderNameTag()
	{
		return hasCustomNameTag();
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tagCompound)
	{
		super.writeEntityToNBT(tagCompound);
		NBTTagCompound profileNBT = new NBTTagCompound();
		NBTUtil.writeGameProfileToNBT(profileNBT, this.profile);
		tagCompound.setTag("Profile", profileNBT);
		tagCompound.setString("name", this.name);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tagCompound)
	{
		super.readEntityFromNBT(tagCompound);
		if(tagCompound.getCompoundTag("Profile") != null)
			this.profile = NBTUtil.readGameProfileFromNBT(tagCompound.getCompoundTag("Profile"));
		this.name = tagCompound.getString("name");
	}
}
