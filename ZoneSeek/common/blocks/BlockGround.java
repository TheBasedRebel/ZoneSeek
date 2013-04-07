package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockGround extends Block{

	private String textureName;

	public BlockGround(int par1, String tex) {
		super(par1, Material.grass);
		this.textureName = tex;
		this.setStepSound(Block.soundGrassFootstep);
	}

	public String getTextureName(){
		return this.textureName;
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}