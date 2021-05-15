package com.leetcode.algorithms.solution100;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @author lixiyan
 * @date 2021/5/14 11:43 AM
 */
public class Solution34 {

    /**
     * 二分查找：
     */
    public static int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums,target,true);
        int rightIndex = binarySearch(nums,target,false);
        if (leftIndex <=rightIndex && rightIndex<nums.length && nums[leftIndex]==target&& nums[rightIndex]==target){
            return new int[]{leftIndex,rightIndex};
        }
        return new int[]{-1,-1};
    }

    /**
     * 二分查找是否找最前和之后
     */
    public static int binarySearch(int[] nums,int target,boolean lower){
        int left =0,right = nums.length-1,ans = nums.length;
        while(left <= right){
            int mid = left+(right-left)/2;
            if (nums[mid] > target || (lower && nums[mid]>=target)){
                right = mid-1;
                ans = mid;
            }else {
                left = mid +1;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3};
        searchRange(nums,2);

    }
}
