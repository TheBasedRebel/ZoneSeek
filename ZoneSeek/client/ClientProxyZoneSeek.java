package ZoneSeek.client;

import ZoneSeek.api.developercapesapi.DeveloperCapesAPI;
import ZoneSeek.common.CommonProxyZoneSeek;
import ZoneSeek.common.entities.Deux;
import ZoneSeek.common.entities.EntitySlimeBullet;
import ZoneSeek.common.entities.Fuzzle;
import ZoneSeek.common.entities.LagoonMonster;
import ZoneSeek.common.entities.Orthrus;
import ZoneSeek.common.entities.EntityInfectedArrow;
import ZoneSeek.common.entities.InfectedCow;
import ZoneSeek.common.entities.InfectedPig;
import ZoneSeek.common.entities.LagoonSlug;
import ZoneSeek.common.entities.Pincer;
import ZoneSeek.common.entities.SludgeMan;
import ZoneSeek.common.entities.TaintedSquid;
import ZoneSeek.common.entities.render.RenderDeux;
import ZoneSeek.common.entities.render.RenderFuzzle;
import ZoneSeek.common.entities.render.RenderLagoonMonster;
import ZoneSeek.common.entities.render.RenderOrthrus;
import ZoneSeek.common.entities.render.RenderInfectedArrow;
import ZoneSeek.common.entities.render.RenderInfectedCow;
import ZoneSeek.common.entities.render.RenderInfectedPig;
import ZoneSeek.common.entities.render.RenderLagoonSlug;
import ZoneSeek.common.entities.render.RenderPincer;
import ZoneSeek.common.entities.render.RenderSlimeBullet;
import ZoneSeek.common.entities.render.RenderSludgeMan;
import ZoneSeek.common.entities.render.RenderTaintedSquid;
import ZoneSeek.common.models.ModelDeux;
import ZoneSeek.common.models.ModelFuzzle;
import ZoneSeek.common.models.ModelLagoonMonster;
import ZoneSeek.common.models.ModelOrthrus;
import ZoneSeek.common.models.ModelInfectedCow;
import ZoneSeek.common.models.ModelInfectedPig;
import ZoneSeek.common.models.ModelLagoonSlug;
import ZoneSeek.common.models.ModelPincer;
import ZoneSeek.common.models.ModelSlimeBullet;
import ZoneSeek.common.models.ModelSludgeMan;
import ZoneSeek.common.models.ModelTaintedSquid;
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
		RenderingRegistry.registerEntityRenderingHandler(TaintedSquid.class, new RenderTaintedSquid(new ModelTaintedSquid(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(LagoonMonster.class, new RenderLagoonMonster(new ModelLagoonMonster(), 0.5F));
		
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
	
	
	
	

}