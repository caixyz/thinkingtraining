package org.cai.patterns.simpleFactory.prod;

import org.cai.patterns.simpleFactory.factory.GeometryFactory;

/**
 * 三角形
 * @Author: caisijun
 * @Date: 2020/12/30 0030
 */
public class Triangle implements GeometryFactory {
    @Override
    public void draw() {
        System.out.println("我正在画 三角形");
    }
}
