package com.leetcode.interview.bytedancer;

/**
 * 归并两个有序数组
 *
 * https://leetcode.com/problems/merge-sorted-array/description/
 * @author lixiyan
 * @date 2021/6/11 4:49 PM
 */
public class Solution017 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int indexMerge = m+n-1;
        while(index2 >=0){
            if(index1<0){
                nums1[indexMerge--] = nums1[index2--];
            }else if(nums1[index1] > nums2[index2]){
                nums1[indexMerge--] = nums1[index1--];
            }else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        merge(num1,3,num2,3);
        for (int i : num1) {
            System.out.println(i);
        }
    }
}
