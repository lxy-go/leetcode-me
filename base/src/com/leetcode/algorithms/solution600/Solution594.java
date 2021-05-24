package com.leetcode.algorithms.solution600;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长和谐序列
 * <p>
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/description/
 *
 * @author lixiyan
 * @date 2021/5/24 10:52 AM
 */
public class Solution594 {

    /**
     * hash表
     */
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ret = 0;
        for (Integer n : map.keySet()) {
            if (map.containsKey(n + 1)) {
                ret = Math.max(ret,map.get(n)+map.getOrDefault(n+1,0));

            }
        }
        return ret;

    }

    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1,1,1,1}));
    }
}
