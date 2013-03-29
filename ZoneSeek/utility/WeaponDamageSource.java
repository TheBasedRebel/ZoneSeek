package ZoneSeek.utility;


import ZoneSeek.common.entities.EntitySlimeBullet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class WeaponDamageSource extends DamageSource {

	// Constructor
	protected WeaponDamageSource(String par1Str) {
		super(par1Str);
	}// end WeaponDamageSource

	// returns damage of a bullet
	public static DamageSource causeBulletDamage(EntitySlimeBullet bulletEntity,
			Entity target) {
		return (new EntityDamageSourceIndirect("slime", bulletEntity, target))
				.setProjectile();
	}// end DamageSource

}// end WeaponDamageSource