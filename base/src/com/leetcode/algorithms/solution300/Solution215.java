package com.leetcode.algorithms.solution300;

import java.util.Arrays;

/**
 * 数组中的第K个最大元素

 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/description/
 * @author lixiyan
 * @date 2021/4/28 6:04 PM
 */
public class Solution215 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        if (k>0 && k <= nums.length){
            return nums[k - 1];
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{3,1,4};
        System.out.println(findKthLargest(a, 2));
    }

}
