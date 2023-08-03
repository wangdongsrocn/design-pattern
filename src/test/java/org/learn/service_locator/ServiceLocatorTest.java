package org.learn.service_locator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ServiceLocatorTest {
    @Test
    @DisplayName("service locator get service test")
    public void getServiceTest() {
        Service service1 = ServiceLocator.getService("Service1");
        System.out.println(service1.getName());
        service1.execute();
        Service service2 = ServiceLocator.getService("service2");
        System.out.println(service2.getName());
        service2.execute();
        Service service3 = ServiceLocator.getService("service1");
        System.out.println(service3.getName());
        service3.execute();
    }
}
