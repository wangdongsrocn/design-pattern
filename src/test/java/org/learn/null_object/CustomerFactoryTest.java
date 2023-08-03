package org.learn.null_object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerFactoryTest {
    @Test
    @DisplayName("null object get test")
    public void getCustomerTest() {
        String[] names = {"Tom", "Lio", "Jack", "Judy", "Donny"};
        for (int i = 0; i < names.length; i++) {
            var customer = CustomerFactory.getCustomer(names[i]);
            System.out.println("Name: " + customer.getName());
        }
    }
}
