package com.leetcode.algorithms.solution500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 按照字符出现次数对字符串排序
 *
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/description/
 * @author lixiyan
 * @date 2021/5/13 11:21 AM
 */
public class Solution451 {

    /**
     * 桶排序
     */
    public static String frequencySort(String s) {
        Map<Character,Integer> frequenceNum = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequenceNum.put(c,frequenceNum.getOrDefault(c,0)+1);
        }
        List<Character>[] buckets = new ArrayList[s.length()+1];
        for (Character c : frequenceNum.keySet()) {
            Integer frequence = frequenceNum.get(c);
            if (buckets[frequence] == null){
                buckets[frequence] = new ArrayList<>();
            }
            buckets[frequence].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length-1; i>=0; i--) {
            if (buckets[i] == null){
                continue;
            }
            for (Character c : buckets[i]) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();


    }

    public static void main(String[] args) {
        String s = "aaccccd";
        System.out.println(frequencySort(s));
    }
}
