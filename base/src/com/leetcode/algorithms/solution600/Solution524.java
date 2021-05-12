package com.leetcode.algorithms.solution600;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长子序列
 * <p>
 * https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/description/
 *
 * @author lixiyan
 * @date 2021/5/12 10:58 AM
 */
public class Solution524 {

    /**
     * 双指针，判断是否为子序列
     */
    public static String findLongestWord(String s, List<String> d) {
        // 最长字符串
        String lw = "";

        for (String target : d) {
            int i = lw.length();
            int j = target.length();
            if (i > j || (i == j && lw.compareTo(target) < 0)) {
                continue;
            }
            if (isSubStr(s, target)) {
                lw = target;
            }
        }
        return lw;
    }

    /**
     * 是否为子字符串
     */
    private static boolean isSubStr(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public static void main(String[] args) {
        String s = "abpcplea";

        List<String> d = new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        System.out.println(findLongestWord(s, d));
    }
}
