package org.learn.proxy;

public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        Food food = new Food();
        food.setName("chicken");
        return food;
    }

    @Override
    public Food makeNoodle() {
        Food food = new Food();
        food.setName("noodle");
        return food;
    }
}
