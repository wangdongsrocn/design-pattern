package org.learn.intercepting_filter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    @DisplayName("intercepring filter test")
    public void executeTest() {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Test intercepting filter!");
    }
}
