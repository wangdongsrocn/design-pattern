package org.learn.proxy;

public class FoodServiceProxy implements FoodService {
    private FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        System.out.println("start make chicken");
        Food food = foodService.makeChicken();
        System.out.println("finish make chicken");
        food.setKeepWarm(true);
        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("start make noodle");
        Food food = foodService.makeNoodle();
        System.out.println("finish make noodle");
        return food;
    }
}
