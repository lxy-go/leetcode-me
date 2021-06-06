package com.leetcode.algorithms.solution100;

/**
 * 爬楼梯
 *
 * https://leetcode-cn.com/problems/climbing-stairs/description/
 * @author lixiyan
 * @date 2021/4/22 3:01 PM
 */
public class Solution70 {

    /**
     * 动态规划，从上到下
     *
     * 状态转移公式 dp[i] = dp[i-1]+dp[i-2];
     */
    private static int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    /**
     * 优化空间
     * p1:上一步 p2下一步，tmp当前步
     */
    private static int climbStairs2(int n) {
        if(n <= 2){
            return n;
        }
        int p1 = 1,p2 =2;
        for (int i = 2; i <= n; i++) {
            int tmp = p2+p1;
            p1 = p2;
            p2 = tmp;
        }
        return p1;
    }

    public static void main(String[] args) {
        int i = climbStairs2(4);
        System.out.println(i);
    }
}
