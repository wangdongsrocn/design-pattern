package org.learn;

import org.learn.simplefactory.FoodFactory;

public class Main {
    public static void main(String[] args) {
        var food = FoodFactory.makeFood("baozi");
        System.out.println(food.toString() + "\n" + food.getClass() + "\n" + food.hashCode());
    }
}