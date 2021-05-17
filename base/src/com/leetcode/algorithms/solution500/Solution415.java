package com.leetcode.algorithms.solution500;

/**
 * 字符串相加
 *
 * https://leetcode-cn.com/problems/add-strings/description/
 * @author lixiyan
 * @date 2021/5/17 7:19 PM
 */
public class Solution415 {
    /**
     * 数学
     */
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carray = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int x = i >=0?num1.charAt(i)-'0':0;
            int y = j >=0?num2.charAt(j)-'0':0;
            int sum = (x+y+carray)%10;
            carray = (x+y+carray)/10;
            sb.append(sum);
        }
        return carray==1?"1"+sb.reverse().toString():sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("123", "23"));
    }

}
