package cn.caiyiming0403.event;

public class Events {
    public static class KeybordEvent {
        private final int Key;

        public KeybordEvent(int key) {
            this.Key = key;
        }

        public int getKey() {
            return Key;
        }
    }


    public static class UpdateEvent {

    }
}
