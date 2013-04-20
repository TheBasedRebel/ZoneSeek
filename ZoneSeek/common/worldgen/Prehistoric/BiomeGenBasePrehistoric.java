package ZoneSeek.common.worldgen.Prehistoric;

import java.awt.Color;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.entities.Apatosaurus;
import ZoneSeek.common.entities.Eotyrannus;
import ZoneSeek.common.entities.LagoonSlug;
import ZoneSeek.common.entities.Obamadon;
import ZoneSeek.common.entities.Raptor;
import ZoneSeek.common.entities.Triceratops;
import ZoneSeek.common.worldgen.WorldGenLagoonTallGrass;
import ZoneSeek.common.worldgen.WorldGenLagoonTree;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTallGrass;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTree;
import ZoneSeek.common.worldgen.WorldGenPrehistoricTree2;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenBasePrehistoric extends BiomeGenBase // implements
														// IWorldGenerator {

{
	// public WorldGenerator treeGenerator;
	// public WorldGenerator grassGenerator;

	protected WorldGenPrehistoricTree genPrehistoricTrees;
	protected WorldGenPrehistoricTree2 genPrehistoricTrees2;
	 public static final BiomeGenBasePrehistoric PrehistoricBiome;

	public BiomeGenBasePrehistoric(int par1) {
		super(par1);
		this.setBiomeName("Prehistoric");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (byte) BlocksHelper.PrehistoricGrass.blockID;
		this.fillerBlock = (byte) BlocksHelper.PrehistoricDirt.blockID;
		// this.treeGenerator = new WorldGenPrehistoricTree(false);
		// this.grassGenerator = new
		// WorldGenPrehistoricTallGrass(BlocksHelper.PrehistoricTallGrass.blockID,
		// topBlock);
		// this.theBiomeDecorator.treesPerChunk = 2;
		// this.theBiomeDecorator.grassPerChunk = 5;
	
		this.waterColorMultiplier = 0xDEDE2F;

		this.spawnableMonsterList
				.add(new SpawnListEntry(Raptor.class, 5, 3, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(Eotyrannus.class, 5,
				3, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(Triceratops.class, 5,
				3, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(Apatosaurus.class, 5,
				3, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(Obamadon.class, 5, 3,
				5));
		this.genPrehistoricTrees = new WorldGenPrehistoricTree(false);
		this.genPrehistoricTrees2 = new WorldGenPrehistoricTree2();//change
	}


	@SideOnly(Side.CLIENT)
	/**
	 * takes temperature, returns color
	 */
	public int getSkyColorByTemp(float var1) {
		return Color.getHSBColor(0.1000F, 0.30F, 1.0F).getRGB();
	}

	 static
	    {
		 PrehistoricBiome = (BiomeGenBasePrehistoric) (new BiomePrehistoric(13)).setBiomeName("Prehistoric");
	    }
}
