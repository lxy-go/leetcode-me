package com.leetcode.algorithms.solution200;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 翻转字符串里的单词
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class Solution151 {

    public static String reverseWords(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ",wordList);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("this is a leetcode practice"));
    }
}
