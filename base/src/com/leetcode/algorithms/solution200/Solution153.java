package com.leetcode.algorithms.solution200;

/**
 * 寻找旋转排序数组中的最小值
 * <p>
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 * @author lixiyan
 * @date 2021/4/27 8:28 PM
 */
public class Solution153 {

    /**
     * 二分 初始值
     */
    private static int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] < nums[h]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {

        int[] a = new int[]{3, 4, 5, 1, 2};
        System.out.println(findMin(a));
    }
}
