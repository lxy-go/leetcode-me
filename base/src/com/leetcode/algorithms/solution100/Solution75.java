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
     */
    private static void sortColors(int[] nums) {
        int zero = -1;
        int one = 0;
        int two = nums.length;

        while(one < two){
            if(nums[one] == 0){
                swap(nums,++zero,one++);
            }else if(nums[one] ==2){
                swap(nums,--two,one);
            }else{
                one++;
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
