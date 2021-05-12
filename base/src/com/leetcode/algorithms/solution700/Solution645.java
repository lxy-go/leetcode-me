package com.leetcode.algorithms.solution700;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 找出重复的数和丢失的数
 * <p>
 * https://leetcode-cn.com/problems/set-mismatch/description/
 *
 * @author lixiyan
 * @date 2021/4/21 4:37 PM
 */
public class Solution645 {
    public static int[] findErrorNums(int[] nums) {
        // 排位
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }

        return null;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 4};
        for (int i : findErrorNums(a)) {
            System.out.println(i);
        }
//        for (int i : a) {
//            System.out.println(i);
//
//        }
    }
}
