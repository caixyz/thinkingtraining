package org.cai.patterns.abstractFactory.beans.computer;

/**
 * @Author: caisijun
 * @Date: 2021/1/5 0005
 */
public class Mac implements Computer {
    @Override
    public void printComputerConf() {
        System.out.println("MacBook Pro 13 Intel Core i5 或 i7 最高可选配 16GB 内存 最高可选配 2TB 存储设备17 7999￥");
    }
}
