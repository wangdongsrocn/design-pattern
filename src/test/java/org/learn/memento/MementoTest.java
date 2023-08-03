package org.learn.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MementoTest {
    @Test
    @DisplayName("memento test")
    public void MementoOperateTest() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state #4");
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Second saved state: " + originator.getState());

    }
}
