package org.learn.singleton.full;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    @DisplayName("full singleton get instance")
    public void getInstance() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        Assertions.assertSame(singleton, singleton1);
    }
}
