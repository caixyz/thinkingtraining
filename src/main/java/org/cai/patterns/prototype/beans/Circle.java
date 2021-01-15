package org.cai.patterns.prototype.beans;

/**
 * 圆形
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
public class Circle extends Shape {

    public Circle(){
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle :: draw() method");
    }
}
