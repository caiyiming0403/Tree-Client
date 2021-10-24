package cn.caiyiming0403.module.Settings;

import cn.caiyiming0403.module.Setting;

public class EnableSetting extends Setting {
    private boolean enable;

    public EnableSetting(String name, boolean enable) {
        super(name);
        this.enable = enable;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }


}
