package com.jiaolong.chapter04.operators;

/**
 * @author: Jiaolong
 * @ClassName: EqualsMethod
 * @file: EqualsMethod.java
 * @description 默认的equals()方法并不是比较内容的
 * @date: 2024/6/22 下午10:41
 */
public class EqualsMethod {
    public static void main(String[] args){
        ValA va1 = new ValA();
        ValA va2 = new ValA();
        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2)); // true
        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        vb1.i = vb2.i = 100;
        System.out.println(vb1.equals(vb2)); // false
    }
}

class ValA {
    int i;
}

class ValB {
    int i;
    //对这个示例是适用的，但这里并不是一个完整的equals()方法
    @Override
    public boolean equals(Object o) {
        /*if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final ValB other = (ValB) o;
        if (this.i != other.i) {
            return false;
        }
        return true; */
        ValB rval = (ValB) o;//将对象o转换为ValB类型
        return i == rval.i;
    }
}
