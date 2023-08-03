package org.learn.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommandTest {
    @Test
    @DisplayName("command test")
    public void executeTest() {
        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(new Stock()));
        broker.takeOrder(new SellStock(new Stock()));
        broker.placeOrder();
    }
}
