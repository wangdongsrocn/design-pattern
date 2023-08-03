package org.learn.null_object;

public class CustomerFactory {
    public static final String[] names = {"Tom", "Jack", "David"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                return new RealCustomer(names[i]);
            }
        }
        return new NullCustomer();
    }
}
