package com.leetcode.algorithms.solution300;

/**
 * 两个字符串包含的字符是否完全相同
 * <p>
 * https://leetcode-cn.com/problems/valid-anagram/description/
 *
 * @author lixiyan
 * @date 2021/5/7 8:55 PM
 */
public class Solution242 {

    /**
     * 数组
     */
    public static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (char sc : s.toCharArray()) {
            a[sc - 'a'] += 1;
        }
        for (char tc : t.toCharArray()) {
            a[tc - 'a'] -= 1;
        }
        for (int i : a) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cba"));
    }
}
