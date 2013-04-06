package ZoneSeek.common.worldgen.Prehistoric;

import ZoneSeek.common.IDsHelper;
import ZoneSeek.common.biomes.BiomesHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderHell;
public class PrehistoricWorldProvider extends WorldProvider{

	@Override
	public String getDimensionName() 
	{
		return "Prehistoric";
	}
	/**
     * creates a new world chunk manager for WorldProvider
     */
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomesHelper.Prehistoric, 0.8F, 0.1F);
		this.dimensionId = IDsHelper.PrehistoricAgeID;

	}

	/**
     * Returns a new chunk provider which generates chunks for this world
     */
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderPrehistoric(this.worldObj, worldObj.getSeed());
	}

}