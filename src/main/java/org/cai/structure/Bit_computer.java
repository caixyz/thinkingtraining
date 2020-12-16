package org.cai.structure;

/**
 * 训练内容：位 及相关运算符
 * @Author: caisijun
 * @Date: 2020/11/23 0023
 */
public class Bit_computer {


    public static void main(String[] args) {


        //&（与）运算符
        System.out.println("&（与）操作符规则：1:1则1 否则 0");
        System.out.println("********************************************************************************");
        System.out.println("**                              4：0000 0100                                  **");
        System.out.println("**                              7：0000 0111                                  **");
        System.out.println("**                              -------------                                 **");
        System.out.println("**                                 0000 0100                                  **");
        System.out.println("********************************************************************************");
        System.out.print("4&7：");
        System.out.println(4&7);

        System.out.println("|（或）操作符规则：0:0则0 否则1");
        System.out.println("********************************************************************************");
        System.out.println("**                              4：0000 0100                                  **");
        System.out.println("**                              7：0000 0111                                  **");
        System.out.println("**                              -------------                                 **");
        System.out.println("**                                 0000 0111                                  **");
        System.out.println("********************************************************************************");
        System.out.print("4|7：");
        System.out.println(4|7);

        System.out.println("^（异）操作符规则：0:0 或 1:1 则0，否则0");
        System.out.println("********************************************************************************");
        System.out.println("**                              4：0000 0100                                  **");
        System.out.println("**                              7：0000 0111                                  **");
        System.out.println("**                              -------------                                 **");
        System.out.println("**                                 0000 0011                                  **");
        System.out.println("********************************************************************************");
        System.out.print("4^7：");
        System.out.println(4^7);

        System.out.println("~（取反）操作符规则：顾名思义 0变1 ；1变0");
        System.out.println("********************************************************************************");
        System.out.println("**                              4：0000 0100                                  **");
        System.out.println("**                              -------------                                 **");
        System.out.println("**                                 1111 1011                                  **");
        System.out.println("********************************************************************************");
        System.out.print("~4：");
        System.out.println(~4);

        System.out.println("<<（左移）操作符规则：位整体向左移x位，缺少的位0补充（n<<m=n*2^m,eg:4<<2=4*2^2=16）");
        System.out.println("********************************************************************************");
        System.out.println("**                              4(左移2位)：0000 0100                         **");
        System.out.println("**                              ---------------------                         **");
        System.out.println("**                                          0001 0000                         **");
        System.out.println("********************************************************************************");
        System.out.print("4<<2：");
        System.out.println(4<<2);

        System.out.println(">>（右移）操作符规则：位整体向右移x位，缺少的位0补充（n>>m=m/2n=4/2*2=1）");
        System.out.println("********************************************************************************");
        System.out.println("**                              4(左移2位)：0000 0100                         **");
        System.out.println("**                              ---------------------                         **");
        System.out.println("**                                          0000 0001                         **");
        System.out.println("********************************************************************************");
        System.out.print("4>>2：");
        System.out.println(4>>2);


    }
}
