package org.learn.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeTest {
    @Test
    @DisplayName("employee test")
    public void employeeTest() {
        Employee tm = new Employee("张三", "技术部", 20000);
        Employee sm = new Employee("李四", "销售部", 50000);
        Employee tgm = new Employee("王五", "技术部", 15000);
        tm.add(tgm);
        tm.add(new Employee("赵六", "技术部", 14500));
        sm.add(new Employee("李四", "销售部", 30000));
        tgm.add(new Employee("刘麻子", "技术部", 11000));
        System.out.println(tm.toString());
        print(tm.getSubordinates());
        System.out.println(sm);
    }

    private void print(List<Employee> list) {
        if (!list.isEmpty()) {
            for (Employee e : list) {
                System.out.println("\t" + e.toString());
                print(e.getSubordinates());
            }
        }
    }
}
