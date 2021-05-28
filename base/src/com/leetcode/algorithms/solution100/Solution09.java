package com.leetcode.algorithms.solution100;

/**
 * 判断一个整数是否是回文数
 *
 * https://leetcode-cn.com/problems/palindrome-number/description/
 * @author lixiyan
 * @date 2021/5/28 11:39 AM
 */
public class Solution09 {

    public static boolean isPalindrome(int x) {
        if (x ==0 ){
            return true;
        }
        if (x < 0 || x % 10 ==0){
            return false;
        }
        int right = 0;
        // 反转整数
        while(x > right){
            right = right*10 +x%10;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
    }
}
