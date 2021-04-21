package com.leetcode.algorithms.solution500;

/**
 * 找出数组中最长的连续 1
 * <p>
 * https://leetcode-cn.com/problems/max-consecutive-ones/description/
 *
 * @author lixiyan
 * @date 2021/4/21 4:12 PM
 */
public class Solution485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, c = 0;
        for (int num : nums) {
            c = num == 1 ? c + 1 : 0;
            max = Math.max(max, c);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
