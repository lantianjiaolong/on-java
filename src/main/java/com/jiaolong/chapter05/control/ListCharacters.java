package com.jiaolong.chapter05.control;

/**
 * @author: Jiaolong
 * @ClassName: ListCharacters
 * @file: ListCharacters.java
 * @description 迭代语句-展示所有小写ASCII字母
 * @date: 2024/6/23 上午1:39
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c + " character: " + c);
    }
}