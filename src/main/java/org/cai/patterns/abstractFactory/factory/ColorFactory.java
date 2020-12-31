package org.cai.patterns.abstractFactory.factory;

import org.cai.patterns.abstractFactory.fatherFactory.FoodFactory;

/**
 * 颜色工厂
 * @Author: caisijun
 * @Date: 2020/12/30 0030
 */
public class ColorFactory extends FoodFactory {

    @Override
    public ColorFactory getColor(String name) {
        return null;
    }

    @Override
    public OriginFactory getOrigin(String name) {
        return null;
    }

    @Override
    public TypeFactory getType(String name) {
        return null;
    }
}
