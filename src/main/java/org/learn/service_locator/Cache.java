package org.learn.service_locator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> list;

    public Cache() {
        list = new ArrayList<>();
    }

    public Service getService(String service) {
        for (Service s : list) {
            if (s.getName().equalsIgnoreCase(service)) {
                System.out.println("Return cached " + service + " object");
                return s;
            }
        }
        return null;
    }

    public void addService(Service service) {
        boolean exists = false;
        for (Service s : list) {
            if (s.getName().equalsIgnoreCase(service.getName())) {
                exists = true;
                return;
            }
        }
        if (!exists) {
            System.out.println("is a new service ,will add in cache");
            list.add(service);
        }
    }
}
