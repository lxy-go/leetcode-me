package com.leetcode.interview.re;

/**
 * 给一个矩阵，矩阵每一行单调递增，求矩阵第K个数
 *
 * @author lixiyan
 * @date 2021/6/16 1:31 PM
 */
public class Solution015 {

    public static int kthSmallest(int[][] matrix, int k) {
        final int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        while (left < right){
            int mid = left+(right-left)/2;
            if (check(matrix,mid,n,k)){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return left;

    }

    private static boolean check(int[][] matrix,int mid,int k,int n){
        int i = n-1;
        int j = 0;
        int num = 0;
        while (i>=0 & j<n){
            if (matrix[i][j] < mid){
                num +=i+1;
                j++;
            }else {
                i--;
            }
        }
        return num>=k;

    }
}
