package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: DoubleEquivalence
 * @file: DoubleEquivalence.java
 * @description 比较浮点数是否相等以及不同的相等比较问题
 * @date: 2024/6/18 上午12:25
 */
public class DoubleEquivalence {
    public static void main(String[] args) {
        test(0, Double.MIN_VALUE);
        System.out.println("----------------------");
        test(Double.MAX_VALUE, Double.MAX_VALUE - Double.MIN_VALUE * 1_000_000);
    }

    @SuppressWarnings("deprecation")
    public static void test(double x1, double x2) {
        //x1.equals(x2) //无法编译
        System.out.printf("%e==%e %b%n", x1, x2, x1 == x2);
        Double d1 = x1;
        Double d2 = x2;
        show("Automatic", d1, d2);
        //已弃用的方法
        Double r1 = new Double(x1);
        Double r2 = new Double(x2);
        show("new Double()", r1, r2);
        //新方法
        Double v1 = Double.valueOf(x1);
        Double v2 = Double.valueOf(x2);
        show("Double.valueOf()", v1, v2);
    }

    static void show(String desc, Double n1, Double n2) {
        System.out.println(desc + ":");
        System.out.printf("%e==%e %b %b%n", n1, n2, n1.equals(n2), n1 == n2);
    }

}