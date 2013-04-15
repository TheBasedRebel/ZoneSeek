package ZoneSeek.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import ZoneSeek.common.biomes.BiomesHelper;
import ZoneSeek.common.entities.Apatosaurus;
import ZoneSeek.common.entities.Deux;
import ZoneSeek.common.entities.Fuzzle;
import ZoneSeek.common.entities.InfectedCow;
import ZoneSeek.common.entities.InfectedPig;
import ZoneSeek.common.entities.LagoonMonster;
import ZoneSeek.common.entities.LagoonSlug;
import ZoneSeek.common.entities.Obamadon;
import ZoneSeek.common.entities.Orthrus;
import ZoneSeek.common.entities.Pincer;
import ZoneSeek.common.entities.Pterodactyl;
import ZoneSeek.common.entities.Raptor;
import ZoneSeek.common.entities.SludgeMan;
import ZoneSeek.common.entities.Eotyrannus;
import ZoneSeek.common.entities.TaintedSquid;
import ZoneSeek.common.entities.Triceratops;
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
		
		//Prehistoric
		EntityRegistry.registerModEntity(Pterodactyl.class, "Pterodactyl", 11, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Pterodactyl.name", "Pterodactyl");
		//EntityRegistry.addSpawn(Pterodactyl.class, 400, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomesHelper.Prehistoric});
		
		EntityRegistry.registerModEntity(Raptor.class, "Raptor", 12, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Raptor.name", "Raptor");
		//EntityRegistry.addSpawn(Raptor.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomesHelper.Prehistoric});
		
		EntityRegistry.registerModEntity(Eotyrannus.class, "Eotyrannus", 13, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Eotyrannus.name", "Eotyrannus");
		//EntityRegistry.addSpawn(Eotyrannus.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomesHelper.Prehistoric});
		
		EntityRegistry.registerModEntity(Triceratops.class, "Triceratops", 14, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Triceratops.name", "Triceratops");
		//EntityRegistry.addSpawn(Triceratops.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomesHelper.Prehistoric});
		
		EntityRegistry.registerModEntity(Apatosaurus.class, "Apatosaurus", 15, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Apatosaurus.name", "Apatosaurus");
		//EntityRegistry.addSpawn(Apatosaurus.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomesHelper.Prehistoric});
		
		EntityRegistry.registerModEntity(Obamadon.class, "Obamadon", 16, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.ZoneSeek.Obamadon.name", "Obamadon");
		//EntityRegistry.addSpawn(Obamadon.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomesHelper.Prehistoric});
		
		
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
		
		EntityEgg(Pterodactyl.class, 0xC9BB1C, 0x4A493A);
		EntityEgg(Raptor.class, 0xD1A728, 0xE32F0B);
		EntityEgg(Eotyrannus.class, 0xE39309, 0x211515);
		EntityEgg(Triceratops.class, 0x47851E, 0xA36C1F);
		EntityEgg(Apatosaurus.class, 0x66481F, 0xCCA670);
		EntityEgg(Obamadon.class, 0x19329E, 0x28B4C7);

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
