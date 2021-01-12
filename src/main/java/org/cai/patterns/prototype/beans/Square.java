package org.cai.patterns.prototype.beans;

/**
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
public class Square extends Shape {

    public Square(){
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square :: draw() method.");
    }
}
