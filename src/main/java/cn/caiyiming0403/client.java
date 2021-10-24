package cn.caiyiming0403;

import cn.caiyiming0403.module.ModuleManager;
import com.google.common.eventbus.EventBus;
import org.lwjgl.opengl.Display;

public enum client {

    INSTANCE;

    public static final String NAME = "Tree Client";

    public static final String VERSION = "B1.2.0.15";

    public ModuleManager module ;
    public EventBus event;

    public void run() {
        event = new EventBus();
        module = new ModuleManager();
        Display.setTitle(NAME + " | " + VERSION);
        module.load();
    }


    public void stop() {

    }

}
