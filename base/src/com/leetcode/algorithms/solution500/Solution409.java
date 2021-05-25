package com.leetcode.algorithms.solution500;

/**
 * 计算一组字符集合可以组成的回文字符串的最大长度
 *
 * https://leetcode-cn.com/problems/longest-palindrome/description/
 * @author lixiyan
 * @date 2021/5/25 2:37 PM
 */
public class Solution409 {

    /**
     * 字符串
     */
    public static int longestPalindrome(String s) {
        int[] cnts = new int[256];
        char[] chars = s.toCharArray();

        for (char c : chars) {
            cnts[c]++;
        }

        int ans = 0;
        for (int cnt : cnts) {
            ans += (cnt/2)*2;
        }
        if (ans<s.length()){
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
