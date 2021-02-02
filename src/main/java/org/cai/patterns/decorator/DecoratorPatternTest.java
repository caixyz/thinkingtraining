package org.cai.patterns.decorator;

import org.cai.patterns.decorator.entity.Circle;
import org.cai.patterns.decorator.entity.Rectangle;
import org.cai.patterns.decorator.entity.RedShapeDecorator;
import org.cai.patterns.decorator.entity.ShapeDecorator;
import org.cai.patterns.decorator.service.Shape;

/**
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
public class DecoratorPatternTest {
    public static void main(String[] args){
        Shape circle=new Circle();
        ShapeDecorator redCircle=new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle=new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
