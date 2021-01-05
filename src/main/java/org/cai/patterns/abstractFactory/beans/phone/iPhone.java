package org.cai.patterns.abstractFactory.beans.phone;

/**
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public class iPhone implements Phone {
    @Override
    public void printPhoneConf() {
        System.out.println("iPhone 12 白色 Pro 8G 256G 8499￥");
    }
}
