package org.learn.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmericaFoodFactoryTest {
    @Test
    @DisplayName("america food factory - humburg")
    public void mackFood(){
        FoodFactory foodFactory = new AmericaFoodFactory();
        var food = foodFactory.makeFood("humburg");
        assertEquals(Humburg.class,food.getClass());
    }
}
