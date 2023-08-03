package org.learn;

import org.learn.observer.BinaryObserver;
import org.learn.observer.HexaObserver;
import org.learn.observer.OctalObserver;
import org.learn.observer.Subject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("*********************");
        System.out.println("Second state change: 22");
        subject.setState(22);
        Scanner scanner = new Scanner(System.in);
        subject.setState(scanner.nextInt());
    }
}