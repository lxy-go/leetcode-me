package com.leetcode.algorithms.solution300;

/**
 * 移动零
 *
 * https://leetcode-cn.com/problems/move-zeroes/
 * @author lixiyan
 * @date 2021/4/20 5:20 PM
 */
public class Solution283 {

    /**
     * 移动o
     */
    public static void moveZeroes(int[] nums) {
        int i =0;
        for (int num : nums) {
            if (num != 0){
                nums[i++] = num;
            }
        }

        while(i < nums.length){
            nums[i++]=0;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,0,3,0};

        moveZeroes(a);
        for (int i : a) {
            System.out.print(i);
            System.out.print(",");
        }
    }
}
