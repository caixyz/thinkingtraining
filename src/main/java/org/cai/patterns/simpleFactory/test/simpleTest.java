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
         * 
         * result:
         * 画圆形
         */
        GeometryFactory geometryFactory= new Circular();
        geometryFactory.draw();
        geometryFactory.getGeometry("circular");
    }
}
