package ZoneSeek.common.worldgen.Prehistoric;

import java.awt.Color;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.worldgen.WorldGenLagoonTallGrass;
import ZoneSeek.common.worldgen.WorldGenLagoonTree;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTallGrass;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTree;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenPrehistoric extends BiomeGenBase // implements IWorldGenerator {

	
{
	//public WorldGenerator treeGenerator;
	//public WorldGenerator grassGenerator;
	
	public BiomeGenPrehistoric(int par1) {
		super(par1);
		this.setBiomeName("Prehistoric");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (byte) BlocksHelper.PrehistoricGrass.blockID;
		this.fillerBlock = (byte) BlocksHelper.PrehistoricDirt.blockID;
		//this.treeGenerator = new WorldGenPrehistoricTree(false);
		//this.grassGenerator = new WorldGenPrehistoricTallGrass(BlocksHelper.PrehistoricTallGrass.blockID, topBlock);
		//this.theBiomeDecorator.treesPerChunk = 3;
		//this.theBiomeDecorator.grassPerChunk = 5;
		this.minHeight = -0.4F;
		this.maxHeight = 2F;
		this.waterColorMultiplier = 0xDEDE2F;
	}
	
    @SideOnly(Side.CLIENT)

    /**
     * takes temperature, returns color
     */
    public int getSkyColorByTemp(float var1)
    {
        return Color.getHSBColor(0.1000F, 0.30F, 1.0F).getRGB();
    }
	
	/**
    public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? new WorldGenPrehistoricTallGrass(BlocksHelper.PrehistoricTallGrass.blockID, topBlock) : new WorldGenPrehistoricTallGrass(BlocksHelper.PrehistoricTallGrass.blockID, fillerBlock);
    }
    
   public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? new WorldGenPrehistoricTree(false) : new WorldGenPrehistoricTree(false));
    }
	
   @Override
    public BiomeDecorator createBiomeDecorator()
    {   
        return new BiomeDecoratorPrehistoric(this);
    }
    **/
    

}