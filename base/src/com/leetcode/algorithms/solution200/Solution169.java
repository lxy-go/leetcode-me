package com.leetcode.algorithms.solution200;

/**
 * 多数元素
 *
 * https://leetcode-cn.com/problems/majority-element/
 * @author lixiyan
 * @date 2021/5/17 8:23 PM
 */
public class Solution169 {
    /**
     * 数学：摩尔投票
     */
    public static int majorityElement(int[] nums) {
        int count=1;
        int candNum=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (candNum == nums[i]){
                count++;
            }else if (--count==0){
                candNum = nums[i];
                count=1;
            }
        }
        return candNum;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,2,2,1}));
    }

}
