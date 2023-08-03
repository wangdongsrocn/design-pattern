package org.learn.decorator;

import java.math.BigDecimal;

public abstract class Beverage {
    public abstract String getDescription();
    public abstract float cost();

    @Override
    public String toString() {
        return "beverage class";
    }
}
