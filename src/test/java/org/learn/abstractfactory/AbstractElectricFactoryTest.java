package org.learn.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractElectricFactoryTest {
    @Test
    @DisplayName("haier electric make")
    public void haierElectricMake() {
        AbstractElectricFactory abstractElectricFactory = new HaierElectricFactory();
        AbstractTV abstractTV = abstractElectricFactory.makeTV();
        AbstractRadio abstractRadio = abstractElectricFactory.makeRadio();
        AbstractPhone abstractPhone = abstractElectricFactory.makePhone();
        Assertions.assertEquals(HaierTV.class, abstractTV.getClass());
        Assertions.assertEquals(HaierRadio.class, abstractRadio.getClass());
        Assertions.assertEquals(HaierPhone.class, abstractPhone.getClass());
    }
    @Test
    @DisplayName("hisense electric make")
    public void hisenseElectricMake(){
        AbstractElectricFactory abstractElectricFactory=new HisenseElectricFactory();
        AbstractTV abstractTV = abstractElectricFactory.makeTV();
        AbstractRadio abstractRadio = abstractElectricFactory.makeRadio();
        AbstractPhone abstractPhone = abstractElectricFactory.makePhone();
        Assertions.assertEquals(HisenseTV.class, abstractTV.getClass());
        Assertions.assertEquals(HisenseRadio.class, abstractRadio.getClass());
        Assertions.assertEquals(HisensePhone.class, abstractPhone.getClass());
    }
}
