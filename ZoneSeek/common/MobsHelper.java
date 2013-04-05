package ZoneSeek.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import ZoneSeek.common.biomes.BiomesHelper;
import ZoneSeek.common.entities.Deux;
import ZoneSeek.common.entities.Fuzzle;
import ZoneSeek.common.entities.LagoonMonster;
import ZoneSeek.common.entities.Orthrus;
import ZoneSeek.common.entities.InfectedCow;
import ZoneSeek.common.entities.InfectedPig;
import ZoneSeek.common.entities.LagoonSlug;
import ZoneSeek.common.entities.Pincer;
import ZoneSeek.common.entities.SludgeMan;
import ZoneSeek.common.entities.TaintedSquid;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MobsHelper {
	
	public static void setupMobs(){
		//Mobs Hostile
		EntityRegistry.registerModEntity(InfectedPig.class, "InfectedPig", 1, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.InfectedPig.name", "Infected Pig");
		EntityRegistry.addSpawn(InfectedPig.class, 400, 1, 3, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(InfectedCow.class, "InfectedCow", 2, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.InfectedCow.name", "Infected Cow");
		EntityRegistry.addSpawn(InfectedCow.class, 400, 1, 3, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(LagoonSlug.class, "LagoonSlug", 3, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.LagoonSlug.name", "Lagoon Slug");
		EntityRegistry.addSpawn(LagoonSlug.class, 400, 1, 3, EnumCreatureType.creature, BiomesHelper.Lagoon);
		
		EntityRegistry.registerModEntity(SludgeMan.class, "SludgeMan", 5, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.SludgeMan.name", "Sludge Man");
		EntityRegistry.addSpawn(SludgeMan.class, 20, 1, 2, EnumCreatureType.monster, BiomesHelper.Sludge);
		
		EntityRegistry.registerModEntity(Fuzzle.class, "Fuzzle", 6, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Fuzzle.name", "Fuzzle");
		EntityRegistry.addSpawn(Fuzzle.class, 10, 1, 2, EnumCreatureType.monster, BiomesHelper.Sludge, BiomesHelper.Lagoon, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(Deux.class, "Deux", 7, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Deux.name", "Deux");
		
		EntityRegistry.registerModEntity(Pincer.class, "Pincer", 8, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Pincer.name", "Pincer");
		EntityRegistry.addSpawn(Pincer.class, 400, 1, 3, EnumCreatureType.creature, BiomesHelper.Sludge);
		
		EntityRegistry.registerModEntity(LagoonMonster.class, "LagoonMonster", 10, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.LagoonMonster.name", "Lagoon Monster");
		EntityRegistry.addSpawn(LagoonMonster.class, 400, 1, 2, EnumCreatureType.creature, BiomesHelper.Lagoon);
		
		//Mobs Peaceful
		EntityRegistry.registerModEntity(Orthrus.class, "Orthrus", 4, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Orthrus.name", "Orthrus");
		EntityRegistry.addSpawn(Orthrus.class, 200, 1, 2, EnumCreatureType.creature, BiomesHelper.Sludge);
		
		EntityRegistry.registerModEntity(TaintedSquid.class, "TaintedSquid", 9, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.TaintedSquid.name", "Tainted Squid");
		EntityRegistry.addSpawn(TaintedSquid.class, 15, 1, 2, EnumCreatureType.waterCreature, BiomesHelper.Lagoon);
		
		//Spawn Eggs	
		EntityEgg(InfectedPig.class, 0x25630C, 0xEB46E0);
		EntityEgg(InfectedCow.class, 0x25630C, 0x8C918E);
		EntityEgg(LagoonSlug.class, 0x0FFC4E, 0xDBD937);
		EntityEgg(Orthrus.class, 0x44B1C9, 0xF241D2);
		EntityEgg(SludgeMan.class, 0xE01BD3, 0x572B54);
		EntityEgg(Fuzzle.class, 0x2B3157, 0x36A9BA);
		EntityEgg(Deux.class, 0x339C37, 0xADC7AE);
		EntityEgg(Pincer.class, 0xB00E4F, 0x802BC2);
		EntityEgg(TaintedSquid.class, 0x1559B3, 0xC0D4ED);
		EntityEgg(LagoonMonster.class, 0x4AB025, 0xC2B040);
		

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
