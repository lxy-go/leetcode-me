package com.leetcode.algorithms.solution500;

/**
 * 数组中等差递增子区间的个数
 *
 * @author lixiyan
 * @date 2021/4/25 4:24 PM
 */
public class Solution413 {


    /**
     * A[i] - A[i-1] == A[i-1] - A[i-2]，那么 [A[i-2], A[i-1], A[i]] 构成一个等差递增子区间。而且在以 A[i-1] 为结尾的递增子区间的后面再加上一个 A[i]，一样可以构成新的递增子区间。
     *
     * dp[2] = 1
     [0, 1, 2]
     dp[3] = dp[2] + 1 = 2
     [0, 1, 2, 3], // [0, 1, 2] 之后加一个 3
     [1, 2, 3]     // 新的递增子区间
     dp[4] = dp[3] + 1 = 3
     [0, 1, 2, 3, 4], // [0, 1, 2, 3] 之后加一个 4
     [1, 2, 3, 4],    // [1, 2, 3] 之后加一个 4
     [2, 3, 4]        // 新的递增子区间
     */
    public static int numberOfArithmeticSlices(int[] A) {
        if (A == null && A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i-1]+1;
            }
        }
        int total = 0;
        for (int i : dp) {
            total+=i;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,3,4};
        System.out.println(numberOfArithmeticSlices(a));
    }
}
