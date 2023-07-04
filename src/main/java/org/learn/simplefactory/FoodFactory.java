package org.learn.simplefactory;

public class FoodFactory {
    public static Food makeFood(String name) {
        Food food = null;
        if (name.equals("baozi")) {
            food = new Baozi();
        } else if (name.equals("youtiao")) {
            food = new Youtiao();
        }
        return food;
    }
}
