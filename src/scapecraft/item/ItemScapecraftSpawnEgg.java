package scapecraft.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

	public ItemScapecraftSpawnEgg()
	{
		this.setUnlocalizedName("scapecraftSpawnEgg");
		this.setCreativeTab(Scapecraft.tabScapecraftMisc);
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

	public void addEntity(String entityName)
	{
		entities.add(entityName);
		System.out.println(entityName);
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
		@SideOnly(Side.CLIENT)
		@Override
		public void getSubItems(Item item, CreativeTabs tab, List subItems)
		{
			for(int id = 0; id < entities.size(); id++)
				subItems.add(new ItemStack(this, 1, id));
		}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) 
	{
		return getUnlocalizedName() + "." + entities.get(par1ItemStack.getMetadata());
	}
}
