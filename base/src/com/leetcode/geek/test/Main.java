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
        MyArray<Integer> arr = new MyArray<>();
        // 增加数据
        for (int i = 0; i < 9; i++) {
            arr.add(i);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(arr.get(i));
        }

    }
}
