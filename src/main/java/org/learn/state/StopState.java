package org.learn.state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
    }

    @Override
    public String toString() {
        return "Stop state";
    }
}
