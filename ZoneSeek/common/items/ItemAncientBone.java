package ZoneSeek.common.items;


import ZoneSeek.common.blocks.BlocksHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAncientBone extends Item{
	
	private String textureName;

	public ItemAncientBone(int par1, String tex)
	{
		super(par1);
		this.maxStackSize = 1;
        this.setMaxDamage(64);
        this.textureName = tex;
	}
	
	public String getTextureName(){
		return this.textureName;
	}

	public void updateIcons(IconRegister reg){
		this.iconIndex = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		int blockID = par3World.getBlockId(par4, par5, par6);
		if (blockID == BlocksHelper.SlagBlock.blockID)
		{
			BlocksHelper.portalprehistoric.tryToCreatePortal(par3World, par4, par5 + 1, par6);
		}
		return true;

	}
}