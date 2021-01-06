package org.cai.patterns.singleton;

/**
 * 在调用实例方法前，对象已经创建好了，所以 属于”恶汉模式“
 * 线程安全：是
 * 缺点：占用内存，因为使用了static
 *
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class Bird {
    private static Bird bird=new Bird();
    public void printBird(){
        System.out.println("一只小麻雀");
    }
    public static Bird getInstance(){
        return bird;
    }
}
