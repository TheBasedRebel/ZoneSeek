package ZoneSeek.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import ZoneSeek.common.biomes.BiomesHelper;
import ZoneSeek.common.entities.Cerberus;
import ZoneSeek.common.entities.InfectedCow;
import ZoneSeek.common.entities.InfectedPig;
import ZoneSeek.common.entities.LagoonSlug;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MobsHelper {
	
	public static void setupMobs(){
		//Mobs Hostile
		EntityRegistry.registerModEntity(InfectedPig.class, "InfectedPig", 1, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.InfectedPig.name", "Infected Pig");
		EntityRegistry.addSpawn(InfectedPig.class, 500, 1, 3, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(InfectedCow.class, "InfectedCow", 2, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.InfectedCow.name", "Infected Cow");
		EntityRegistry.addSpawn(InfectedCow.class, 500, 1, 3, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(LagoonSlug.class, "LagoonSlug", 3, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.LagoonSlug.name", "Lagoon Slug");
		EntityRegistry.addSpawn(LagoonSlug.class, 500, 1, 3, EnumCreatureType.creature, BiomesHelper.Lagoon);
		
		//Mobs Peaceful
		EntityRegistry.registerModEntity(Cerberus.class, "Cerberus", 4, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Cerberus.name", "Cerberus");
		EntityRegistry.addSpawn(Cerberus.class, 200, 1, 2, EnumCreatureType.creature, BiomesHelper.Sludge);
		
		//Spawn Eggs	
		EntityEgg(InfectedPig.class, 0x25630C, 0xEB46E0);
		EntityEgg(InfectedCow.class, 0x25630C, 0x8C918E);
		EntityEgg(LagoonSlug.class, 0x0FFC4E, 0xDBD937);
		EntityEgg(Cerberus.class, 0x44B1C9, 0xF241D2);
		

	}
	
	public static int getUniqueID(){
		int EntityId = 300;
		do{
			EntityId++;
		} while(EntityList.getStringFromID(EntityId) != null);
		return EntityId;
	}
	
	public static void EntityEgg(Class<? extends Entity > entity, int primaryColor, int secondaryColor){
		int id = getUniqueID();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	


}
