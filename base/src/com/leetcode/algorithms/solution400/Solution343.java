package com.leetcode.algorithms.solution400;

/**
 * 整数拆分
 *
 * https://leetcode-cn.com/problems/integer-break/description/
 * @author lixiyan
 * @date 2021/4/25 4:54 PM
 */
public class Solution343 {
    /**
     * 将 i 拆分成 j 和 i−j 的和，且 i-j 不再拆分成多个正整数，此时的乘积是 j*(i-j)
     * 将 i 拆分成 j 和 i−j 的和，且 i-j 继续拆分成多个正整数，此时的乘积是 j*dp(i-j)
     * 结果Max(j*(i-j),j*dp(i-j))
     */
    public static int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                dp[i] = Math.max(dp[i],Math.max(j*dp[i-j],j * (i - j)));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
