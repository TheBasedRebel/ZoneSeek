package ZoneSeek.common.blocks;

import java.util.Random;

import ZoneSeek.common.IDsHelper;
import ZoneSeek.common.items.ItemsHelper;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockOre extends Block{

	private String textureName;

	public BlockOre(int id, String textureName){
		super(id, Material.iron);
		this.setStepSound(Block.soundStoneFootstep);
		this.textureName = textureName;
	}

	public String getTextureName(){
		return this.textureName;
	}

	public int idDropped(int par1, Random rand, int par3){
		if(this.blockID == IDsHelper.SludgeOreID){
			return ItemsHelper.SludgeGem.itemID;
		//}else if(this.blockID == IDsHelper.SludgeOreID){
			//return ItemsHelper.SludgeGems.itemID;
		}else{
			return this.blockID;
		}
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}