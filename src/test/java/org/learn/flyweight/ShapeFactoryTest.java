package org.learn.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.learn.flyweight.Circle;

public class ShapeFactoryTest {
    private static final String colors[] = {"red", "green", "blue", "black"};

    @Test
    @DisplayName("shape get test")
    public void shapeGetTest() {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColors());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private String getRandomColors() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
