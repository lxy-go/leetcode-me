package com.leetcode.algorithms.solution700;

public class Solution674 {
    /**
     * 数组
     */
    public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if (len <=1){
            return len;
        }
        int count =1;
        int ans = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] > nums[i]){
                count++;
            }else {
                count=1;
            }
            ans = Math.max(count, ans);
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 2, 5, 3}));
    }
}
