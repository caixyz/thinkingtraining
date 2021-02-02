package org.cai.patterns.flyweight.entity;

import lombok.Data;
import org.cai.patterns.flyweight.service.Shape;

/**
 * @Author: caisijun
 * @Date: 2021/2/2 0002
 */
@Data
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color)
    {
        this.color=color;
    }
    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
