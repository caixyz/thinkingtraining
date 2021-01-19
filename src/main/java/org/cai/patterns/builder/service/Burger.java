package org.cai.patterns.builder.service;

import org.cai.patterns.builder.service.impl.Wrapper;

/**
 * 汉堡类产品抽象类
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public abstract class Burger implements FoodItems {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
