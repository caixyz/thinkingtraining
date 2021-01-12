package org.cai.patterns.singleton.beans;

/**
 * 属于lazy模式，但是是线程安全
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class Panda {
    public static volatile Panda panda;

    public void printPanda() {
        System.out.println("国宝大熊猫");
    }

    public static Panda getInstance() {
        if (panda == null) {
            synchronized (Panda.class) {
                if (panda == null)
                    panda = new Panda();
            }
        }
        return panda;
    }
}
