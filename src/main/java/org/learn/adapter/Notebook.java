package org.learn.adapter;

public class Notebook {
    public void charge(BritishStandard britishStandard) {
        if ("Chinese standard".equals(britishStandard.getBritishStandard())) {
            System.out.println("charge succeed");
        } else {
            System.out.println("charge failed");
        }
    }
}
