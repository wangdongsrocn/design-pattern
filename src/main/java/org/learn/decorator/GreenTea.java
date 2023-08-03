package org.learn.decorator;

public class GreenTea extends Beverage{
    @Override
    public String getDescription() {
        return "green tea";
    }

    @Override
    public float cost() {
        return 3;
    }
}
