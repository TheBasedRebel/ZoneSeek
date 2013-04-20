package ZoneSeek.common.worldgen.Prehistoric;

import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomePrehistoric extends BiomeGenBasePrehistoric {

	public BiomePrehistoric(int par1) {
		super(par1);
		this.theBiomeDecorator = new BiomeDecoratorPrehistoric(this);
		this.topBlock = (byte) BlocksHelper.PrehistoricGrass.blockID;
		this.fillerBlock = (byte) BlocksHelper.PrehistoricDirt.blockID;
		setMinMaxHeight(0.2F, 2.3F);
		setEnableSnow();
		setTemperatureRainfall(0.5F, 0.5F);

	}

	public boolean getEnableSnow() {
		return true;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random par1Random) {
		return (WorldGenerator) (par1Random.nextInt(5) == 0 ? this.genPrehistoricTrees: this.genPrehistoricTrees2);// change these
	}
}
