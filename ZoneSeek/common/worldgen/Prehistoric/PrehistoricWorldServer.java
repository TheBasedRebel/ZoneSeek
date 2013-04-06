package ZoneSeek.common.worldgen.Prehistoric;

import ZoneSeek.common.Teleporters.PrehistoricTeleporter;
import net.minecraft.logging.ILogAgent;
import net.minecraft.profiler.Profiler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.storage.ISaveHandler;

public class PrehistoricWorldServer extends WorldServer {

	public PrehistoricWorldServer(MinecraftServer par1MinecraftServer,
			ISaveHandler par2iSaveHandler, String par3Str, int par4,
			WorldSettings par5WorldSettings, Profiler par6Profiler,
			ILogAgent par7iLogAgent) {
		super(par1MinecraftServer, par2iSaveHandler, par3Str, par4, par5WorldSettings,
				par6Profiler, par7iLogAgent);
		// TODO Auto-generated constructor stub
	}
	public Teleporter getDefaultTeleporter()
	{
		return new PrehistoricTeleporter(this);
	}
}