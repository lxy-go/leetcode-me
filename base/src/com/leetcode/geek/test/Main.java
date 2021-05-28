package com.leetcode.geek.test;

import com.leetcode.geek.array.MyArray;

/**
 * 测试主函数
 *
 * @author lixiyan
 * @date 2021/4/15 8:36 PM
 */
public class Main {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("12345");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }
}
