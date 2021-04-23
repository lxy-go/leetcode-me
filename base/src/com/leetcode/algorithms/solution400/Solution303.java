package com.leetcode.algorithms.solution400;

/**
 * 数组区间和
 *
 * https://leetcode-cn.com/problems/range-sum-query-immutable/description/
 * @author lixiyan
 * @date 2021/4/23 5:02 PM
 */
public class Solution303 {
    private int[] sums;

    public Solution303(int[] nums){
        sums = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sums[i+1] = sums[i]+nums[i];

        }
    }

    public int sumRange(int i,int j){
        return sums[j+1]-sums[i];
    }

}
