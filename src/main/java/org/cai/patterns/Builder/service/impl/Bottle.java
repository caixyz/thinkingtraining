package org.cai.patterns.Builder.service.impl;

import org.cai.patterns.Builder.service.Packing;

/**
 *  实现包装（瓶子容器）
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
