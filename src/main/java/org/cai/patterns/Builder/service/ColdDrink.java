package org.cai.patterns.Builder.service;

import org.cai.patterns.Builder.service.impl.Bottle;

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
