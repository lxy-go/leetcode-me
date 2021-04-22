package com.leetcode.algorithms.solution100;

/**
 * 最小路径和
 *
 * https://leetcode-cn.com/problems/minimum-path-sum/
 * @author lixiyan
 * @date 2021/4/22 8:25 PM
 */
public class Solution64 {

    private static int minPathSum(int[][] grid) {
        if(grid == null ){
            return 0;
        }
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0; i <grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0){
                    dp[0][0] = grid[0][0];
                }else if(i == 0){
                    dp[0][j] = dp[0][j-1]+grid[0][j];
                }else if(j == 0){
                    dp[i][0] = dp[i-1][0]+grid[i][0];
                }else{
                    dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];

    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int i = minPathSum(nums);
        System.out.println(i);
    }
}
