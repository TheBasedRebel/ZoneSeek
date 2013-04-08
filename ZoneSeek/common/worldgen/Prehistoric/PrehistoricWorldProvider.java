package ZoneSeek.common.worldgen.Prehistoric;

import ZoneSeek.common.IDsHelper;
import ZoneSeek.common.biomes.BiomesHelper;
import net.minecraft.block.Block;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PrehistoricWorldProvider extends WorldProvider {
	/**
	 * creates a new world chunk manager for WorldProvider
	 */
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BiomesHelper.Prehistoric, 0.5F, 0.0F);
		this.dimensionId = IDsHelper.PrehistoricAgeID;
		this.hasNoSky = false;
	}

	/**
	 * Returns the chunk provider back for the world provider
	 */
	//public IChunkProvider getChunkProvider() {
		//return new ChunkProviderPrehistoric(this.worldObj, this.worldObj.getSeed(), false);
	//}
	
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderPrehistoric(this.worldObj, this.worldObj.getSeed(), true);
	}


	/**
	 * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
	 */
	public float calculateCelestialAngle(long par1, float par3) {
		return 2F;
	}


	@SideOnly(Side.CLIENT)
	public boolean isSkyColored() {
		return true;
	}

	/**
	 * True if the player can respawn in this dimension (true = overworld, false = nether).
	 */
	public boolean canRespawnHere() {
		return true;
	}

	/**
	 * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
	 */
	public boolean isSurfaceWorld() {
		return true;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * the y level at which clouds are rendered.
	 */
	public float getCloudHeight() {
		return 130.0F;
	}

	/**
	 * Will check if the x, z position specified is alright to be set as the map spawn point
	 */
	//public boolean canCoordinateBeSpawn(int par1, int par2) {
		//int var3 = this.worldObj.getFirstUncoveredBlock(par1, par2);
		//return var3 == 0 ? false : Block.blocksList[var3].blockMaterial.blocksMovement();
	//}

	/**
	 * Gets the hard-coded portal location to use when entering this dimension.
	 */


	/**
	 * Returns the dimension's name, e.g. "The End", "Nether", or "Overworld".
	 */
	public String getDimensionName() {
		return "Prehistoric Age";
	}
}