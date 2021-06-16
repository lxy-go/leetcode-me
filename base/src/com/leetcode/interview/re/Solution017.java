package com.leetcode.interview.re;

/**
 * 合并两个有序数组
 *
 * @author lixiyan
 * @date 2021/6/16 1:17 PM
 */
public class Solution017 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int indexMerge = m+n-1;
        int[] arr = new int[indexMerge+1];
        while(index2>=0){
            if (index1 < 0){
                arr[indexMerge--] = nums1[index1--];
            }else if(nums1[index1] < nums2[index2]){
                arr[indexMerge--] = nums2[index2--];
            }else {
                arr[indexMerge--] = nums1[index1--];
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,8,15};
        int[] b = new int[]{2,4,6};
        int[] c = new int[]{2,4,6};
        int[] d = new int[]{2,4,6};
        final int[] merge = merge(a, 3, b, 3);
        for (int i : merge) {
            System.out.println(i);
        }
    }
}
