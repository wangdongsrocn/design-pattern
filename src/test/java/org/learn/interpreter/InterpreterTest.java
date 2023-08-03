package org.learn.interpreter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterpreterTest {
    private static Expression getMaleExpressionTest() {
        Expression expression1 = new TerminalExpression("Tom");
        Expression expression2 = new TerminalExpression("Jack");
        return new OrExpression(expression1, expression2);
    }

    private static Expression getMarriedWomanExpression() {
        Expression expression1 = new TerminalExpression("Judy");
        Expression expression2 = new TerminalExpression("married");
        return new AndExpression(expression1, expression2);
    }

    @Test
    @DisplayName("interpreter test")
    public void interpretTest() {
        var expression1 = getMaleExpressionTest();
        var expression2 = getMarriedWomanExpression();
        Assertions.assertEquals(true, expression1.interpret("Tom"));
        System.out.println("Tom is male? " + expression1.interpret("Tom"));

        Assertions.assertEquals(true, expression2.interpret("Judy married"));
        System.out.println("Judy is married? " + expression2.interpret("Judy married"));
    }
}
