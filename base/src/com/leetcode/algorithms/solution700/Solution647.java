package com.leetcode.algorithms.solution700;

/**
 *
 * 回文子字符串个数
 *
 * https://leetcode-cn.com/problems/palindromic-substrings/description/
 *
 * @author lixiyan
 * @date 2021/5/27 7:03 PM
 */
public class Solution647 {

    private static int cnt = 0;
    /**
     * 字符串
     */
    public static int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            extendSubstrings(s,i,i);
            extendSubstrings(s,i,i+1);
        }
        return cnt;
    }

    private static void extendSubstrings(String s,int start,int end){
        while(start >=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
            cnt++;
        }
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
