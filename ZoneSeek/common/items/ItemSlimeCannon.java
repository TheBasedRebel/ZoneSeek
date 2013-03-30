package ZoneSeek.common.items;


import ZoneSeek.common.entities.EntitySlimeBullet;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemSlimeCannon extends Item {

	private int cooldown;

	// constructor
	public ItemSlimeCannon(int id) {
		super(id);
		this.maxStackSize = 1;
		this.setFull3D();
		this.setUnlocalizedName("Rifle");
		this.cooldown = 0;
		// damage is melee
		this.setMaxDamage(126);
		setCreativeTab(CreativeTabs.tabCombat);
	}// end GunBase

	@SideOnly(Side.CLIENT)
	@Override
	public void updateIcons(IconRegister iconRegister) {
		iconIndex = iconRegister.registerIcon("zoneseek:SlimeCannon");
	}// end func_94581_a

	public int getMaxItemUseDuration() {
		return 1800;
	}// end getMaxItemUseDuration

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entityPlayer) {
		if (entityPlayer.inventory.hasItem(ItemsHelper.SlugSlime.itemID) || entityPlayer.capabilities.isCreativeMode) {
			if (cooldown <= 0) {
				if (!world.isRemote) { 
					entityPlayer.setItemInUse(stack, getMaxItemUseDuration());
					EntitySlimeBullet bulletEntity = new EntitySlimeBullet(world, entityPlayer, 2.0F, 0.2F);
					bulletEntity.setDamage(2.0);
					//world.playSoundAtEntity(entityPlayer, "rifle", 1.0F, 1.0F);
					world.spawnEntityInWorld(bulletEntity);
					cooldown = 10;
				}// end if
				entityPlayer.inventory.consumeInventoryItem(ItemsHelper.SlugSlime.itemID);
			}// end if
		}// end if
		return stack;
	}// end onItemRightClick

	@Override
	public void onUpdate(ItemStack stack, World world, Entity player, int par4, boolean par5) {
		super.onUpdate(stack, world, player, par4, par5);
		if (!world.isRemote) {
			if (getCooldown() > 0) {
				setCooldown(getCooldown() - 1);
			}// end if
		}// end if
	}// end onUpdate

	public void setCooldown(int n) {
		this.cooldown = n;
	}// end setCooldown()

	public int getCooldown() {
		return this.cooldown;
	}// end getCooldown

	// what animation to use
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.bow;
	}// end getItemUseACtion

}// end gunBase