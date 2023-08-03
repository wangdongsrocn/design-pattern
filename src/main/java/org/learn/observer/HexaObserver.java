package org.learn.observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("hex string: " + Integer.toHexString(this.subject.getState()));
    }
}
