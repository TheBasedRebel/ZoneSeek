package ZoneSeek.common.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityInfectedArrow extends EntityArrow {

	public EntityInfectedArrow(World world) {
		super(world);
	}

	public EntityInfectedArrow(World par1World, EntityLiving par2EntityLiving, float par3) {
        super(par1World, par2EntityLiving, par3);
    }
}