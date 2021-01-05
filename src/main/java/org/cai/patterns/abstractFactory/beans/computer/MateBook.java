package org.cai.patterns.abstractFactory.beans.computer;


import lombok.extern.slf4j.Slf4j;

/**
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public class MateBook implements Computer{

    @Override
    public void printComputerConf() {
        System.out.println("HUAWEI MateBook X 2020款 i7 16G 512G 9999￥");
    }
}
