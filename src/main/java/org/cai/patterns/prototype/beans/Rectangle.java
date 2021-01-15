package org.cai.patterns.prototype.beans;

/**
 * 矩形
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle :: draw() method.");
    }
}
