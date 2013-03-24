package ZoneSeek.common.items;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBookOfInfecteion extends Item{

	public ItemBookOfInfecteion(int id) {
		super(id);
	}
	
	@Override
	public void updateIcons(IconRegister par1IconRegister)
	{
		this.iconIndex = par1IconRegister.registerIcon("zoneseek:BookOfInfection");
	}

}