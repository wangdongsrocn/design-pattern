package org.learn.strategy;

public class StrategyContext {
    private CalcStrategy calcStrategy;

    public StrategyContext(CalcStrategy calcStrategy) {
        this.calcStrategy = calcStrategy;
    }

    public int executeStrategy(int num1, int num2) {
        return calcStrategy.doOperation(num1, num2);
    }
}
