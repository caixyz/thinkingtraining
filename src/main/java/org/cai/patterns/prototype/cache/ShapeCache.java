package org.cai.patterns.prototype.cache;

import org.cai.patterns.prototype.beans.Circle;
import org.cai.patterns.prototype.beans.Rectangle;
import org.cai.patterns.prototype.beans.Shape;
import org.cai.patterns.prototype.beans.Square;

import java.util.Hashtable;

/**
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape shape = shapeHashtable.get(shapeId);
        return (Shape) shape.clone();
    }
    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(),circle);

        Square square=new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(),square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(),rectangle);

    }


}
