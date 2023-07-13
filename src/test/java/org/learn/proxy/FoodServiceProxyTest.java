package org.learn.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodServiceProxyTest {
    private FoodServiceProxy foodServiceProxy = new FoodServiceProxy();

    @Test
    @DisplayName("test make chicken")
    public void makeChickenTest() {
        Food food = foodServiceProxy.makeChicken();
        Assertions.assertEquals(true, food.getKeepWarm());
    }

    @Test
    @DisplayName("test make noodle")
    public void makeNoodle() {
        Food food = foodServiceProxy.makeNoodle();
        Assertions.assertEquals("noodle", food.getName());
    }
}
