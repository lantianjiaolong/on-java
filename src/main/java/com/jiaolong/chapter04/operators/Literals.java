package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Literals
 * @file: Literals.java
 * @description 字面量
 * @date: 2024/6/22 下午11:11
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // 101111// 十六进制（小写）
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // 101111// 十六进制（大写）
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // 255// 八进制（前置0）
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; //char类型的最大十六进制值
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; //byte类型的最大十六进制值
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; //short类型的最大十六进制值
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // 200L 后缀L表示long类型
        long n2 = 200l; // 200l 后缀l表示long类型(很容易让人困惑)
        long n3 = 200; // 200 自动转为int类型
        //Java 7的二进制字面量：
        byte blb = (byte)0b00110101; // 53
        System.out.println("blb: " + Integer.toBinaryString(blb));
        short bls = (short)0B0010111110101111; // -1131
        System.out.println("bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111; // -1131
        System.out.println("bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111; // -1131
        System.out.println("bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F; //后缀F表示float类型
        float f3 = 1f; //后缀f表示float类型
        double d1 = 1d; //后缀d表示double类型
        double d2 = 1D; //后缀D表示double类型
        //（十六进制和八进制也都能作为long类型使用，但是不推荐）
    }
}