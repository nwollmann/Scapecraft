package scapecraft.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

import scapecraft.Scapecraft;
import scapecraft.entity.EntityScapecraft;
import scapecraft.entity.ScapecraftEntities;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemScapecraftSpawnEgg extends Item
{
	public ItemScapecraftSpawnEgg()
	{
		this.setUnlocalizedName("scapecraftSpawnEgg");
		this.setCreativeTab(Scapecraft.tabScapecraftMisc);
		this.setHasSubtypes(true);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote && itemStack.getMetadata() < ScapecraftEntities.entities.size())
		{
			Block block = world.getBlock(x, y, z);
			x += Facing.offsetsXForSide[side];
			y += Facing.offsetsYForSide[side];
			z += Facing.offsetsZForSide[side];
			double yOffset = (side == 1 && block.getRenderType() == 11) ? 0.5D : 0D;

			EntityScapecraft entity = ScapecraftEntities.spawnScapecraftEntity(ScapecraftEntities.entities.get(itemStack.getMetadata()), world);
			if(entity == null)
				return false;

			entity.setLocationAndAngles(x + 0.5D, y + yOffset, z + 0.5D, 0F, 0F);
			entity.onSpawnWithEgg(null);
			world.spawnEntityInWorld(entity);
			entity.playLivingSound();

			if (!player.capabilities.isCreativeMode)
				--itemStack.stackSize;
		}
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void getSubItems(Item item, CreativeTabs tab, List subItems)
	{
		for(int id = 0; id < ScapecraftEntities.entities.size(); id++)
			subItems.add(new ItemStack(this, 1, id));
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) 
	{
		this.checkStack(par1ItemStack);
		return getUnlocalizedName() + "." + ScapecraftEntities.entities.get(par1ItemStack.getMetadata());
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	{
		this.checkStack(stack);
		if(attacker instanceof EntityPlayer && ((EntityPlayer) attacker).capabilities.isCreativeMode)
			target.attackEntityFrom(new EntityDamageSource("player", attacker), (float) ((EntityScapecraft)ScapecraftEntities.entityObjects.get(stack.getMetadata())).getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
		return true;
	}

	public void checkStack(ItemStack stack)
	{
		 if(stack.hasTagCompound() && !stack.getTagCompound().getString("mob").isEmpty())
		 {
			 int newMeta = ScapecraftEntities.entities.indexOf(stack.getTagCompound().getString("mob"));
			 if(newMeta != -1)
				 stack.setMetadata(newMeta);
		 }
		 else
		 {
			 if(!stack.hasTagCompound())
				 stack.setTagCompound(new NBTTagCompound());
			 stack.getTagCompound().setString("mob", ScapecraftEntities.entities.get(stack.getMetadata()));
		 }
	}
}
