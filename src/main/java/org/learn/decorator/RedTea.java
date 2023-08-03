package org.learn.decorator;

import java.math.BigDecimal;

public class RedTea extends Beverage{
    @Override
    public String getDescription() {
        return "red tea";
    }

    @Override
    public float cost() {
        return 2;
    }
}
