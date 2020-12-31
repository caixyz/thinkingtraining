package org.cai.patterns.simpleFactory.factory;

import org.cai.patterns.simpleFactory.prod.Circular;
import org.cai.patterns.simpleFactory.prod.Triangle;

/**
 * 简单工厂
 * @Author: caisijun
 * @Date: 2020/12/30 0030
 */
public interface GeometryFactory {
    /**
     * 画 几何图形
     */
    default void draw(){
        System.out.println("画几何图形");
   }

    /**
     * 返回 具体几何对象
     * @param name
     * @return
     */
   default GeometryFactory getGeometry(String name){
        GeometryFactory factory=null;
        if(name.equals("circular")){
            factory=new Circular();
        }else if (name.equals("triangle"))
        {
            factory=new Triangle();
        }
        return factory;
   }
}
