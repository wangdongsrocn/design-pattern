package org.learn.template;


public abstract class Game {
    public void play() {
        init();
        startPlay();
        endPlay();
    }

    protected abstract void endPlay();

    protected abstract void startPlay();

    protected abstract void init();
}
