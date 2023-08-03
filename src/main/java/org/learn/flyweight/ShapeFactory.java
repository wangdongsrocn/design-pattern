package org.learn.flyweight;

import org.learn.flyweight.Shape;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();

    @SuppressWarnings("unchecked")
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("created " + color + " first one into the map");
        }
        return circle;
    }
}
