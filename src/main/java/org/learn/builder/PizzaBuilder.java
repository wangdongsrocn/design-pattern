package org.learn.builder;

public interface PizzaBuilder {
    void setDough(String dough);
    void setSauce(String sauce);
    void setTopping(String topping);
    Pizza build();
}
