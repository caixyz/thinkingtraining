package org.cai.patterns.builder.beans;

import org.cai.patterns.builder.service.ColdDrink;

/**
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
