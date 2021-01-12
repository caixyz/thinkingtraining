package org.cai.patterns.abstractFactory.test;

import org.cai.patterns.abstractFactory.beans.computer.Computer;
import org.cai.patterns.abstractFactory.beans.phone.Phone;
import org.cai.patterns.abstractFactory.factory.AbstractFactory;
import org.cai.patterns.abstractFactory.factory.AppleFactory;
import org.cai.patterns.abstractFactory.factory.HUAWEIFactory;
import org.junit.Test;

/**
 * 抽象工厂测试
 * 什么是抽象工厂？
 * 可以简单理解 抽象工厂是用来生产工厂的，工厂下面又可以生产产品
 * ；；
 * 优点：省去了实例化多个对象的代码，eg.生产工厂及工厂生产产品
 * 缺点：每新增一个工厂，都需要添加xxxFactory.java 以及具体的product .java
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public class TestAbstractFactory {
    @Test
    public void Test1(){
        String x="2021-01-07";
        String y="2020-01-07";
        System.out.println(y.substring(5));
        if(x.indexOf(y.substring(5))>-1)
            System.out.println(true);
        else
            System.out.println(false);

       /* AbstractFactory huaweiFactory=new HUAWEIFactory();
        AbstractFactory appleFactory=new AppleFactory();

        Phone p40= huaweiFactory.getPhone();
        p40.printPhoneConf();
        Computer mateBook=huaweiFactory.getComputer();
        mateBook.printComputerConf();

        System.out.println("==========================");

        Phone ipone=appleFactory.getPhone();
        Computer mac=appleFactory.getComputer();
        ipone.printPhoneConf();
        mac.printComputerConf();*/
    }
}
