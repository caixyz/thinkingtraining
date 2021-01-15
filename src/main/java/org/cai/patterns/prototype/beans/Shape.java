package org.cai.patterns.prototype.beans;

import lombok.Data;

/**
 * 形状 抽象类
 * @Author: caisijun
 * @Date: 2021/1/12 0012
 */
@Data
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    /**
     * 重写 克隆 方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() {
        Object obj = null;
        try {
            //1. 浅复制，就是仅仅复制 8种基本类型
            //2. 所谓深复制，就是复制所有对象（包括基本类型和引用类型）
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
