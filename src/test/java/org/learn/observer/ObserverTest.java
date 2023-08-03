package org.learn.observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static java.lang.System.in;

public class ObserverTest {
    @Test
    @DisplayName("observer execute test")
    public void executeTest() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("*********************");
        System.out.println("Second state change: 22");
        subject.setState(22);
    }
}
