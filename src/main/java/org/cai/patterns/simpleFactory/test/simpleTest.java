package org.cai.patterns.simpleFactory.test;

import org.cai.patterns.simpleFactory.factory.GeometryFactory;
import org.cai.patterns.simpleFactory.prod.Circular;
import org.junit.Test;

/**
 * @Author: caisijun
 * @Date: 2020/12/30 0030
 */
public class simpleTest {

    @Test
    public void test1(){
        /**
         * 简单工厂，就是一个工厂，生产出不同产品。
         * 通过 传不同 字符串标识，生产不同产品，这是最简单的单个小工厂，扩展性、维护性都不高
         * result:
         * 画圆形
         */

        GeometryFactory geometryFactory= new Circular();
        geometryFactory.draw();
        geometryFactory.getGeometry("circular");
    }
}
