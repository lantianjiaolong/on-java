package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: AutoInc
 * @file: AutoInc.java
 * @description 自动递增和自动递减
 * @date: 2024/6/17 下午11:47
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i);// 前缀递增：先递增再输出
        System.out.println("i++: " + i++);// 后缀递增：先输出再递增
        System.out.println("i: " + i);
        System.out.println("--i: " + --i);// 前缀递减：先递减再输出
        System.out.println("i--: " + i--);// 后缀递减：先输出再递减
        System.out.println("i: " + i);
    }
}