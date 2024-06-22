package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: TernaryIfElse
 * @file: TernaryIfElse.java
 * @description 三元操作符
 * @date: 2024/6/23 上午12:16
 */
public class TernaryIfElse {
    static int ternary(int i){
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i){
        if(i < 10){
            return i * 100;
        }else{
            return i * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
