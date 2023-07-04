package org.learn.abstractfactory;

public class HaierElectricFactory extends AbstractElectricFactory {
    @Override
    public AbstractTV makeTV() {
        return new HaierTV();
    }

    @Override
    public AbstractRadio makeRadio() {
        return new HaierRadio();
    }

    @Override
    public AbstractPhone makePhone() {
        return new HaierPhone();
    }
}
