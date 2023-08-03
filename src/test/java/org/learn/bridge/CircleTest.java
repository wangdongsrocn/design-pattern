package org.learn.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    @DisplayName("test draw")
    public void drawTest() {
        Circle circle = new Circle(new BlueCircle(), 5, 8, 3);
        circle.draw();
        circle = new Circle(new RedCircle(),22,33,44);
        circle.draw();
    }
}
