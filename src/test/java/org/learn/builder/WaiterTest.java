package org.learn.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WaiterTest {
    @Test
    @DisplayName("pizza build")
    public void pizzaBuild(){
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        Waiter waiter = new Waiter(pizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.toString());
    }
}
