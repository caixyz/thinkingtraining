package org.cai.patterns.decorator.entity;

import org.cai.patterns.decorator.service.Shape;

/**
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape:Circle");
    }
}
