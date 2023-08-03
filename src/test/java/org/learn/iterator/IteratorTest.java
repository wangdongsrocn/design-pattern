package org.learn.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IteratorTest {
    @Test
    @DisplayName("iterator test")
    public void getIteratorTest() {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            var str = iterator.next();
            System.out.println(str.toString());
        }
    }
}
