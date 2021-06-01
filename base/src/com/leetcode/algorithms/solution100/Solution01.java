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
        if (nums == null || nums.length <2){
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int i = target - num;
            if (map.containsKey(i) && map.get(i) == num){
                return new int[]{i,num};
            }else {
                map.put(num,i);
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
