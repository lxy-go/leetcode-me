package com.leetcode.interview.re;

/**
 * 最长子数组和
 *
 * @author lixiyan
 * @date 2021/6/16 1:53 PM
 */
public class Solution016 {
    public static int findLength(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] dp = new int[n+1][m+1];
        int ans = 0;
        for (int i = n-1; i >=0; i--) {
            for (int j = m-1; j >=0 ; j--) {
                dp[i][j] = A[i] == B[j]?dp[i+1][j+1]+1:0;
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{9,2,3};
        System.out.println(findLength(a, b));
    }
}
