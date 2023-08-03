package org.learn.service_locator;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }
        InitialContext initialContext = new InitialContext();
        Service service1 = (Service) initialContext.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
