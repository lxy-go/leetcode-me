package com.leetcode.algorithms.solution600;

import java.util.Arrays;

/**
 * 字符串的排列
 *
 * https://leetcode-cn.com/problems/permutation-in-string/
 */
public class Solution567 {
    /**
     * 字符串：滑动窗口
     */
    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        // 存储列表
        for (int i = 0; i < l1; i++) {
            ++arr1[s1.charAt(i)-'a'];
        }
        for (int i = 0; i < l2; i++) {
            if (i >= l1){
                --arr2[s2.charAt(i-l1)-'a'];
            }
            ++arr2[s2.charAt(i)-'a'];
            if (Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "sbca"));
    }
}
