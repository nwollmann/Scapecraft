package scapecraft.item;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import scapecraft.ExtendedPlayer;

public class ItemGodsword extends ItemWeapon
{
	Random rand = new Random();
	int specialCost;

	public ItemGodsword(ScapecraftToolMaterial toolMaterial, String name, int specialCost)
	{
		super(toolMaterial, 12F, name);
		this.specialCost = specialCost;
	}

	@Override
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker)
	{
		super.hitEntity(itemStack, target, attacker);
		if(this.toolMaterial == ScapecraftToolMaterial.AGS && itemStack.getTagCompound() != null && itemStack.getTagCompound().getBoolean("special")) 
		{
			attacker.motionY = 1.3D;
			for(int x = -2; x <= 1; x++)
				for(int y = -1; y <= 3; y++)
					for(int z = -2; z <= 1; z++)
						if(rand.nextFloat() > .6F)
						       	attacker.worldObj.spawnParticle("magicCrit", attacker.posX + x, attacker.posY + y, attacker.posZ + z, 0D, 0D, 1D);
			itemStack.getTagCompound().setBoolean("special", false);
		}

		return true;
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));

		if (ExtendedPlayer.getEnergy(player) >  specialCost)
		{
			itemStack.getTagCompound().setBoolean("special", true);
			ExtendedPlayer.addEnergy(player, -specialCost);		
			//if (par2World.isRemote){par3EntityPlayer.addChatMessage("\u00a7ESpecial Activated");
		}

		return itemStack;
	}
}
