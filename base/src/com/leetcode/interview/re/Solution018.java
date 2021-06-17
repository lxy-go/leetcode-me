package com.leetcode.interview.re;

/**
 * 有序数组查找目标值
 *
 * @author lixiyan
 * @date 2021/6/16 2:03 PM
 */
public class Solution018 {

    private static int find(int[] a,int target){
        int l =0;
        int h = a.length-1;
        while (l<h){
            int mid = l+(h-l)/2;
            if (a[mid] > target){
                h = mid-1;
            }else {
                l = mid+1;
            }
        }
        return l;
    }
}
