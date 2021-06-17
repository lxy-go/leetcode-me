package com.leetcode.algorithms.Solution1000;

import java.util.Arrays;

/**
 * 三角形最大周长
 *
 * @author lixiyan
 * @date 2021/6/17 4:02 PM
 */
public class Solution976 {

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 2 ; i--) {
            if (nums[i-2]+nums[i-1] > nums[i]){
                return nums[i-2]+nums[i-1] + nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,5};
        System.out.println(largestPerimeter(nums));
    }
}
