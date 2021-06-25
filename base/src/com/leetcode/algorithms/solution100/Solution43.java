package com.leetcode.algorithms.solution100;

/**
 * 43. 字符串相乘
 *
 * https://leetcode-cn.com/problems/multiply-strings/
 */
public class Solution43 {

    /**
     * 字符串：纵向加速
     */
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int m = num1.length(),n = num2.length();
        int[] ansArr = new int[m+n];
        for (int i = m-1; i >= 0 ; i--) {
            int x = num1.charAt(i)-'0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j)-'0';
                ansArr[i+j+1] += x*y;
            }
        }
        for (int i = m+n-1; i >0 ; i--) {
            ansArr[i-1]  += ansArr[i]/10;
            ansArr[i] %= 10;
        }
        int index = ansArr[0] == 0?1:0;
        StringBuilder ans = new StringBuilder();
        while(index < m + n){
            ans.append(ansArr[index]);
            index++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("12", "3"));
    }
}
