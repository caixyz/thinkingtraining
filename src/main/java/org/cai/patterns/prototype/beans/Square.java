package org.cai.patterns.prototype.beans;

/**
 * 正方形
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
