package org.learn.chain_of_responsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {
    @Test
    @DisplayName("chain of logger test")
    public void loggerTest() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        errorLogger.logMessage(AbstractLogger.ERROR, "error message");
    }
}
