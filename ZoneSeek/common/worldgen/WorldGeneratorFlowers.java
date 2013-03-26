package ZoneSeek.common.worldgen;

import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorFlowers implements IWorldGenerator{
    
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        
		switch(world.provider.dimensionId){
            case 1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}
    
	private void generateEnd(World world, Random random, int chunkX, int chunkZ){
		
	}
    
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {

		for(int i = 0; i < 0.2; i++){
			int Xcoord1 = BlockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(256);
			int Zcoord1 = BlockZ + random.nextInt(16);
			
			(new WorldGenFlowers(BlocksHelper.BloodFlower.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			(new WorldGenFlowers(BlocksHelper.Blossoms.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			(new WorldGenFlowers(BlocksHelper.Daisy.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			(new WorldGenFlowers(BlocksHelper.DeadFlower.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			(new WorldGenFlowers(BlocksHelper.Iris.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			(new WorldGenFlowers(BlocksHelper.SpringFlowers.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			(new WorldGenFlowers(BlocksHelper.Tulip.blockID)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
			}
	
	
    
	private void generateNether(World world, Random random, int chunkX, int chunkZ){
		
	}
	

    
}