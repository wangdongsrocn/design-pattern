package org.learn.decorator;

public class Mango extends Condiment {
    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + mango";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.7F;
    }
}
