package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockLamp extends Block{

	private String textureName;

	public BlockLamp(int par1, String tex) {
		super(par1, Material.rock);
		this.textureName = tex;
		this.setLightValue(1.0F);
		this.setLightOpacity(255);
	}

	public String getTextureName(){
		return this.textureName;
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}