package org.learn.mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    @DisplayName("user show message test")
    public void showMessageTest() {
        User tom = new User("Tom");
        User jack = new User("Jack");
        tom.sendMessage("Hi,Jack! ");
        jack.sendMessage("Hi");
    }
}
