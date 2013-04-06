package ZoneSeek.common;

import ZoneSeek.common.worldgen.Prehistoric.PrehistoricWorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionHelper {
	
	public static void setupDimensions() {
		DimensionManager.registerProviderType(IDsHelper.PrehistoricAgeID, PrehistoricWorldProvider.class, true);
		DimensionManager.registerDimension(IDsHelper.PrehistoricAgeID, IDsHelper.PrehistoricAgeID);
		
	}

}
