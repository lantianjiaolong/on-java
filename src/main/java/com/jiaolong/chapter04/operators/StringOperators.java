package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: StringOperators
 * @file: StringOperators.java
 * @description 字符串操作符+和+=
 * @date: 2024/6/23 上午12:21
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        //将 x 转为字符串
        System.out.println(x + " " + s);
        s += "(summed) = "; //拼接操作符
        System.out.println(s + (x + y + z));
        //Integer.toString()方法可以将int类型转换为字符串 简化版：
        System.out.println("" + x);
    }
}