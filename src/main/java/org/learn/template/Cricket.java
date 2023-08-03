package org.learn.template;

public class Cricket extends Game {
    @Override
    protected void endPlay() {
        System.out.println("cricket game end");
    }

    @Override
    protected void startPlay() {
        System.out.println("cricket game start");
    }

    @Override
    protected void init() {
        System.out.println("cricket game init");
    }
}
