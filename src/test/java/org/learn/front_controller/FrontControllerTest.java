package org.learn.front_controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrontControllerTest {
    @Test
    @DisplayName("front controller dispatch test")
    public void dispatch() {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        System.out.println("*********************");
        frontController.dispatchRequest("student");
    }
}
