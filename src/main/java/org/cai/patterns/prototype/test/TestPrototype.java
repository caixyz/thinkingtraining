package org.cai.patterns.prototype.test;

import org.cai.patterns.prototype.beans.Shape;
import org.cai.patterns.prototype.cache.ShapeCache;
import org.junit.Test;

/**
 * 原型设计模式 测试
 * 所谓 原型设计模式 就是 1：n 的关系，一个原始对象 派生出n个对象
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
public class TestPrototype {

    @Test
    public void TestA(){
        /**
         * 加载缓存对象
         */
        ShapeCache.loadCache();
        //获取 抽象类 对象的 副本
        Shape cloneShape=ShapeCache.getShape("1");
        Shape cloneShape2=ShapeCache.getShape("1");
        System.out.println(cloneShape.getType()+cloneShape2.getType());
    }
}
