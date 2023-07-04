package org.learn.builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder builder) {
        this.pizzaBuilder = builder;
    }
    public void constructPizza(){
        pizzaBuilder.setDough("dough11");
        pizzaBuilder.setSauce("sauce11");
        pizzaBuilder.setTopping("topping11");
    }
    public Pizza getPizza(){
        return pizzaBuilder.build();
    }
}
