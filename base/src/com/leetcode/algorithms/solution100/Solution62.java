package com.leetcode.algorithms.solution100;

/**
 * 矩阵的总路径数
 * <p>
 * https://leetcode-cn.com/problems/unique-paths/description/
 *
 * @author lixiyan
 * @date 2021/4/23 11:00 AM
 */
public class Solution62 {


    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {

        int i = uniquePaths(2, 2);
        System.out.println(i);

    }
}
