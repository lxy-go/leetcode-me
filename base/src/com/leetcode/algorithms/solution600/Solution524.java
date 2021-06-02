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
    private static String findLongestWord(String s, List<String> d) {
       String longestWord = "";

        for (String target : d) {
            int l1 = longestWord.length();
            int l2 = target.length();
            // 如果公共字符比target大，这个target排除
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }
            if(isSubStr(target,longestWord)){
                longestWord = target;
            }
        }
        return longestWord;
    }

    private static boolean isSubStr(String s,String target){
        int i =0;
        int j = 0;
        while(i < s.length() && j< target.length()){
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
