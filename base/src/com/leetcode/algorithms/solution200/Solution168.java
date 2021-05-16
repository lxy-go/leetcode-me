package com.leetcode.algorithms.solution200;

/**
 * Excel表列名称
 *
 * https://leetcode-cn.com/problems/excel-sheet-column-title/solution/
 * @author lixiyan
 * @date 2021/5/16 5:18 PM
 */
public class Solution168 {
    /**
     * 数学 26进制
     */
    public static String convertToTitle(int columnNumber) {
        if (columnNumber == 0){
            return "";
        }
        columnNumber--;
        return convertToTitle(columnNumber/26)+ (char)(columnNumber%26+'A');

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }
}
