package ZoneSeek.common.items;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCrystal extends Item{
	
	private String textureName;

	public ItemCrystal(int id, String tex) {
		super(id);
		this.textureName = tex;
	}
	public String getTextureName(){
		return this.textureName;
	}
	
	public void updateIcons(IconRegister reg){
		this.iconIndex = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}