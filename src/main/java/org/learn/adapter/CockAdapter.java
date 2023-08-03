package org.learn.adapter;

public class CockAdapter implements Duck {
    private Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {
        this.cock.gobble();
    }

    @Override
    public void fly() {
        this.cock.fly();
    }
}
