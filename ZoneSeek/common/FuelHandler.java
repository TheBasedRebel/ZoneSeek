package ZoneSeek.common;


import ZoneSeek.common.items.ItemsHelper;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == ItemsHelper.AnthraciteCoal.itemID){
			return 3000;
		}else if(fuel.itemID == ItemsHelper.AnthraciteCoal.itemID){
			return 3000;
		}else if(fuel.itemID == ItemsHelper.AnthraciteCoal.itemID){
			return 3000;
		}
		return 0;
	}
}