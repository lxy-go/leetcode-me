package com.leetcode.algorithms.solution300;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断数组是否含有重复元素
 *
 * https://leetcode-cn.com/problems/contains-duplicate/
 * @author lixiyan
 * @date 2021/5/22 9:18 PM
 */
public class Solution217 {
    /**
     * Hash法
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 1, 3}));
    }

}
