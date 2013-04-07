package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPrehistoricLog extends Block
{
	@SideOnly(Side.CLIENT)
	protected Icon topIcon;
	@SideOnly(Side.CLIENT)
	protected Icon sideIcon;

	public BlockPrehistoricLog(int blockId)
	{
		super(blockId, Material.wood);
		this.setHardness(3.0F);
		this.setStepSound(soundWoodFootstep);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("zoneseek:Prehistoriclog");
		this.topIcon  = par1IconRegister.registerIcon("zoneseek:Prehistoriclogtop");
		this.sideIcon = par1IconRegister.registerIcon("zoneseek:Prehistoriclog");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata)
	{
		if (side == 1 || side == 0)
		{
			return this.topIcon;
		}
		else
		{
			return this.sideIcon;
		}
	}

    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte b0 = 4;
        int j1 = b0 + 1;

        if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);

                        if (Block.blocksList[j2] != null)
                        {
                            Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
                        }
                    }
                }
            }
        }
    }

	@Override
	public boolean canSustainLeaves(World world, int x, int y, int z)
	{
		return true;
	}

	@Override
	public boolean isWood(World world, int x, int y, int z)
	{
		return true;
	}

}