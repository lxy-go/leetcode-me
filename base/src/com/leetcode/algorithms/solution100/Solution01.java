package com.leetcode.algorithms.solution100;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 * @author lixiyan
 * @date 2021/5/5 7:48 AM
 */
public class Solution01 {

    /**
     * Hash法
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <2){return null;}
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target-nums[i];
            if (map.containsKey(num)){
                return new int[]{i,map.get(num)};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int target = 3;
        int[] ints = twoSum(arr, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
