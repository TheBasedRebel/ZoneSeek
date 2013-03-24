package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockStone extends Block{

	private String textureName;

	public BlockStone(int par1, String tex) {
		super(par1, Material.rock);
		this.textureName = tex;
	}

	public String getTextureName(){
		return this.textureName;
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}