package com.leetcode.algorithms.solution700;

import java.util.Arrays;

/**
 * 三个数的最大乘积
 *
 * https://leetcode-cn.com/problems/maximum-product-of-three-numbers/description/
 * @author lixiyan
 * @date 2021/5/18 5:18 PM
 */
public class Solution628 {

    /**
     * 数学：小学数学题-Max(求最大3个,负数最小*负数第二小*最大)
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5};
        System.out.println(maximumProduct(arr));
    }
}
