package org.learn.proxy;

public class Food {
    private String name;

    public boolean getKeepWarm() {
        return keepWarm;
    }

    public void setKeepWarm(boolean keepWarm) {
        this.keepWarm = keepWarm;
    }

    private boolean keepWarm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
