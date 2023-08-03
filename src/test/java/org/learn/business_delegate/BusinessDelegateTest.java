package org.learn.business_delegate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BusinessDelegateTest {
    @Test
    @DisplayName("business delegate test")
    public void doTaskTest() {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        System.out.println("***************************");
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
