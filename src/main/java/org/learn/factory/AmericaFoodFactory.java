package org.learn.factory;

public class AmericaFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("humburg")) {
            return new Humburg();
        } else if (name.equals("potato chips")) {
            return new PotatoChips();
        } else {
            return null;
        }
    }
}
