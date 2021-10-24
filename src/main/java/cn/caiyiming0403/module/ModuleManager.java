package cn.caiyiming0403.module;

import cn.caiyiming0403.client;
import cn.caiyiming0403.event.Events;
import cn.caiyiming0403.event.Events.KeybordEvent;
import cn.caiyiming0403.module.module.movement.Sprint;
import com.google.common.eventbus.Subscribe;

import java.util.ArrayList;

public class ModuleManager {
    private final ArrayList<Module> modules;

    public ModuleManager() {
        modules = new ArrayList<>();
        client.INSTANCE.event.register(this);
    }

    public void load() {
        modules.add(new Sprint());
    }

    @Subscribe
    public void onKey(KeybordEvent event) {
        for (Module module : modules) {
            if (module.getKey() == event.getKey()) {
                module.enable();
            }
        }
    }


    public Setting getSettingByMame(Module module ,String name) {
        for (Module module1 : modules) {
            if (!module1.equals(module)) continue;
            for (Setting setting : module.getSetting()) {
                if (setting.getName().equalsIgnoreCase(name)) {
                    return setting;
                }
            }
        }
        return null;
    }
}
