package org.learn.bridge;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void draw() {
        drawAPI.drawCircle(this.radius, this.x, this.y);
    }
}
