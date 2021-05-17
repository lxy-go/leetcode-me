package com.leetcode.algorithms.solution500;

import java.util.Arrays;

/**
 * 改变数组元素使所有的数组元素都相等
 *
 * @author lixiyan
 * @date 2021/5/17 8:04 PM
 */
public class Solution462 {
    /**
     * 数学：中位数
     */
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int move=0;
        int l=0,h=nums.length-1;
        while (l<=h){
            move +=nums[h]-nums[l];
            l++;
            h--;
        }
        return move;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(minMoves2(arr));

    }
}
