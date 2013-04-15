package ZoneSeek.common.entities;


import ZoneSeek.common.blocks.BlocksHelper;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
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


public class Apatosaurus extends EntityTameable {

	private int force_sync = 50; //Force server and client to sync health!
	
	public Apatosaurus(World par1World)
    {
        super(par1World);
       
        this.texture = "/mods/zoneseek/textures/models/Apatosaurus.png";
        this.setSize(0.5F, 1.2F);
        this.moveSpeed = 0.2F;
        this.fireResistance = 100;
        this.getNavigator().setAvoidsWater(true);
        this.setSitting(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIFollowOwner(this, this.moveSpeed*2, 10.0F, 2.0F));
        this.tasks.addTask(2, new EntityAITempt(this, 0.25F, Item.appleRed.itemID, false));
        this.tasks.addTask(3, new EntityAIPanic(this, 0.5F));
        this.tasks.addTask(2, new EntityAIAvoidEntity(this, Eotyrannus.class, 8.0F, 0.3F, 0.4F));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(5, new EntityAIWander(this, 0.20F));
        this.tasks.addTask(6, new EntityAILookIdle(this));           
        this.tasks.addTask(7, new EntityAIMoveIndoors(this));
    }
	
	protected void entityInit()
    {
        super.entityInit();  
		this.dataWatcher.addObject(18, new Integer(this.getMaxHealth()));
		this.health = this.getMaxHealth();
		this.force_sync = 50; //Force server and client to sync health!
		this.setSitting(false);
    }
	
    @Override
    public boolean getCanSpawnHere()
    {
        return true;
    }

	 /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("ApatosaurusHealth",this.dataWatcher.getWatchableObjectInt(18));
        if (this.getOwnerName() == null)
        {
            par1NBTTagCompound.setString("Owner", "");
        }
        else
        {
            par1NBTTagCompound.setString("Owner", this.getOwnerName());
        } 
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.health = par1NBTTagCompound.getInteger("ApatosaurusHealth");
        this.dataWatcher.updateObject(18, Integer.valueOf(this.health));
        String var2 = par1NBTTagCompound.getString("Owner");

        if (var2.length() > 0)
        {
            this.setOwner(var2);
            this.setTamed(true);
            //System.out.printf("Restored Owner %s has type %d and id %d, %s\n", this.getOwnerName(), this.getTameSkin(), this.entityId, this.worldObj.isRemote?"is Remote":"is NOT remote");
        }
    }
    
    private int closest = 99999;
    private int tx = 0, ty = 0, tz = 0;
   
    private boolean scan_it(int x, int y, int z, int dx, int dy, int dz){
    int found = 0;
    int i, j, bid, d;
 
    //Fixed x, scan two sides of 3d rectangle
    	for(i=-dy;i<=dy;i++){
    		for(j=-dz;j<=dz;j++){
				bid = this.worldObj.getBlockId(x+dx, y+i, z+j);
				if(bid == BlocksHelper.PrehistoricLeaf.blockID || bid == Block.vine.blockID || bid == BlocksHelper.PrehistoricTallGrass.blockID || bid == Block.cactus.blockID){
					d = dx*dx + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+dx; ty = y+i; tz = z+j;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x-dx, y+i, z+j);
				if(bid == BlocksHelper.PrehistoricLeaf.blockID || bid == Block.vine.blockID || bid == BlocksHelper.PrehistoricTallGrass.blockID || bid == Block.cactus.blockID){
					d = dx*dx + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x-dx; ty = y+i; tz = z+j;
						found++;
					}
				} 			
    		}
    	}
   //Fixed y, scan two sides of 3d rectangle
    	for(i=-dx;i<=dx;i++){
    		for(j=-dz;j<=dz;j++){
				bid = this.worldObj.getBlockId(x+i, y+dy, z+j);
				if(bid == BlocksHelper.PrehistoricLeaf.blockID || bid == Block.vine.blockID || bid == BlocksHelper.PrehistoricTallGrass.blockID || bid == Block.cactus.blockID){
					d = dy*dy + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y+dy; tz = z+j;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x+i, y-dy, z+j);
				if(bid == BlocksHelper.PrehistoricLeaf.blockID || bid == Block.vine.blockID || bid == BlocksHelper.PrehistoricTallGrass.blockID || bid == Block.cactus.blockID){
					d = dy*dy + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y-dy; tz = z+j;
						found++;
					}
				} 			
    		}
    	}    	
    	//Fixed z, scan two sides of 3d rectangle
    	for(i=-dx;i<=dx;i++){
    		for(j=-dy;j<=dy;j++){
				bid = this.worldObj.getBlockId(x+i, y+j, z+dz);
				if(bid == BlocksHelper.PrehistoricLeaf.blockID || bid == Block.vine.blockID || bid == BlocksHelper.PrehistoricTallGrass.blockID || bid == Block.cactus.blockID){
					d = dz*dz + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y+i; tz = z+dz;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x+i, y+j, z-dz);
				if(bid == BlocksHelper.PrehistoricLeaf.blockID || bid == Block.vine.blockID || bid == BlocksHelper.PrehistoricTallGrass.blockID || bid == Block.cactus.blockID){
					d = dz*dz + j*j + i*i;
					if(d < closest){
						closest = d;
						tx = x+i; ty = y+i; tz = z-dz;
						found++;
					}
				} 			
    		}
    	}    	
    
    	if(found != 0)return true;
    	return false;
    }
    
    /**
     * main AI tick function
     */
    protected void updateAITick()
    {
    	int i, j;
    	
    	if(this.isSitting() == false){
    		if((this.worldObj.rand.nextInt(20) == 0 && this.getApatosaurusHealth() < this.getMaxHealth()) || this.worldObj.rand.nextInt(200) == 0)
    		{
    			//System.out.printf("Searching for food %d\n",this.getApatosaurusHealth()); 
    			//Very efficient search from near to far.
    			closest = 99999;
    			tx = ty = tz = 0;
    			for(i=1;i<11;i++){
    				j = i;
    				if(j > 2)j = 2; //Limit y range
    				if(scan_it((int)this.posX, (int)this.posY+1, (int)this.posZ, i, j, i) == true)break;
    				if(i>=6)i++; //skip to reduce long-range intensive processing...
    			}

    			if(closest < 99999){
    				//System.out.printf("Food found at %d distance\n", closest);
    				this.getNavigator().tryMoveToXYZ(tx,  ty,  tz,  this.moveSpeed);
    				if(closest < (4+4+4)){
    					//System.out.printf("Food eaten\n");
    					this.worldObj.setBlock(tx,  ty,  tz,  0);
    					this.heal(1);
    					this.playSound("random.burp", 1.0F, this.worldObj.rand.nextFloat()*0.2F + 0.9F );
    				}
    			}		
    		}
    	}
 
    }
    
    private void settexture()
    {
    	this.texture = "/mods/zoneseek/textures/models/Apatosaurus.png";
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
        return this.isTamed() ? 20 : 10;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        
        super.onLivingUpdate();
        
        //Force Client to synch with server (or vice-versa).
        //One side gets from this.health and passes through the watchable object to the other.
        //the other side gets from the watchable object and sets this.health.
        //YES. There ARE two copies of the entity. One in the client. One in the server.
        //The trick is to keep them synchronized at all times.
        //Some things work correctly, automagically.
        //Some don't!
        this.force_sync--;
        if(this.force_sync <= 0){
        	this.force_sync = 50; //Not too often...  
        	if (!this.worldObj.isRemote)//is CLIENT
        	{
        		this.dataWatcher.updateObject(18, Integer.valueOf(this.getHealth()));
        		this.setSitting(this.isSitting());
        		
        	}else{
        		this.health = this.getApatosaurusHealth();
        	}
        	//Use health as a clue that we are tamed, which doesn't always seem to sync properly either.
        	if(this.health > 15){
    			this.setTamed(true);
    		}
        }
    }
	protected boolean isValidLightLevel()
	{
	    return true; //don't care about the light level to spawn
	}
    
    /**
     * Return health points from the watchable object
     */
    public int getApatosaurusHealth() {
        return this.dataWatcher.getWatchableObjectInt(18);
    }
    
    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
    	ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
    	//System.out.printf("Apatosaurus %d has owner %s, skin %d tame: %s, as %s\n", this.entityId, getOwnerName(), this.which_girl, this.isTamed()?"true":"false",this.worldObj.isRemote ? "isRemote" : "isNOTRemote");

    	if (var2 != null)
    	{
    		if(var2.stackSize <= 0)
    		{
    			par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
    			var2 = null;
    		} 
    	}
    	
    	if (var2 != null && var2.itemID == Item.appleRed.itemID && par1EntityPlayer.getDistanceSqToEntity(this) < 16.0D)
    	{
    		if(!this.isTamed())
    		{
    			if (!this.worldObj.isRemote)
    			{
    				if (this.rand.nextInt(2) == 0)
    				{
    					this.setTamed(true);
    					this.setOwner(par1EntityPlayer.username);
    					this.playTameEffect(true);
    					this.worldObj.setEntityState(this, (byte)7);
    					//System.out.printf("Apatosaurus tamed by %s has type %d and id %d\n", par1EntityPlayer.username, this.which_girl, this.entityId);
    				}
    				else
    				{
    					this.playTameEffect(false);
    					this.worldObj.setEntityState(this, (byte)6);
    				}
    			}
    			
    		}else{ 			
    			if(par1EntityPlayer.username.equals(getOwnerName()))
    			{
    				if(this.worldObj.isRemote){
    					this.playTameEffect(true);
    					this.worldObj.setEntityState(this, (byte)7);
    				}
    				//Bring her up to full health
    				if(this.getMaxHealth() > this.getHealth() ){
    					this.heal(this.getMaxHealth() - this.getHealth());
    					this.dataWatcher.updateObject(18, Integer.valueOf(this.getHealth()));
    				}
    			}
    		}
    		if (!par1EntityPlayer.capabilities.isCreativeMode)
    		{
    			--var2.stackSize;
    			if (var2.stackSize <= 0)
    			{
    				par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
    			}
    		}
    		return true;
    	 
    	}else if (this.isTamed() && var2 != null && par1EntityPlayer.username.equals(getOwnerName()))
    	{							
    				if(this.isSitting() == false){
    					this.setSitting(true);
    				}else{
    					this.setSitting(false);
    				}					
    		return true;
    	}
    		
    	return super.interact(par1EntityPlayer);
    }

    /**
     * Checks if the parameter is an wheat item.
     */
    public boolean isWheat(ItemStack par1ItemStack)
    {
        return par1ItemStack != null && par1ItemStack.itemID == Item.appleRed.itemID;
    }

    /**
     * Determines if an entity can be despawned, used on idle far away UNIMPORTANT entities
     */
    protected boolean canDespawn()
    {
    	return false;
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
    	if(this.isSitting())
    	{
    		return "";
    	}
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
        return Block.plantRed.blockID;
    }

    /**
     * Drop 0-15 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	int var3 = 0;
    	//Untamed don't drop roses
    	if(this.isTamed()){
    		//Drop a few roses
    		var3 = this.rand.nextInt(5);
    		var3 += 2;
    		for(int var4 = 0; var4 < var3; ++var4)
    		{
    			this.dropItem(Block.plantRed.blockID, 1);
    		}
    	}
        
    }

	 /**
     * Gets the pitch of living sounds in living entities.
     */
	//A little less variation so we stay in normal human range!
    protected float getSoundPitch()
    {
        return this.isChild() ? (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F + 1.5F : (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1F + 1.0F;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		// Auto-generated method stub
		return null; //Too young for babies!
	}

    
}

	

