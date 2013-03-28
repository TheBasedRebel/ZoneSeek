package ZoneSeek.common.entities;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityInfectionBook extends EntityThrowable

{


    public EntityInfectionBook(World par1World)
    {
        super(par1World);
    }

    public EntityInfectionBook(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntityInfectionBook(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }


    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
//        if (par1MovingObjectPosition.entityHit != null)
//        {
//            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0);
//        }

        if (!this.worldObj.isRemote)
        {

	        Deux deux = new Deux(this.worldObj);

	        deux.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
	        this.worldObj.spawnEntityInWorld(deux);
          
            
        }
        for (int j = 0; j < 8; ++j)
        {
            this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}