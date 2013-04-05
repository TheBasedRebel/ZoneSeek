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
		}else if(this.blockID == IDsHelper.ApophylliteID){
			return ItemsHelper.ApophylliteCrystal.itemID;
		}else if(this.blockID == IDsHelper.AxiniteID){
			return ItemsHelper.AxiniteCrystal.itemID;
		}else if(this.blockID == IDsHelper.BetafiteID){
			return ItemsHelper.BetafiteCrystal.itemID;
		}else if(this.blockID == IDsHelper.BrochantiteID){
			return ItemsHelper.BrochantiteCrystal.itemID;
		}else if(this.blockID == IDsHelper.DolomiteID){
			return ItemsHelper.DolomiteCrystal.itemID;
		}else if(this.blockID == IDsHelper.FotiteID){
			return ItemsHelper.FotiteCrystal.itemID;
		}else if(this.blockID == IDsHelper.HeterogeniteID){
			return ItemsHelper.HeterogeniteCrystal.itemID;
		}else if(this.blockID == IDsHelper.KasoliteID){
			return ItemsHelper.KasoliteCrystal.itemID;
		}else if(this.blockID == IDsHelper.LazuriteID){
			return ItemsHelper.LazuriteCrystal.itemID;
		}else if(this.blockID == IDsHelper.AnthraciteCoalOreID){
			return ItemsHelper.AnthraciteCoal.itemID;
			
			
		}else{
			return this.blockID;
		}
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("zoneseek:" + this.getTextureName());
	}

}