package cn.caiyiming0403.module.module.movement;

import cn.caiyiming0403.client;
import cn.caiyiming0403.event.Events;
import cn.caiyiming0403.module.Module;
import cn.caiyiming0403.module.Settings.EnableSetting;
import cn.caiyiming0403.module.Type;
import com.google.common.eventbus.Subscribe;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Type.OTHER, Keyboard.KEY_LCONTROL);;
    }

    @Subscribe
    public void onUpdate(Events.UpdateEvent event) {
        Minecraft.getMinecraft().thePlayer.setSprinting(true);
    }
}
