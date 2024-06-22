package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Exponents
 * @file: Exponents.java
 * @description 科学记数法-指数记数法
 * @date: 2024/6/22 下午11:43
 */

//e 表示 “times ten to the power of” 的简写，即 10 的幂次。
public class Exponents {
    public static void main(String[] args) {
        //e 大小写都可以，含义相同：
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; //d是可选的
        double expDouble2 = 47e47;  //默认就是double类型的
        System.out.println(expDouble);
    }
}