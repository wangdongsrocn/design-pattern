package org.learn.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardAdapterTest {
    @Test
    @DisplayName("test get british standard")
    public void getBritishStandardTest() {
        StandardAdapter standardAdapter = new StandardAdapter();
        var v1 = standardAdapter.getBritishStandard();
        System.out.println(v1);
        Assertions.assertEquals(standardAdapter.getChineseStandard(), v1);
    }

    @Test
    @DisplayName("charge test")
    public void chargeTest() {
        new Notebook().charge(new StandardAdapter());
    }
}
