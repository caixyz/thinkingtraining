package org.cai.patterns.builder.beans;

import org.cai.patterns.builder.service.Burger;

/**
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 23;
    }

    @Override
    public String name() {
        return "VegBurger";
    }
}
