package org.learn.composite_entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompositeEntityTest {
    @Test
    @DisplayName("Composite entity test")
    public void printTest() {
        Client client = new Client();
        client.setData("First obj", "Second obj");
        client.printData();
    }
}
