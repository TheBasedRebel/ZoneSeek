package ZoneSeek.common.entities;

import java.util.List;

import ZoneSeek.utility.WeaponDamageSource;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet70GameEvent;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntitySlimeBullet extends Entity implements IProjectile {

	private int xTile = -1;
	private int yTile = -1;
	private int zTile = -1;
	private int inTile = 0;
	private int inData = 0;
	private boolean inGround = false;
	public int canBePickedUp = 0;
	public int arrowShake = 0;
	public Entity shootingEntity;
	private int ticksInGround;
	private int ticksInAir = 0;
	private double damage = 1.0D;
	private int knockbackStrength;
	private float accuracy = 1.0F;

	public EntitySlimeBullet(World world) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.setSize(0.1F, 0.1F);
	}// end Entity Bullet

	// construct at coordinates
	public EntitySlimeBullet(World world, double x, double y, double z) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.setSize(0.1F, 0.1F);
		this.setPosition(x, y, z);
		this.yOffset = 0.0F;
	} // end EntityBullet

	// idk constructor
	public EntitySlimeBullet(World world, EntityLiving player, EntityLiving target, float par4, float par5) {
		super(world);
		this.setSize(0.1F, 0.1F);
		this.renderDistanceWeight = 10.0D;
		this.shootingEntity = player;
	}// end EntityBullet

	// PRIMARY CONSTRUCTOR
	public EntitySlimeBullet(World world, EntityLiving player, float velocity, float acc) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.shootingEntity = player;
		this.accuracy = acc;

		if (player instanceof EntityPlayer) {
			this.canBePickedUp = 1;
		}// end if

		this.setSize(0.1F, 0.1F);
		this.setLocationAndAngles(player.posX, player.posY + (double) player.getEyeHeight(), player.posZ, player.rotationYaw, player.rotationPitch);
		this.posX -= (double) (MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
		this.posY -= 0.10000000149011612D;
		this.posZ -= (double) (MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.yOffset = 0.0F;
		this.motionX = (double) (-MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI));
		this.motionZ = (double) (MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI));
		this.motionY = (double) (-MathHelper.sin(this.rotationPitch / 180.0F * (float) Math.PI));
		this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, velocity, accuracy);
	}// end EntityBullet

	@Override
	public void setThrowableHeading(double x, double y, double z, float velocity, float accuracy) {
		x += this.rand.nextGaussian() * (double) (this.rand.nextBoolean() ? -1 : 1) * 0.007499999832361937D * (double) accuracy;
		y += this.rand.nextGaussian() * (double) (this.rand.nextBoolean() ? -1 : 1) * 0.007499999832361937D * (double) accuracy;
		z += this.rand.nextGaussian() * (double) (this.rand.nextBoolean() ? -1 : 1) * 0.007499999832361937D * (double) accuracy;
		x *= (double) velocity;
		y *= (double) velocity;
		z *= (double) velocity;
		this.motionX = x;
		this.motionY = y;
		this.motionZ = z;
	}// end setThrowableHeading

	@Override
	@SideOnly(Side.CLIENT)
	public void setPositionAndRotation2(double par1, double par3, double par5, float par7, float par8, int par9) {
		this.setPosition(par1, par3, par5);
		this.setRotation(par7, par8);
	}// end setPositionAndRotation2

	@Override
	public void setVelocity(double x, double y, double z) {
		this.motionX = x;
		this.motionY = y;
		this.motionZ = z;
		this.ticksInGround = 0;
	}// end setVelocity

	@Override
	public void onUpdate() {
		super.onUpdate();
		int hitBlockId = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
		// if hit block set inGround true
		if (hitBlockId > 0) {
			Block.blocksList[hitBlockId].setBlockBoundsBasedOnState(this.worldObj, this.xTile, this.yTile, this.zTile);
			AxisAlignedBB axisBlockId = Block.blocksList[hitBlockId].getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);
			if (axisBlockId != null && axisBlockId.isVecInside(this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ))) {
				this.inGround = true;
			}// end if(axisBlockId != null...
		}// end if(hitBlockId > 0)
		if (this.arrowShake > 0) {
			--this.arrowShake;
		}// end if(this.arrowShake > 0)
			// if in ground die
		if (this.inGround) {
			this.setDead();
		} else {
			++this.ticksInAir;
			Vec3 vec17 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
			Vec3 var3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			MovingObjectPosition var4 = this.worldObj.rayTraceBlocks_do_do(vec17, var3, false, true);
			vec17 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
			var3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			if (var4 != null) {
				var3 = this.worldObj.getWorldVec3Pool().getVecFromPool(var4.hitVec.xCoord, var4.hitVec.yCoord, var4.hitVec.zCoord);
			}// end if
			Entity entity5 = null;
			List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
			double var7 = 0.0D;
			int var9;
			float var11;
			for (var9 = 0; var9 < var6.size(); ++var9) {
				Entity entity10 = (Entity) var6.get(var9);
				if (entity10.canBeCollidedWith() && (entity10 != this.shootingEntity || this.ticksInAir >= 5)) {
					var11 = 0.3F;
					AxisAlignedBB var12 = entity10.boundingBox.expand((double) var11, (double) var11, (double) var11);
					MovingObjectPosition var13 = var12.calculateIntercept(vec17, var3);
					if (var13 != null) {
						double var14 = vec17.distanceTo(var13.hitVec);
						if (var14 < var7 || var7 == 0.0D) {
							entity5 = entity10;
							var7 = var14;
						}// end if(var14 < var7 || var7 == 0.0D)
					}// end if(var13 != null)
				}// end if(var10.canBeCollidedWith()...
			}// end for
			if (entity5 != null) {
				var4 = new MovingObjectPosition(entity5);
			}// end if
			float var20;
			float var26;
			if (var4 != null) {
				if (var4.entityHit != null) {
					var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
					int var23 = MathHelper.ceiling_double_int((double) var20 * this.damage);
					if (this.getIsCritical()) {
						var23 += this.rand.nextInt(var23 / 2 + 2);
					}// end if
					DamageSource dmgSrc = null;
					if (this.shootingEntity == null) {
						dmgSrc = WeaponDamageSource.causeBulletDamage(this, this);
					} else {
						dmgSrc = WeaponDamageSource.causeBulletDamage(this, this.shootingEntity);
					}// end else
					if (var4.entityHit.attackEntityFrom(dmgSrc, var23)) {
						 if (var4.entityHit instanceof EntityLiving){
						//if (var4.entityHit instanceof EntityLiving || var4.entityHit instanceof EntityPlayer) {
							EntityLiving entity24 = (EntityLiving) var4.entityHit;
							// render arrows in hit entity
							if (!this.worldObj.isRemote) {
								entity24.setArrowCountInEntity(entity24.getArrowCountInEntity() + 1);
							}// end if

							if (this.knockbackStrength > 0) {
								var26 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);

								if (var26 > 0.0F) {
									var4.entityHit.addVelocity(this.motionX * (double) this.knockbackStrength * 0.6000000238418579D / (double) var26, 0.1D, this.motionZ * (double) this.knockbackStrength * 0.6000000238418579D / (double) var26);
								}// end if(var26 > 0.0F)
							}// end if(!this.knockbackStrength > 0)

							if (this.shootingEntity != null) {
								EnchantmentThorns.func_92096_a(this.shootingEntity, entity24, this.rand);
							}// end if

							// if hit another player send packet to player
							if (this.shootingEntity != null && var4.entityHit != this.shootingEntity && var4.entityHit instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP) {
								((EntityPlayerMP) this.shootingEntity).playerNetServerHandler.sendPacketToPlayer(new Packet70GameEvent(6, 0));
							}// end if
						}// end if(var4

						this.playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

						if (!(var4.entityHit instanceof EntityEnderman)) {
							this.setDead();
						}// end if
					}// end if
				} else {
					this.xTile = var4.blockX;
					this.yTile = var4.blockY;
					this.zTile = var4.blockZ;
					this.inTile = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
					this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
					this.motionX = (double) ((float) (var4.hitVec.xCoord - this.posX));
					this.motionY = (double) ((float) (var4.hitVec.yCoord - this.posY));
					this.motionZ = (double) ((float) (var4.hitVec.zCoord - this.posZ));
					var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
					this.posX -= this.motionX / (double) var20 * 0.05000000074505806D;
					this.posY -= this.motionY / (double) var20 * 0.05000000074505806D;
					this.posZ -= this.motionZ / (double) var20 * 0.05000000074505806D;
					this.playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
					this.inGround = true;
					this.arrowShake = 7;
					this.setIsCritical(false);

					if (this.inTile != 0) {
						Block.blocksList[this.inTile].onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, this);
					}// end if
				}// end else
			}// end if(var4 != null)

			// if critical show partical stream
			if (this.getIsCritical()) {
				for (var9 = 0; var9 < 4; ++var9) {
					this.worldObj.spawnParticle("crit", this.posX + this.motionX * (double) var9 / 4.0D, this.posY + this.motionY * (double) var9 / 4.0D, this.posZ + this.motionZ * (double) var9 / 4.0D, -this.motionX, -this.motionY + 0.2D, -this.motionZ);
				}// end for
			}// end if

			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;
			var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
			float var22 = 0.99F;
			var11 = 0.05F;

			// if in water show particles
			if (this.isInWater()) {
				for (int var25 = 0; var25 < 4; ++var25) {
					var26 = 0.25F;
					this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double) var26, this.posY - this.motionY * (double) var26, this.posZ - this.motionZ * (double) var26, this.motionX, this.motionY, this.motionZ);
				}// end for
				var22 = 0.8F;
			}// end if

			this.motionX *= (double) var22;
			this.motionY *= (double) var22;
			this.motionZ *= (double) var22;
			this.motionY -= (double) var11;
			this.setPosition(this.posX, this.posY, this.posZ);
			this.doBlockCollisions();
		}// end else
	}// end onUpdate

	// initialize
	@Override
	protected void entityInit() {
		this.dataWatcher.addObject(16, Byte.valueOf((byte) 0));
	} // end entityInit

	// read entity
	@Override
	protected void readEntityFromNBT(NBTTagCompound tag) {
		this.xTile = tag.getShort("xTile");
		this.yTile = tag.getShort("yTile");
		this.zTile = tag.getShort("zTile");
		this.inTile = tag.getByte("inTile") & 255;
		this.inData = tag.getByte("inData") & 255;
		this.arrowShake = tag.getByte("shake") & 255;
		this.inGround = tag.getByte("inGround") == 1;
		if (tag.hasKey("damage")) {
			this.damage = tag.getDouble("damage");
		}// end if
		if (tag.hasKey("pickup")) {
			this.canBePickedUp = tag.getByte("pickup");
		} else if (tag.hasKey("player")) {
			this.canBePickedUp = tag.getBoolean("player") ? 1 : 0;
		}// end if
	}// end readEntitityToNBT

	// write entity
	@Override
	protected void writeEntityToNBT(NBTTagCompound tag) {
		tag.setShort("xTile", (short) this.xTile);
		tag.setShort("yTile", (short) this.yTile);
		tag.setShort("zTile", (short) this.zTile);
		tag.setByte("inTile", (byte) this.inTile);
		tag.setByte("inData", (byte) this.inData);
		tag.setByte("shake", (byte) this.arrowShake);
		tag.setByte("inGround", (byte) (this.inGround ? 1 : 0));
		tag.setByte("pickup", (byte) this.canBePickedUp);
		tag.setDouble("damage", this.damage);
	}// end writeEntityToNBT

	// default used for picking up item
	@Override
	public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
	}// end onCollidedWithPlayer

	// return true if prevents blocking from trampling crops
	@Override
	protected boolean canTriggerWalking() {
		return false;
	}// end canTriggerWalking

	@SideOnly(Side.CLIENT)
	@Override
	public float getShadowSize() {
		return 0.0F;
	}// end getShadowSize

	public void setDamage(double dmg) {
		this.damage = dmg;
	}// end setDamage

	public double getDamage() {
		return this.damage;
	}// end getDamage

	public void setKnockbackStrength(int par1) {
		this.knockbackStrength = par1;
	}// end setKnockbackStrength

	@Override
	public boolean canAttackWithItem() {
		return false;
	}// end canAttackWithItem

	public void setIsCritical(boolean par1) {
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);
		if (par1) {
			this.dataWatcher.updateObject(16, Byte.valueOf((byte) (var2 | 1)));
		} else {
			this.dataWatcher.updateObject(16, Byte.valueOf((byte) (var2 & -2)));
		}// end else
	}// end SetIsCritical

	public boolean getIsCritical() {
		byte var1 = this.dataWatcher.getWatchableObjectByte(16);
		return (var1 & 1) != 0;
	}// end getIsCritical
}// end EntityBullet