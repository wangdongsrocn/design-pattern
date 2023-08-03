package org.learn.simple_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodFactoryTest {
    @Test
    @DisplayName("生成包子")
    public void makeFoodBaozi() {
        var food = FoodFactory.makeFood("baozi");
        assertEquals(Baozi.class,food.getClass());
    }
    @Test
    @DisplayName("生成油条")
    public void makeFoodYoutiao(){
        var food = FoodFactory.makeFood("youtiao");
        assertEquals(Youtiao.class,food.getClass());
    }
}
