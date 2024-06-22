package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Overflow
 * @file: Overflow.java
 * @description 惊讶吧！Java允许溢出
 * @date: 2024/6/23 上午1:15
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}