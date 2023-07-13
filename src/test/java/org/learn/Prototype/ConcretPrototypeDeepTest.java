package org.learn.Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.learn.prototype.ConcretPrototypeDeep;

public class ConcretPrototypeDeepTest {
    @Test
    @DisplayName("test deep copy")
    public void cloneTest(){
        ConcretPrototypeDeep concretPrototypeDeep = new ConcretPrototypeDeep();
        concretPrototypeDeep.setAge(9);
        concretPrototypeDeep.setName("jack");
        concretPrototypeDeep.getHobbies().add("语文");
        concretPrototypeDeep.getHobbies().add("数学");
        ConcretPrototypeDeep concretPrototypeDeep1 = concretPrototypeDeep.clone();
        concretPrototypeDeep1.getHobbies().add("地理");
        System.out.println(concretPrototypeDeep.toString());
        System.out.println(concretPrototypeDeep1.toString());
        Assertions.assertNotEquals(concretPrototypeDeep,concretPrototypeDeep1);
        Assertions.assertNotEquals(concretPrototypeDeep.getHobbies(),concretPrototypeDeep1.getHobbies());
    }
}
