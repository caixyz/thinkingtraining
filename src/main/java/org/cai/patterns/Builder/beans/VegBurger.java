package org.cai.patterns.Builder.beans;

import org.cai.patterns.Builder.service.Burger;
import org.cai.patterns.Builder.service.Packing;

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
