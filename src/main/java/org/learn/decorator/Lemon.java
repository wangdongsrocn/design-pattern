package org.learn.decorator;

public class Lemon extends Condiment{
    private Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + lemon";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.5F;
    }
}
