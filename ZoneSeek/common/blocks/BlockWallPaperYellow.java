package ZoneSeek.common.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockWallPaperYellow extends Block{
	@SideOnly(Side.CLIENT)
	protected Icon topIcon;
	@SideOnly(Side.CLIENT)
	protected Icon sideIcon;
	@SideOnly(Side.CLIENT)
	protected Icon bottomIcon;

public BlockWallPaperYellow(int ID) {
	super(ID, Material.wood);

	}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
         this.blockIcon = par1IconRegister.registerIcon("zoneseek:wpyellow");
     	this.topIcon  = par1IconRegister.registerIcon("zoneseek:wpyellowtop");
    	this.sideIcon = par1IconRegister.registerIcon("zoneseek:wpyellow");
    	this.bottomIcon = par1IconRegister.registerIcon("zoneseek:wpyellowtop");
}

@Override
@SideOnly(Side.CLIENT)
public Icon getBlockTextureFromSideAndMetadata(int side, int metadata)
{
	if (side == 1)
	{
		return this.topIcon;
	}
	if (side == 0)
	{
		return this.bottomIcon;
	}
	else
	{
		return this.sideIcon;
	}
}

}