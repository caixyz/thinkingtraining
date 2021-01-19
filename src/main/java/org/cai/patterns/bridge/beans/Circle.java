package org.cai.patterns.bridge.beans;

import org.cai.patterns.bridge.service.DrawAPI;

import org.cai.patterns.bridge.factory.*;

/**
 * 圆形 继承抽象类 初始化自己及抽象类型的数据 重写 draw 方法
 * @Author: caisijun
 * @Date: 2021/1/18 0018
 */
public class Circle extends Shape {
    private int x,y,radius;

    public Circle(int x, int y, int radius ,DrawAPI drawAPI){
        super(drawAPI);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
