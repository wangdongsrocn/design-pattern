package org.learn.singleton.enummode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    @DisplayName("enum singleton get instance")
    public void getInstance() {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        Assertions.assertSame(singleton, singleton1);
    }
}
