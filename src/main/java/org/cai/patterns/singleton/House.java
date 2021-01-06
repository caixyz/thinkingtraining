package org.cai.patterns.singleton;

/**
 * 调用 获取实例方法时 创建对象，属于所谓的 lazy（懒汉模式）
 * 线程安全：不安全
 *
 * @Author: caisijun
 * @Date: 2021/1/6 0006
 */
public class House {

    static House house;
    public void printHouse(){
        System.out.println("180平米 大房子");
    }

    public static House getInstance(){
        if(house==null){
            house=new House();
        }
        return house;
    }
}
