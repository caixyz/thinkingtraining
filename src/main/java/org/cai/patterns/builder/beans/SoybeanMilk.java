package org.cai.patterns.builder.beans;

import org.cai.patterns.builder.service.ColdDrink;

/**
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class SoybeanMilk extends ColdDrink {
    @Override
    public String name() {
        return "SoybeanMilk";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
