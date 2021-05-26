package com.leetcode.algorithms.solution300;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串同构
 * <p>
 * https://leetcode-cn.com/problems/isomorphic-strings/description/
 *
 * @author lixiyan
 * @date 2021/5/26 8:30 PM
 */
public class Solution205 {

    /**
     * 哈希表
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if ((m1.containsKey(x) && m1.get(x) != y) || (m2.containsKey(y) && m2.get(y) != x) ) {
                return false;
            }
            m1.put(x,y);
            m2.put(y,x);

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("title", "paper"));
    }
}
