package org.learn.facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeFacadeTest {
    @Test
    @DisplayName("shape facade test")
    public void drawTest() {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
    }
}
