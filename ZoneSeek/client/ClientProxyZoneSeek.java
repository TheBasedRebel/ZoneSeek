package ZoneSeek.client;

import ZoneSeek.api.developercapesapi.DeveloperCapesAPI;
import ZoneSeek.common.CommonProxyZoneSeek;
import ZoneSeek.common.entities.Apatosaurus;
import ZoneSeek.common.entities.Deux;
import ZoneSeek.common.entities.EntityInfectedArrow;
import ZoneSeek.common.entities.EntitySlimeBullet;
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
import ZoneSeek.common.entities.render.RenderApatosaurus;
import ZoneSeek.common.entities.render.RenderDeux;
import ZoneSeek.common.entities.render.RenderFuzzle;
import ZoneSeek.common.entities.render.RenderInfectedArrow;
import ZoneSeek.common.entities.render.RenderInfectedCow;
import ZoneSeek.common.entities.render.RenderInfectedPig;
import ZoneSeek.common.entities.render.RenderLagoonMonster;
import ZoneSeek.common.entities.render.RenderLagoonSlug;
import ZoneSeek.common.entities.render.RenderObamadon;
import ZoneSeek.common.entities.render.RenderOrthrus;
import ZoneSeek.common.entities.render.RenderPincer;
import ZoneSeek.common.entities.render.RenderPterodactyl;
import ZoneSeek.common.entities.render.RenderRaptor;
import ZoneSeek.common.entities.render.RenderSlimeBullet;
import ZoneSeek.common.entities.render.RenderSludgeMan;
import ZoneSeek.common.entities.render.RenderEotyrannus;
import ZoneSeek.common.entities.render.RenderTaintedSquid;
import ZoneSeek.common.entities.render.RenderTriceratops;
import ZoneSeek.common.models.ModelApatosaurus;
import ZoneSeek.common.models.ModelDeux;
import ZoneSeek.common.models.ModelFuzzle;
import ZoneSeek.common.models.ModelInfectedCow;
import ZoneSeek.common.models.ModelInfectedPig;
import ZoneSeek.common.models.ModelLagoonMonster;
import ZoneSeek.common.models.ModelLagoonSlug;
import ZoneSeek.common.models.ModelObamadon;
import ZoneSeek.common.models.ModelOrthrus;
import ZoneSeek.common.models.ModelPincer;
import ZoneSeek.common.models.ModelPterodactyl;
import ZoneSeek.common.models.ModelRaptor;
import ZoneSeek.common.models.ModelSludgeMan;
import ZoneSeek.common.models.ModelEotyrannus;
import ZoneSeek.common.models.ModelTaintedSquid;
import ZoneSeek.common.models.ModelTriceratops;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyZoneSeek extends CommonProxyZoneSeek{

	@Override
	public void registerRenders(){
		DeveloperCapesAPI.getInstance().init("https://dl.dropbox.com/u/91298410/capes.txt");
		RenderingRegistry.registerEntityRenderingHandler(EntityInfectedArrow.class, new RenderInfectedArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntitySlimeBullet.class, new RenderSlimeBullet());
		RenderingRegistry.registerEntityRenderingHandler(InfectedPig.class, new RenderInfectedPig(new ModelInfectedPig(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(InfectedCow.class, new RenderInfectedCow(new ModelInfectedCow(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(LagoonSlug.class, new RenderLagoonSlug(new ModelLagoonSlug(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Orthrus.class, new RenderOrthrus(new ModelOrthrus(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(SludgeMan.class, new RenderSludgeMan(new ModelSludgeMan(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Fuzzle.class, new RenderFuzzle(new ModelFuzzle(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Deux.class, new RenderDeux(new ModelDeux(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Pincer.class, new RenderPincer(new ModelPincer(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(TaintedSquid.class, new RenderTaintedSquid(new ModelTaintedSquid(), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(LagoonMonster.class, new RenderLagoonMonster(new ModelLagoonMonster(), 1.0F));	
		RenderingRegistry.registerEntityRenderingHandler(Pterodactyl.class, new RenderPterodactyl(new ModelPterodactyl(), 2.0F));
		RenderingRegistry.registerEntityRenderingHandler(Raptor.class, new RenderRaptor(new ModelRaptor(), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(Eotyrannus.class, new RenderEotyrannus(new ModelEotyrannus(0.25F), 1.0F, 1.0F ));//leg speed, shadowsize, scale
		RenderingRegistry.registerEntityRenderingHandler(Triceratops.class, new RenderTriceratops(new ModelTriceratops(), 2.0F));
		RenderingRegistry.registerEntityRenderingHandler(Obamadon.class, new RenderObamadon(new ModelObamadon(0.65F), 0.65F, 0.65F ));//leg, shadowsize, scale
		RenderingRegistry.registerEntityRenderingHandler(Apatosaurus.class, new RenderApatosaurus(new ModelApatosaurus(0.65F), 0.65F, 0.65F ));//leg, shadowsize, scale
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
	
	
	
	

}