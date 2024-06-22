package com.jiaolong.chapter05.control;

/**
 * @author: Jiaolong
 * @ClassName: WhileTest
 * @file: WhileTest.java
 * @description 迭代语句-演示while循环
 * @date: 2024/6/23 上午1:28
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;  // 随机生成0-1(包括0，但不包括1)之间的double型随机数，当随机数小于0.99时，返回true，否则返回false
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
}