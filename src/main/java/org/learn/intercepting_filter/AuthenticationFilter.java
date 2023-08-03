package org.learn.intercepting_filter;

public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("Authentication executing ... ...");
    }
}
