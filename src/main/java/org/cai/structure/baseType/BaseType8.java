package org.cai.structure.baseType;

import org.junit.Test;

/**
 * 八种基本类型
 * @Author: caisijun
 * @Date: 2020/12/16 0016
 */
public class BaseType8 {


    @Test
    public void baseType() {
        /**
         * 导论
         * 基本类型是组成bit(位)的方式，就是组织 0和1 的形式。
         * TODO 等价关系
         * 8位（bit）== 1字节(byte)
         * 1024字节 == 1kb
         * 1024kb == 1MB
         * 1024MB == 1GB
         * 1024GB == 1TB
         * ...
         * TODO bit存储的值 有且只能是 0 和 1
         * TODO 列如（eg.）：（二进制 11111111 ）= （十进制 255）注意： 8个1
         * TODO 因为 byte 存在符号，就是 正数和负数 符号 + - ，所以 byte 的取值范围是（-128 到 128-1）共占用7个bit.;;另外为什么是128-1？因为正整数范围是0~127=128位
         * TODO 二进制第一位是符号位
         *
         * 数据的类型划分：
         * 正整数（小->大）：byte->short->int->long
         * 带小数点数值（小->大）：float->double
         * 字符型：char
         * boolean型：本质也是byte，只是被约束只能存储 （0,1） 也就是(false，true)
         */


        boolean is_dev = true;
        System.out.println("（一）boolean 占用1个字节，就是1*8=8 （bit）");

        byte byte_min = -128;
        byte byte_max = 127;
        final String seven1 = "1111111";
        System.out.println("（二） byte 占用1个字节，就是 1*8=8 （bit）->byte 最大二进制:" + seven1.length() + " bit" + ",十进制：" + get10Hex(seven1));

        short short_max = 32768-1;
        short short_min = -32768;
        final String fifteen1 = "111111111111111";
        System.out.println("（三） short 占用2个字节，就是 2*8=16 （bit）->short 最大二进制:" + fifteen1.length() + " bit" + ",十进制：" + get10Hex(fifteen1));


        int int_max = 2147483647;
        int int_min = -2147483648;
        final String thirtyOne1 = "1111111111111111111111111111111";
        System.out.println("（四） int 占用4个字节，就是 4*8=32 （bit）->int 最大二进制:" + thirtyOne1.length() + " bit" + ",十进制：" + get10Hex(thirtyOne1));


        long long_max = 9223372036854775807L;
        long long_min = 9223372036854775807L - 1;
        final String sixtyThree1 = "111111111111111111111111111111111111111111111111111111111111111";
        System.out.println("（五）long 占用8个字节,就是 8*8=64 （bit）->long 最大二进制:" + sixtyThree1.length() + " bit" + ",十进制：" + getLong10Hex(sixtyThree1));


        float float_max = 2 ^ 31 - 1;
        float float_min = -2 ^ 31;
        System.out.println("（六）flout 占用4个字节,就是 4*8=32 （bit）");

        double double_max = 9223372036854775807L;
        double double_min = 9223372036854775807L - 1;
        System.out.println("（七）double 占用8个字节,就是 8*8=64 （bit）");

        char char_max = '啊';
        char char_min = 'a';
        char number_0 = 0;
        char number_max = 65535;

        //TODO 数值待研究
        System.out.println("（八）char 占用2个字节,就是 2*8=16 （bit），汉字占用两个字节，就是‘’只能写一个字 。数值只能存储0~65535（也就是000000000000000~1111111111111111）");
        System.out.println("the end");
        System.out.println("thanks!!");

    }

    /**
     * 二进制字符串 转 int
     * @param binary
     * @return
     */
    int get10Hex(String binary){
        return Integer.valueOf(binary,2);
    }
    /**
     * 二进制字符串 转 long
     * @param binary
     * @return
     */
    long getLong10Hex(String binary){
        return Long.valueOf(binary,2);
    }

}
