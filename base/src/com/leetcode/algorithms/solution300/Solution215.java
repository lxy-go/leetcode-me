package com.leetcode.algorithms.solution300;

import java.util.Arrays;

/**
 * 数组中的第K个最大元素

 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/description/
 * @author lixiyan
 * @date 2021/4/28 6:04 PM
 */
public class Solution215 {
    /**
     * 排序
     */
    private  static int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;

        while (true){
            int index = partition(nums,left,right);
            if (index == k-1){
                return nums[index];
            }else if(index > k-1){
                right = index-1;
            }else {
                left = index+1;
            }

        }


    }

    private static int partition(int[] nums, int left, int right) {
        int i = left;
        int pivot = nums[right];
        for (int j = left; j < right; j++) {
            if (nums[j] > pivot){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,right);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }


    public static void main(String[] args) {
        int[] a = new int[]{3,1,4,5,2};
        System.out.println(findKthLargest(a, 1));
    }

}
