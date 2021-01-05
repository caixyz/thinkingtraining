package org.cai.patterns.abstractFactory.factory;

import org.cai.patterns.abstractFactory.beans.computer.Computer;
import org.cai.patterns.abstractFactory.beans.computer.MateBook;
import org.cai.patterns.abstractFactory.beans.phone.HUAWEIP40;
import org.cai.patterns.abstractFactory.beans.phone.Phone;


/**
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public class HUAWEIFactory extends AbstractFactory{
    @Override
    public Phone getPhone() {
        return new HUAWEIP40();
    }

    @Override
    public Computer getComputer() {
        return new MateBook();
    }
}
