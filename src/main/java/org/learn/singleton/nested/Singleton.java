package org.learn.singleton.nested;

public class Singleton {
    private Singleton() {
    }

    private static class Holder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }
}
