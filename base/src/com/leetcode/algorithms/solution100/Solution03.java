package com.leetcode.algorithms.solution100;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * <p>
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author lixiyan
 * @date 2021/6/22 10:46 AM
 */
public class Solution03 {
    /**
     * 字符串：滑动窗口
     */
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);

            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
