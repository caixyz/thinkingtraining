package org.cai.patterns.prototype.beans;

import lombok.Data;

/**
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
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
