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
       int len = nums.length;
       int left = 0;
       int right = len-1;
       int target = len-k;

       while(true){
          int index = parition(nums,left,right);
          if (index == target){
              return nums[target];
          }else if(index < target){
              left = index+1;
          }else {
              right = index-1;
          }
       }

    }
    private static int parition(int[] nums,int left,int right){
        int pivot = nums[left];
        int j = left;
        for (int i = j+1; i <=right ; i++) {
            if (nums[i] < pivot){
                j++;
                swap(nums,i,j);
            }
        }
        swap(nums,j,left);
        return j;
    }

    private static void swap(int[] nums,int p ,int q){
        int tmp = nums[p];
        nums[p] = nums[q];
        nums[q] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,1,4,5,2};
        System.out.println(findKthLargest(a, 2));
    }

}
