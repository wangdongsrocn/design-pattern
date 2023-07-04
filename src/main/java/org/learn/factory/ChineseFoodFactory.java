package org.learn.factory;

public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("chunjuan")) {
            return new Chunjuan();
        } else if (name.equals("doujiang")) {
            return new Doujiang();
        } else {
            return null;
        }
    }
}
