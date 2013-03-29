package ZoneSeek.common;

import ZoneSeek.common.entities.EntityInfectedArrow;
import ZoneSeek.common.entities.EntitySlimeBullet;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ProjectilesHelper {
	
	public static void setupProjectiles(){
		
		EntityRegistry.registerModEntity(EntitySlimeBullet.class, "entityBullet", 20, ZoneSeek.instance, 80, 5,true);
		
		EntityRegistry.registerGlobalEntityID(EntityInfectedArrow.class, "Infected Arrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityInfectedArrow.class, "Infected Arrow", 21, ZoneSeek.instance, 128, 1, true);
		
	}

}
