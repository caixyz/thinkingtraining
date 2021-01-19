package org.cai.patterns.bridge.test;

import org.cai.patterns.bridge.service.impl.GreenCircle;
import org.cai.patterns.bridge.service.impl.RedCircle;
import org.cai.patterns.bridge.factory.*;
import org.cai.patterns.bridge.beans.*;
import org.junit.Test;

/**
 * 桥接模式 就是 通过 抽象类 将父类和接口类 连接起来
 * 优点：实现抽象独立 具体独立 连接通过 桥接实现
 * 缺点：增加了项目的复杂度和代码量
 * @Author: caisijun
 * @Date: 2021/1/18 0018
 */
public class BridgeTest {

    /**
     * results:
     * Drawing Circle[ color: red, radius: 10, x: 100, 100]
     * Drawing Circle[ color: green, radius: 10, x: 100, 100]
     */
    @Test
    public void testA(){
        Shape shape=new Circle(100,100,10,new RedCircle());
        shape.draw();
        Shape shape2=new Circle(100,100,10,new GreenCircle());
        shape2.draw();
    }
}
