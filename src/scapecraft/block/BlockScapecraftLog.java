package scapecraft.block;

import scapecraft.Scapecraft;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockScapecraftLog extends BlockLog
{
	public BlockScapecraftLog()
	{
		super();
		this.setCreativeTab(Scapecraft.tabScapecraftBlock);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		this.field_150167_a = new IIcon[1];
		this.field_150166_b = new IIcon[1];
		this.field_150167_a[0] = iconRegister.registerIcon(this.getTextureName() + "0");
		this.field_150166_b[0] = iconRegister.registerIcon(this.getTextureName() + "1");
	}

	public BlockScapecraftLog setHarvest(String tool, int level)
	{
		this.setHarvestLevel(tool, level);
		return this;
	}
}
