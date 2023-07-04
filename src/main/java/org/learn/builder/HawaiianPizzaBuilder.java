package org.learn.builder;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza("", "", "");
    }

    @Override
    public void setDough(String dough) {
        pizza = new Pizza(dough, pizza.getSauce(), pizza.getTopping());
    }

    @Override
    public void setSauce(String sauce) {
        pizza = new Pizza(pizza.getDough(), sauce, pizza.getTopping());
    }

    @Override
    public void setTopping(String topping) {
        pizza = new Pizza(pizza.getDough(), pizza.getSauce(), topping);
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}
