package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: PassObject
 * @file: PassObject.java
 * @description 给方法传递对象，可能并不是你所理解的那样
 * @date: 2024/6/17 下午11:15
 */
public class PassObject { // 定义一个类PassObject
    static void f(Letter y){ // 定义一个方法f，参数为Letter类型
        y.c = 'z'; // 修改y的c属性
    }
    public static void main(String[] args) { // 主函数
        Letter x = new Letter(); // 创建一个Letter对象x
        x.c = 'a'; // 修改x的c属性
        System.out.println("1: x.c = " + x.c);// 输出x的c属性
        f(x);  // 传递对象x到方法f中生成一个新的对象y，并修改y的c属性
        System.out.println("2: x.c = " + x.c);
    }
}

class Letter {// 定义一个类
    char c; // 定义一个char类型的变量c
}