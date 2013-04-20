package ZoneSeek.common.worldgen.Prehistoric;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDecoratorPrehistoric extends BiomeDecorator {

	public BiomeDecoratorPrehistoric(BiomeGenBase par1BiomeGenBase) 
	{
		super(par1BiomeGenBase);
	}

	public void decorate()
	{
		super.decorate();

		if(this.biome == BiomeGenBasePrehistoric.PrehistoricBiome)
		{
			this.treesPerChunk = 3;
			this.deadBushPerChunk = -999;
			this.reedsPerChunk = -999;
			this.flowersPerChunk = -999;
	
		}
	}
}