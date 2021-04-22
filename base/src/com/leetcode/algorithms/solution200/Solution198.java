package com.leetcode.algorithms.solution200;

/**
 * 强盗抢劫
 *
 * https://leetcode-cn.com/problems/house-robber/description/
 * @author lixiyan
 * @date 2021/4/22 3:22 PM
 */
public class Solution198 {

    /**
     * 状态转移方程：dp[i] = Max(dp[i-2]+num[i],dp[i-1])
     */
    private static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }

    /**
     * 状态转移方程：dp[i] = Max(dp[i-2]+num[i],dp[i-1])
     * 优化空间，滚动数组
     */
    private static int rob2(int[] nums) {

        int p1 = 0,p2 =0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(p2+nums[i],p1);
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        int rob = rob2(arr);
        System.out.println(rob);

    }
}
