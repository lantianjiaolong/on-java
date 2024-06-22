package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Underscores
 * @file: Underscores.java
 * @description 字面量里的下划线
 * @date: 2024/6/22 下午11:35
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);     //[1]
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }
}