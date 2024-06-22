package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: CastingNumbers
 * @file: CastingNumbers.java
 * @description 将float或double转型为整型值时会发生什么？
 * @date: 2024/6/23 上午12:34
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above = " + (int)above);
        System.out.println("(int)below = " + (int)below);
        System.out.println("(int)fabove = " + (int)fabove);
        System.out.println("(int)fbelow = " + (int)fbelow);
    }
}