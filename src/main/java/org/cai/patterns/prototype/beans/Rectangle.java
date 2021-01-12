package org.cai.patterns.prototype.beans;

/**
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
