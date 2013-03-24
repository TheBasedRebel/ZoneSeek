package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWallPaperBlue extends Block{
	@SideOnly(Side.CLIENT)
	protected Icon topIcon;
	@SideOnly(Side.CLIENT)
	protected Icon sideIcon;
	@SideOnly(Side.CLIENT)
	protected Icon bottomIcon;

public BlockWallPaperBlue(int ID) {
	super(ID, Material.wood);

	}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
         this.blockIcon = par1IconRegister.registerIcon("zoneseek:wpblue");
     	this.topIcon  = par1IconRegister.registerIcon("zoneseek:wpbluetop");
    	this.sideIcon = par1IconRegister.registerIcon("zoneseek:wpblue");
    	this.bottomIcon = par1IconRegister.registerIcon("zoneseek:wpbluetop");
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
