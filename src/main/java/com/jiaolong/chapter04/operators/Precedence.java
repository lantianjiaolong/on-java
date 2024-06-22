package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Precedence
 * @file: Precedence.java
 * @description 操作符-优先级
 * @date: 2024/6/17 下午10:55
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2)/(2 + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}