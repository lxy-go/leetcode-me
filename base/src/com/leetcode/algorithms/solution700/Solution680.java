package com.leetcode.algorithms.solution700;

/**
 * 回文字符串
 *
 * https://leetcode-cn.com/problems/valid-palindrome-ii/description/
 * @author lixiyan
 * @date 2021/5/3 6:48 AM
 */
public class Solution680 {

    /**
     * 回文字符串
     */
    public static boolean validPalindrome(String s) {
        for (int i = 0, j =s.length()-1; i<j;i++,j--) {
            if (s.charAt(i) != s.charAt(j)){
                return isPalindrome(s,i-1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(validPalindrome(s));
    }
}
