package org.cai.patterns.flyweight.factory;




import org.cai.patterns.flyweight.entity.Circle;
import org.cai.patterns.flyweight.service.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
public class ShapeFactory {
    private static final Map<String, Shape> map=new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle=(Circle) map.get(color);
        if(circle==null){
            circle=new Circle(color);
            map.put(color,circle);
            System.out.println("Creating circle of color:"+color);
        }
        return circle;
    }
}
