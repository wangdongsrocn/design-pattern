package org.learn.state;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StateTest {
    @Test
    @DisplayName("state doAction test")
    public void doActionTest() {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println("************************");
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
