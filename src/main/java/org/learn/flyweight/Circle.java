package org.learn.flyweight;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("circle: color: %s ,x: %d ,y: %d ,radius: %d ", this.color, this.x, this.y, this.radius));
    }
}
