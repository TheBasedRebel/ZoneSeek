package ZoneSeek.common.blocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockFlowerCustom extends BlockFlower implements IPlantable {
	private String textureName;
	public BlockFlowerCustom(int id, String tex) {
		super(id, Material.plants);
		this.textureName = tex;
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return EnumPlantType.Plains;
	}
	
	public String getTextureName(){
		return this.textureName;
	}


	@Override
	public int getPlantID(World world, int x, int y, int z) {
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z);
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("zoneseek:" + this.getTextureName());
	}
}