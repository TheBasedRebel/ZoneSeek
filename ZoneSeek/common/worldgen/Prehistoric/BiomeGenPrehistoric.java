package ZoneSeek.common.worldgen.Prehistoric;

import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.worldgen.WorldGenLagoonTallGrass;
import ZoneSeek.common.worldgen.WorldGenLagoonTree;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTallGrass;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTree;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenPrehistoric extends BiomeGenBase // implements IWorldGenerator {
{
	public BiomeGenPrehistoric(int par1) {
		super(par1);
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (byte) BlocksHelper.PrehistoricGrass.blockID;
		this.fillerBlock = (byte) BlocksHelper.PrehistoricDirt.blockID;
		this.theBiomeDecorator.treesPerChunk = 3;
		this.minHeight = -0.4F;
		this.maxHeight = 2F;
		this.waterColorMultiplier = 0xDEDE2F;
	}
	
    public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? new WorldGenPrehistoricTallGrass(BlocksHelper.PrehistoricTallGrass.blockID, topBlock) : new WorldGenLagoonTallGrass(BlocksHelper.PrehistoricTallGrass.blockID, fillerBlock);
    }
    
   public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? new WorldGenPrehistoricTree(false, 40, 0, 0) : new WorldGenPrehistoricTree(false, 40, 0, 0));
    }

}