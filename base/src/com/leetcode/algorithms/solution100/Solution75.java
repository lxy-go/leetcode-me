package com.leetcode.algorithms.solution100;

/**
 * 荷兰国旗问题
 * <p>
 * https://leetcode-cn.com/problems/sort-colors/description/
 *
 * @author lixiyan
 * @date 2021/5/13 7:25 PM
 */
public class Solution75 {

    /**
     * 排序
     * [0,zero)  zero = 0
     * [zero,i)  i=0
     * [one,two) two = length
     */
    private static void sortColors(int[] nums) {
        int zero = 0,i=0,two=nums.length;
        while(i<two){
            if (nums[i] == 0){
                two--;
                swap(nums,i,two);

            }else if(nums[i] == 1){
                i++;
            }else {

                swap(nums,zero,i);
                zero++;
                i++;
            }
        }
    }

    private static void swap(int[] nums,int i,int j){
        int a = nums[i];
        nums[i] =nums[j];
        nums[j] = a;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 2, 1};
        sortColors(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
