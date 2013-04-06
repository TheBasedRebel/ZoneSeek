package ZoneSeek.common.worldgen.Prehistoric;

import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeGenPrehistoric extends BiomeGenBase{

	//public WorldGenerator treeGenerator;
	public short sTopBlock;
	public short sFillerBlock;
	public BiomeGenPrehistoric(int par1)
    {
        super(par1);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 10, 4, 4));
        this.sTopBlock = (short)BlocksHelper.TropicalGrass.blockID;
        this.sFillerBlock = (short)BlocksHelper.TropicalDirt.blockID;
        //this.theBiomeDecorator = new BiomeDecoratorDreamLand(this);
        //this.theBiomeDecorator.treesPerChunk = 10;
        //this.theBiomeDecorator.grassPerChunk = 2;
    }

	/**
     * Allocate a new BiomeDecorator for this BiomeGenBase
     */
    @Override
    public BiomeDecorator createBiomeDecorator()
    {   
    	System.out.println("Biome Decorator created");
        return new BiomeDecoratorPrehistoric(this);
       
    }
    /**
     * Gets a WorldGen appropriate for this biome.
     */
   
    @SideOnly(Side.CLIENT)

    /**
     * takes temperature, returns color
     */
    public int getSkyColorByTemp(float par1)
    {
        return 0;
    }
    
}