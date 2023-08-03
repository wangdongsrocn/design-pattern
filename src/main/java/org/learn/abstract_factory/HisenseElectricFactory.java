package org.learn.abstract_factory;

public class HisenseElectricFactory extends AbstractElectricFactory{
    @Override
    public AbstractTV makeTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractRadio makeRadio() {
        return new HisenseRadio();
    }

    @Override
    public AbstractPhone makePhone() {
        return new HisensePhone();
    }
}
