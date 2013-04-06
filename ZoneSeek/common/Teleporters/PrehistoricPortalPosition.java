package ZoneSeek.common.Teleporters;

import net.minecraft.util.ChunkCoordinates;

public class PrehistoricPortalPosition extends ChunkCoordinates{

	public long field_85087_d;

    final PrehistoricTeleporter field_85088_e;

    public PrehistoricPortalPosition(PrehistoricTeleporter par1Teleporter, int par2, int par3, int par4, long par5)
    {
        super();//(par2, par3, par4)
        this.field_85088_e = par1Teleporter;
        this.field_85087_d = par5;
    }
}