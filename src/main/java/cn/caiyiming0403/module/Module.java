package cn.caiyiming0403.module;

import cn.caiyiming0403.client;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private final String name;
    private final Type type;
    private int key;


    private final List<Setting> setting;

    private boolean enable;

    public String getName() {
        return name;
    }

    public Module(String name, Type type, int key) {
        this.name = name;
        this.type = type;
        this.key = key;
        setting = new ArrayList<>();
        enable = false;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int Key) {
        this.key = Key;
    }


    public boolean setEnable() {
        return enable;
    }

    public List<Setting> getSetting() {
        return setting;
    }

    public void enable() {
        this.enable = !this.enable;
        if (this.enable) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public Type getType() {
        return type;
    }

    protected void onEnable() {
        client.INSTANCE.event.register(this);
    }

    protected void onDisable() {
        client.INSTANCE.event.unregister(this);
    }
}
