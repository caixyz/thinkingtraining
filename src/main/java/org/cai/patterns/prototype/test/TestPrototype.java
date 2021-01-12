package org.cai.patterns.prototype.test;

import org.cai.patterns.prototype.beans.Shape;
import org.cai.patterns.prototype.cache.ShapeCache;
import org.junit.Test;

/**
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
public class TestPrototype {

    @Test
    public void TestA(){
        ShapeCache.loadCache();
        Shape cloneShape=ShapeCache.getShape("1");
        Shape cloneShape2=ShapeCache.getShape("1");
        System.out.println(cloneShape.getType()+cloneShape2.getType());
    }
}
