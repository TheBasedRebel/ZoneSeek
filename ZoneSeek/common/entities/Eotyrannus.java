package ZoneSeek.common.entities;


import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class Eotyrannus extends EntityMob {


	public Eotyrannus(World par1World)
	{
		super(par1World);

		this.texture = "/mods/zoneseek/textures/models/Eotyrannus.png";
		this.setSize(1.5F, 2.8F);
		this.moveSpeed = 0.25F;
		this.fireResistance = 100;
		this.health = 40;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(8, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.tasks.addTask(0, new EntityAISwimming(this));
		//this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityMob.class, 8.0F, 0.3F, 0.4F));
		//this.tasks.addTask(4, new EntityAIPanic(this, this.moveSpeed*1.5F));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
		this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(7, new EntityAILookIdle(this)); 
		this.targetTasks.addTask(9, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	}

	protected void entityInit()
	{
		super.entityInit();  
	}
	
	public int getAttackStrength(){
		return 70;
	}
	
	@Override
	protected boolean isValidLightLevel()
	{
	    return true; //don't care about the light level to spawn
	}
	
    protected Entity findPlayerToAttack()
    {
        double var1 = 8.0D;
        return this.worldObj.getClosestVulnerablePlayerToEntity(this, var1);
    }


	private void settexture()
	{
		this.texture = "/mods/zoneseek/textures/models/Eotyrannus.png";
	}

	/**
	 * Returns the texture's file path as a String.
	 */
	public String getTexture()
	{
		this.settexture();
		return this.texture;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled()
	{
		return true;
	}


	public boolean canBreatheUnderwater()
	{
		return false;
	}

	public int getMaxHealth()
	{
		return 90;
	}

	/**
	 * Determines if an entity can be despawned, used on idle far away UNIMPORTANT entities
	 */
	protected boolean canDespawn()
	{
		return true;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return "";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "";
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.4F;
	}   

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected int getDropItemId()
	{
		return Item.beefRaw.itemID;
	}

	/**
	 * Drop 0-15 items of this living's type
	 */
	protected void dropFewItems(boolean par1, int par2)
	{
		int var3 = 0;
		var3 = this.rand.nextInt(5);
		var3 += 2;
		for(int var4 = 0; var4 < var3; ++var4)
		{
			this.dropItem(Item.beefRaw.itemID, 1);
		}

	}

}



