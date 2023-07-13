package org.learn.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConcretPrototypeShallow implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcretPrototypeShallow clone() {
        try {
            ConcretPrototypeShallow clone = (ConcretPrototypeShallow) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretPrototype{" +
                "age=" + age +
                "name=" + name +
                "hobbies=" + hobbies;
    }
}
