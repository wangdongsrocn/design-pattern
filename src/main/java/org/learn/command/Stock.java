package org.learn.command;

public class Stock {
    private String name = "ABC";
    private int quantity = 100;

    public void buy() {
        System.out.println(String.format("Stock [name:%s,quantity:%d] bought!", name, quantity));
    }
    public void sell() {
        System.out.println(String.format("Stock [name:%s,quantity:%d] sold!", name, quantity));
    }
}
