package com.leetcode.algorithms.solution200;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长序列
 *
 * https://leetcode-cn.com/problems/longest-consecutive-sequence/
 * @author lixiyan
 * @date 2021/5/26 5:28 PM
 */
public class Solution128 {
    /**
     * 哈希
     */
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (Integer num : numSet) {
            if (!numSet.contains(num-1)){
                int currentNum = num;
                int current =1;

                while(numSet.contains(currentNum+1)){
                    current++;
                    currentNum++;
                }
                longest = Math.max(current,longest);
            }
        }
        return longest;

    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 4, 2}));
    }
}
