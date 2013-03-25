package ZoneSeek.common.entities;

import ZoneSeek.common.items.ItemsHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class LagoonSlug extends EntityMob{

	public LagoonSlug(World par1World) {
		super(par1World);
		this.texture = "/mods/zoneseek/textures/models/slug.png";
		this.moveSpeed = 0.4F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, true));
		this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
		this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 16.0F, 0, false));
	}

	 protected boolean isAIEnabled()
    {
        return true;
    }
	 
	 @Override
	 protected boolean canDespawn() {
	 return true;
	 }

	public int getMaxHealth() {
		return 20;
	}
	
	@Override
	protected boolean isValidLightLevel()
	{
	    return true; //don't care about the light level to spawn
	}
	
	public int getAttackStrength(){
		return 7;
	}
	
    protected Entity findPlayerToAttack()
    {
        double var1 = 8.0D;
        return this.worldObj.getClosestVulnerablePlayerToEntity(this, var1);
    }

	public EnumCreatureAttribute getCreatureAttribute(){
	    return EnumCreatureAttribute.ARTHROPOD;
	    }
	
	 protected String getLivingSound()
	    {
	        return "mob.silverfish.say";
	    }
	 
	    protected String getHurtSound()
	    {
	        return "mob.silverfish.hurt";
	    }
	    
	    protected String getDeathSound()
	    {
	        return "mob.silverfish.death";
	    }
	    
	    protected void playStepSound(int par1, int par2, int par3, int par4)
	    {
	        this.worldObj.playSoundAtEntity(this, "mob.silverfish.step", 0.15F, 1.0F);
	    }
	    
	  //  protected int getDropItemId()
	  //  {
	  //  	return 5002 ;
	  //  }
	    
	    protected void droprareDrop(int par1)
	    {
	    	switch(this.rand.nextInt(2))
	    	{
	    	case 0:
	    		this.dropItem(ItemsHelper.InfectedStone.itemID, 1);
	    	case 1:
	    		this.dropItem(ItemsHelper.InfectedGem.itemID, this.rand.nextInt(5) +1);
	    	}
	    }
	    
	    protected void dropFewItems(boolean par1, int par2)
	    {
	    	if(this.rand.nextInt(1) == 0)
	    	{
	    		this.dropItem(ItemsHelper.SlugSlime.itemID, 2);
	    	}
	    }
	    
	    public boolean attackEntityAsMob(Entity par1Entity)
	    {
	        if (super.attackEntityAsMob(par1Entity))
	        {
	            if (par1Entity instanceof EntityLiving)
	            {
	                byte var2 = 0;

	                if (this.worldObj.difficultySetting > 1)
	                {
	                    if (this.worldObj.difficultySetting == 2)
	                    {
	                        var2 = 7;
	                    }
	                    else if (this.worldObj.difficultySetting == 3)
	                    {
	                        var2 = 15;
	                    }
	                }

	                if (var2 > 0)
	                {
	                    ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, var2 * 20, 0));
	                }
	            }

	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }

}
