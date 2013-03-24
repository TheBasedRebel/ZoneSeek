package ZoneSeek.common.items;


import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMisc extends Item{
	
	private String textureName;

	public ItemMisc(int id, String tex) {
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