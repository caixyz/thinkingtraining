package org.cai.patterns.Builder.test;

import org.cai.patterns.Builder.build.MealBuilde;
import org.cai.patterns.Builder.build.MealDisk;
import org.junit.Test;

/**
 * 建造者模式，就是建造多个产品合拼到一起
 * 如同：吃肯德基 点了汉堡和饮料 后，用盘子装起来 而 汉堡 和 饮料 具体细节如下：
 * 汉堡：用蔬菜和肉 再用2个面包包装起来
 * 饮料：是否加冰 是否加热 ，再用相关的被子 装起来
 * 最后，用盘子把这些食品装起来。
 *
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class testBuilde {

    @Test
    public void Test1(){
        MealBuilde mealBuilde=new MealBuilde();
        MealDisk mealDisk= mealBuilde.prepareVegMeal();
        mealDisk.showImtes();
        System.out.println("total price:"+mealDisk.getTotalPrice());
    }
}
