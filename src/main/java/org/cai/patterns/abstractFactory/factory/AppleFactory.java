package org.cai.patterns.abstractFactory.factory;

import org.cai.patterns.abstractFactory.beans.computer.Computer;
import org.cai.patterns.abstractFactory.beans.computer.Mac;
import org.cai.patterns.abstractFactory.beans.phone.Phone;
import org.cai.patterns.abstractFactory.beans.phone.iPhone;


/**
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public class AppleFactory extends AbstractFactory {
    @Override
    public Phone getPhone() {
        return new iPhone();
    }

    @Override
    public Computer getComputer() {
        return new Mac();
    }
}
