package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWallPaperCrimson extends Block{
	@SideOnly(Side.CLIENT)
	protected Icon topIcon;
	@SideOnly(Side.CLIENT)
	protected Icon sideIcon;
	@SideOnly(Side.CLIENT)
	protected Icon bottomIcon;

public BlockWallPaperCrimson(int ID) {
	super(ID, Material.wood);

	}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
         this.blockIcon = par1IconRegister.registerIcon("zoneseek:wpcrimson");
     	this.topIcon  = par1IconRegister.registerIcon("zoneseek:wpcrimsontop");
    	this.sideIcon = par1IconRegister.registerIcon("zoneseek:wpcrimson");
    	this.bottomIcon = par1IconRegister.registerIcon("zoneseek:wpcrimsontop");
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
