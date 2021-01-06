package org.cai.patterns.singleton;

import org.junit.Test;

/**
 * 单例测试
 * 所谓 单例 就是单实例，内存中只存在一个实例，a线程 和 b线程拥有的是同一个对象
 * 就是不在当前上下文实例化对象，当前代码执行完后，内存也不会被回收，此对象对所有线程可视可拥有，所以涉及到线程安全的问题
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class TestX {

    @Test
    public void Test1() {
        House house = House.getInstance();
        house.printHouse();
    }

    @Test
    public void Test2() {
        Bird bird = Bird.getInstance();
        bird.printBird();
    }

    @Test
    public void Test3() {
        Panda panda=Panda.getInstance();
        panda.printPanda();
    }


}
