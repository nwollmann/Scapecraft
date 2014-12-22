package scapecraft.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemScapecraftSpawnEgg extends Item
{
	public static ArrayList<String> entities = new ArrayList<String>();
	public static ArrayList<Entity> entityObjects = new ArrayList<Entity>();
	

	public ItemScapecraftSpawnEgg()
	{
		this.setUnlocalizedName("scapecraftSpawnEgg");
		this.setCreativeTab(Scapecraft.tabScapecraftMisc);
		this.setHasSubtypes(true);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote && itemStack.getMetadata() < entities.size())
		{
			Block block = world.getBlock(x, y, z);
			x += Facing.offsetsXForSide[side];
			y += Facing.offsetsYForSide[side];
			z += Facing.offsetsZForSide[side];
			double yOffset = (side == 1 && block.getRenderType() == 11) ? 0.5D : 0D;

			EntityScapecraft entity;
			try {
				entity = (EntityScapecraft) ScapecraftEntities.entityNames.get(entities.get(itemStack.getMetadata())).getConstructor(new Class[] { World.class }).newInstance(new Object[] { world });
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}

			entity.setLocationAndAngles(x + 0.5D, y + yOffset, z + 0.5D, 0F, 0F);
			entity.onSpawnWithEgg(null);
			world.spawnEntityInWorld(entity);
			entity.playLivingSound();

			if (!player.capabilities.isCreativeMode)
				--itemStack.stackSize;
		}
		return true;
	}

	public static void addEntity(String entityName)
	{
		entities.add(entityName);
		try
		{
			entityObjects.add(ScapecraftEntities.entityNames.get(entityName).getConstructor(new Class[] { World.class }).newInstance(new Object[] { null }));
		} catch(Exception e) {e.printStackTrace(); };
		System.out.println(entityName);
	}

	@SideOnly(Side.CLIENT)
	@Override
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void getSubItems(Item item, CreativeTabs tab, List subItems)
	{
		for(int id = 0; id < entities.size(); id++)
			subItems.add(new ItemStack(this, 1, id));
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) 
	{
		this.checkStack(par1ItemStack);
		return getUnlocalizedName() + "." + entities.get(par1ItemStack.getMetadata());
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	{
		this.checkStack(stack);
		target.attackEntityFrom(new EntityDamageSource("player", attacker), (float) ((EntityScapecraft)entityObjects.get(stack.getMetadata())).getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
		return true;
	}

	public void checkStack(ItemStack stack)
	{
		 if(stack.hasTagCompound() && !stack.getTagCompound().getString("mob").isEmpty())
		 {
			 int newMeta = entities.indexOf(stack.getTagCompound().getString("mob"));
			 if(newMeta != -1)
				 stack.setMetadata(newMeta);
		 }
		 else
		 {
			 if(!stack.hasTagCompound())
				 stack.setTagCompound(new NBTTagCompound());
			 stack.getTagCompound().setString("mob", entities.get(stack.getMetadata()));
		 }
	}
}
