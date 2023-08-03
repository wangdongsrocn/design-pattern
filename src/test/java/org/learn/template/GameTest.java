package org.learn.template;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    @DisplayName("game play test")
    public void playTest() {
        Game game = new Cricket();
        game.play();
        System.out.println("**********************");
        game = new Football();
        game.play();
    }
}
