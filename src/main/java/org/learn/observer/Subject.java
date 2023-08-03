package org.learn.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> list = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer o : list) {
            o.update();
        }
    }
}
