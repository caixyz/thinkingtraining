package org.cai.patterns.decorator.entity;

import org.cai.patterns.decorator.service.Shape;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        //新增一个功能
        setRedBorder(decoratorShape);
    }
    private void setRedBorder(Shape redBorder){
        System.out.println("Border Color:Red");
    }

}
