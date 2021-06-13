package com.leetcode.interview.bytedancer;

/**
 * 有序找目标值
 *
 * @author lixiyan
 * @date 2021/6/11 5:30 PM
 */
public class Solution018 {

    /**
     * 二分法
     */
    private static int find(int[] nums,int target){
        int l = 0;
        int h = nums.length-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                h = mid -1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        int target = 3;
        System.out.println(find(nums, target));
    }
}
