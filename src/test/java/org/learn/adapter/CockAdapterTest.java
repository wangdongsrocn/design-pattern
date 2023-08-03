package org.learn.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CockAdapterTest {
    @Test
    @DisplayName("test quack")
    public void quackTest() {
        CockAdapter cockAdapter = new CockAdapter(new WildCock());
        cockAdapter.quack();
        cockAdapter.fly();
    }
}
