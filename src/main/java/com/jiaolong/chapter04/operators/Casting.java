package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Casting
 * @file: Casting.java
 * @description 类型转换操作符
 * @date: 2024/6/23 上午12:29
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i; // 自动类型转换 宽化，因此不需要强制类型转换
        long lng2 = (long)200; // 直接赋值，不需要强制类型转换
        lng2 = 200; // 自动类型转换 宽化，因此不需要强制类型转换
        //一个窄化转型
        i = (int) lng2; // 窄化转型，需要强制类型转换
    }
}