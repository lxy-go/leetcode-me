package com.leetcode.algorithms.solution500;

/**
 * 数字转换为十六进制数
 *
 * https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/
 * @author lixiyan
 * @date 2021/5/16 4:50 PM
 */
public class Solution405 {
    /**
     * 数学：16进制转化
     */
    public static  String toHex(int num) {
        char[] chars = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb.append(chars[num & 15]);
            num >>>=4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }

}
