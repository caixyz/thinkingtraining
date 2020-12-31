package org.cai.patterns.abstractFactory.fatherFactory;

import org.cai.patterns.abstractFactory.factory.ColorFactory;
import org.cai.patterns.abstractFactory.factory.OriginFactory;
import org.cai.patterns.abstractFactory.factory.TypeFactory;

/**
 * 食物顶级抽象工厂
 * @Author: caisijun
 * @Date: 2020/12/30 0030
 */
public abstract class FoodFactory {
    public abstract ColorFactory getColor(String name);
    public abstract OriginFactory getOrigin(String name);
    public abstract TypeFactory getType(String name);
}
