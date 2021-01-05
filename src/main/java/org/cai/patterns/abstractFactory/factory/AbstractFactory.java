package org.cai.patterns.abstractFactory.factory;

import org.cai.patterns.abstractFactory.beans.computer.Computer;
import org.cai.patterns.abstractFactory.beans.phone.Phone;



/**
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public abstract class AbstractFactory {
     public abstract Phone getPhone();
     public abstract Computer getComputer();
}
