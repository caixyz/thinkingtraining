package org.cai.patterns.bridge.service.impl;

import org.cai.patterns.bridge.service.DrawAPI;

/**
 * 实现 DrawAPI 接口
 * @Author: caisijun
 * @Date: 2021/1/18 0018
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
