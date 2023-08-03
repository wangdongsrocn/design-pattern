package org.learn.abstract_factory;

public abstract class AbstractElectricFactory {
    public abstract AbstractTV makeTV();
    public abstract AbstractRadio makeRadio();
    public abstract AbstractPhone makePhone();
}
