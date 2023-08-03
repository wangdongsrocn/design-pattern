package org.learn.visitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    @DisplayName("computer accept test")
    public void acceptTest() {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
