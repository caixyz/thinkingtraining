package org.cai.patterns.decorator.entity;

import org.cai.patterns.decorator.service.Shape;

/**
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
