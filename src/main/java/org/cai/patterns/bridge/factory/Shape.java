package org.cai.patterns.bridge.factory;

import org.cai.patterns.bridge.service.DrawAPI;

/**
 * 形状抽象类
 * 此类是桥接模式的关键
 * Shape构造函数，包含DrawAPI接口，在其派生类中赋值
 * @Author: caisijun
 * @Date: 2021/1/18 0018
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}