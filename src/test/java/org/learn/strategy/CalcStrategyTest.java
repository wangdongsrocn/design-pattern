package org.learn.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcStrategyTest {
    @Test
    @DisplayName("execute strategy test")
    public void executeTest() {
        StrategyContext strategyContext = new StrategyContext(new OperationAdd());
        var result = strategyContext.executeStrategy(2, 3);
        System.out.println(result);
        Assertions.assertEquals(5, result);

        strategyContext = new StrategyContext(new OperationSubstract());
        var result1 = strategyContext.executeStrategy(8, 6);
        System.out.println(result1);
        Assertions.assertEquals(2, result1);

        strategyContext = new StrategyContext(new OperationMultiply());
        var result2 = strategyContext.executeStrategy(3, 5);
        System.out.println(result2);
        Assertions.assertEquals(15, result2);
    }
}
