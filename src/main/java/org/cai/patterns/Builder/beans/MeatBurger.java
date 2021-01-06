package org.cai.patterns.Builder.beans;

import org.cai.patterns.Builder.service.Burger;

/**
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class MeatBurger extends Burger {
    @Override
    public float price() {
        return 28.5f;
    }

    @Override
    public String name() {
        return "MeatBurger";
    }
}
