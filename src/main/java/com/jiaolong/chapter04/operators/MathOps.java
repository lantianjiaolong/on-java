package com.jiaolong.chapter04.operators;

import java.util.Random;

/**
 * @author: Jiaolong
 * @ClassName: MathOps
 * @file: MathOps.java
 * @description 算术操作符
 * @date: 2024/6/17 下午11:27
 */
public class MathOps {
    public static void main(String[] args) {
        //创建一个种子随机数生成器
        Random rand = new Random(47); //设置种子
        //整数测试：
        int i, j, k; //声明三个整型变量
        //从1~100的范围中选择：
        j = rand.nextInt(100) + 1; //生成一个1~100的随机整数
        System.out.println("j = " + j);
        k = rand.nextInt(100) + 1;  //生成一个1~100的随机整数
        System.out.println("k = " + k);
        i = j + k;  //加法
        System.out.println("j + k = " + i);  //输出结果
        i = j - k;  //减法
        System.out.println("j - k = " + i);
        i = k / j;  //除法
        System.out.println("k / j = " + i);
        i = k * j;    //乘法
        System.out.println("k * j = " + i);
        i = k % j;   //取余
        System.out.println("k % j = " + i);
        j %= k;   //取余赋值
        System.out.println("j %= k = " + j);
        //单精度浮点数（float）测试：
        float u, v, w; //同样适用于双精度浮点数（double）
        v = rand.nextFloat();//生成一个0.0~1.0的随机浮点数
        System.out.println("v = " + v);
        w = rand.nextFloat();
        System.out.println("w = " + w);
        u = v + w;
        System.out.println("v + w = " + u);
        u = v - w;
        System.out.println("v - w = " + u);
        u = v * w;
        System.out.println("v * w = " + u);
        u = v / w;
        System.out.println("v / w = " + u);
        //以下对char、byte、short、int、long和double都适用
        u += v;
        System.out.println("u += v = " + u);
        u -= v;
        System.out.println("u -= v = " + u);
        u *= v;
        System.out.println("u *= v = " + u);
        u /= v;
        System.out.println("u /= v = " + u);
    }
}