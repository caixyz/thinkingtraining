package org.cai.patterns.builder.service;

import org.cai.patterns.builder.service.impl.Bottle;

/**
 * 冷饮类 商品
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public abstract class ColdDrink implements FoodItems{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
