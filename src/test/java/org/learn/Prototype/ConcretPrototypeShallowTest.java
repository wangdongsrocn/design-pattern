package org.learn.Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.learn.prototype.ConcretPrototypeShallow;

import java.util.ArrayList;
import java.util.List;

public class ConcretPrototypeShallowTest {
    @Test
    @DisplayName("test shallow copy")
    public void cloneTest() {
        ConcretPrototypeShallow concretPrototypeShallow = new ConcretPrototypeShallow();
        concretPrototypeShallow.setAge(18);
        concretPrototypeShallow.setName("tom");
        concretPrototypeShallow.getHobbies().add("语文");
        concretPrototypeShallow.getHobbies().add("数学");

        ConcretPrototypeShallow concretPrototypeShallow1 = concretPrototypeShallow.clone();
        concretPrototypeShallow1.getHobbies().add("地理");
        System.out.println(concretPrototypeShallow.toString());
        System.out.println(concretPrototypeShallow1.toString());
        Assertions.assertNotEquals(concretPrototypeShallow, concretPrototypeShallow1);

        System.out.println("原型对象爱好：" + concretPrototypeShallow.getHobbies());
        System.out.println("克隆对象爱好：" + concretPrototypeShallow1.getHobbies());
        Assertions.assertEquals(concretPrototypeShallow.getHobbies(), concretPrototypeShallow1.getHobbies());
    }
}
