package com.jiaolong.chapter05.control;

/**
 * @author: Jiaolong
 * @ClassName: CommaOperator
 * @file: CommaOperator.java
 * @description 逗号操作符
 * @date: 2024/6/23 上午1:44
 */
public class CommaOperator {
    public static void main(String[] args) {
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2){
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}