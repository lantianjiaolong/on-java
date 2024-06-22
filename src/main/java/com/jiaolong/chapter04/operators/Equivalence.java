package com.jiaolong.chapter04.operators;


/**
 * @author: Jiaolong
 * @ClassName: Equivalence
 * @file: Equivalence.java
 * @description 关系操作符-测试对象是否相等
 * @date: 2024/6/17 下午11:57
 */
public class Equivalence {
    public static void main(String[] args) {
        test(127);
        test(128);
    }

    static void show(String desc, Integer n1, Integer n2){
        System.out.println(desc + ":");
        System.out.printf("%d == %d: %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }

    @SuppressWarnings("deprecation")
    public static void test(int value) {
        Integer i1 = value;
        Integer i2 = value;
        show("Automatic", i1, i2);
        //在Java9及更新版本中已被弃用的旧方式：
        Integer r1 = new Integer(value);
        Integer r2 = new Integer(value);
        show("new Integer()", r1, r2);
        //Java9及更新版本中提倡的新方式：
        Integer v1 = Integer.valueOf(value);
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);
        //基本类型不能使用equals()方法，只能使用==或!=
        int x = value;
        int y = value;
        //x.equals(y) //编译错误//无法编译
        System.out.println("Primitive int:");
        System.out.printf("%d == %d %b%n", x, y, x == y);
    }
}