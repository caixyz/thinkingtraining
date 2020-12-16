package org.cai.algorithm.stream;

import org.junit.Test;

/**
 * 有关Lambda Expression
 * @Author: caisijun
 * @Date: 2020/12/9 0009
 */
public class Lambda {
    @Test
    public void hello(){
        new Thread(()->{System.out.println("hello world");}).start();
    }

}
