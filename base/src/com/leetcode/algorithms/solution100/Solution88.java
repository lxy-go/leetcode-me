package com.leetcode.algorithms.solution100;

/**
 *  归并两个有序数组
 *
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 * @author lixiyan
 * @date 2021/5/2 5:33 AM
 */
public class Solution88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int indexMerge = n+m-1;
        while(index2 >=0){
            if(index1<0){
                nums1[indexMerge--] =  nums2[index2--];
            }else if(index2 <0){
                nums1[indexMerge--] = nums1[index1--];
            }else if(nums1[index1] > nums2[index2]){
                nums1[indexMerge--] = nums1[index1--];
            }else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,3,4};
        merge(num1,3,num2,num2.length);
        for (int i : num1) {
            System.out.println(i);
        }

    }
}
