package com.leetcode.algorithms.solution600;

/**
 * 有序数组的 Single Element
 * <p>
 * https://leetcode-cn.com/problems/single-element-in-a-sorted-array/description/
 *
 * @author lixiyan
 * @date 2021/5/14 10:39 AM
 */
public class Solution540 {

    /**
     * 二分法
     */
    public static int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;

        while (l < h) {
            int mid = l+(h-l)/2;
            if (mid %2==1){
                mid--;
            }
            if (nums[mid] == nums[mid+1]){
                l = mid+2;
            }else {
                h = mid;
            }
        }
        return nums[l];

    }

    public static void main(String[] args) {
//        [3,3,7,7,10,11,11]
//        [1,1,2,3,3]
        int[] a = new int[]{1, 1, 2, 2, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(a));
    }


}
