package ZoneSeek.event;


import ZoneSeek.common.ZoneSeek;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EventSounds {

	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		//try {
			event.manager.soundPoolSounds.addSound("rifle.wav", ZoneSeek.class.getResource("rifle.wav"));
			event.manager.soundPoolSounds.addSound("smg.wav", ZoneSeek.class.getResource("smg.wav"));
			event.manager.soundPoolSounds.addSound("shotgun.wav", ZoneSeek.class.getResource("shotgun.wav"));
		//} catch (Exception e) {
		//}// end catch
	}// end onSound
}// end EventSounds