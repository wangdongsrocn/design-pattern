package org.learn.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChineseFoodFacotyTest {
    @Test
    @DisplayName("chinese food factory - chunjuan")
    public void mackFood(){
        FoodFactory foodFactory = new ChineseFoodFactory();
        var food = foodFactory.makeFood("chunjuan");
        assertEquals(Chunjuan.class,food.getClass());
    }
}
