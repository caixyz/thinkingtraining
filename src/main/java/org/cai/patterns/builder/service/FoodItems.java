package org.cai.patterns.builder.service;

/**
 * 盘子里的 食品项
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public interface FoodItems {
    String name();
    float price();
    Packing packing();
}
