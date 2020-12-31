package org.cai.patterns.simpleFactory.prod;

import org.cai.patterns.simpleFactory.factory.GeometryFactory;

/**
 * 圆
 * @Author: caisijun
 * @Date: 2020/12/30 0030
 */
public class Circular implements GeometryFactory {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
