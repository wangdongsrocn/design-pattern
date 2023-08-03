package org.learn.intercepting_filter;

public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("log request ... ...");
    }
}
