package org.learn.adapter;

public class StandardAdapter extends ChineseStandard implements BritishStandard{
    @Override
    public String getBritishStandard() {
        return getChineseStandard();
    }
}
