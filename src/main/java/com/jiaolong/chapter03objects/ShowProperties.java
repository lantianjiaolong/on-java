package com.jiaolong.chapter03objects;

/**
 * @author: Jiaolong
 * @ClassName: ShowProperties
 * @file: ShowProperties.java
 * @description
 * @date: 2024/6/17 下午10:41
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out); // 列出系统的所有属性
        System.out.println(System.getProperty("user.name")); // 获取当前用户的用户名
        System.out.println(System.getProperty("java.library.path"));// 获取java的库路径
    }
}
