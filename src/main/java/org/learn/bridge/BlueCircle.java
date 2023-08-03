package org.learn.bridge;

public class BlueCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("Drawing circle {color: blue,radius: %d,x: %d,y: %d}", radius, x, y));
    }
}
