package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: Assignment
 * @file: Assignment.java
 * @description 使用对象赋值还是有点棘(ji)手
 * @date: 2024/6/17 下午11:01
 */
public class Assignment {  // 赋值类
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level = " + t1.level + ", t2.level = " + t2.level);
        t1 = t2; // 对象赋值
        System.out.println("2: t1.level = " + t1.level + ", t2.level = " + t2.level);
        t2.level = 27;
        System.out.println("3: t1.level = " + t1.level + ", t2.level = " + t2.level);
    }
}

class Tank { // 坦克类
    int level; // 坦克等级
}