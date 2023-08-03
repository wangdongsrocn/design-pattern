package org.learn.adapter;

public class WildCock implements Cock{
    @Override
    public void gobble() {
        System.out.println("cock gobble");
    }

    @Override
    public void fly() {
        System.out.println("cock fly");
    }
}
