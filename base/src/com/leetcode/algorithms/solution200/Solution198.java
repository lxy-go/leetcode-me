package com.leetcode.algorithms.solution200;

/**
 * 强盗抢劫
 *
 * @author lixiyan
 * @date 2021/4/22 3:22 PM
 */
public class Solution198 {

    /**
     *
     * 状态转移方程：dp[i] = Max(dp[i-2]+num[i],dp[i-1])
     */
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 0; i < nums.length; i++) {

        }


    }

    public static void main(String[] args) {

    }
}
