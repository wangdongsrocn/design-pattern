package org.learn.template;

public class Football extends Game {
    @Override
    protected void endPlay() {
        System.out.println("football game end");
    }

    @Override
    protected void startPlay() {
        System.out.println("football game start");
    }

    @Override
    protected void init() {
        System.out.println("football game init");
    }
}
