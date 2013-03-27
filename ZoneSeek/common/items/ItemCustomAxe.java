package ZoneSeek.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCustomAxe extends ItemAxe{
	
	private String textureName;

	public ItemCustomAxe(int par1, EnumToolMaterial par2EnumToolMaterial, String tex) {
		super(par1, par2EnumToolMaterial);
		this.textureName = tex;
	}
	public String getTextureName(){
		return this.textureName;
	}
	public void updateIcons(IconRegister reg){
		this.iconIndex = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}
