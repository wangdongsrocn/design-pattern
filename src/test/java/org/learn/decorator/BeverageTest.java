package org.learn.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BeverageTest {
    @Test
    @DisplayName("make beverage")
    public void make() {
        Beverage beverage = new RedTea();
        beverage = new Lemon(beverage);
        beverage = new Mango(beverage);
        System.out.println("name: " + beverage.getDescription() + "\n" + "price: " + beverage.cost());
    }
}
