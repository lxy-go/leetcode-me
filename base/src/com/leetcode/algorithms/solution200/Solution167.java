package com.leetcode.algorithms.solution200;

/**
 * 两数之和 II - 输入有序数组
 *
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * @author lixiyan
 * @date 2021/5/8 5:26 PM
 */
public class Solution167 {
    /**
     * 双指针
     */
    private static int[] twoSum(int[] numbers, int target) {
        int i =0;
        int j=numbers.length-1;
        while(i < j){
          int sum= numbers[i] +numbers[j];
          if (sum == target){
              return new int[]{i+1,j+1};
          }else if(sum > target){
              j--;
          }else {
              i++;
          }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,7,9};
        int target = 9;
        for (int i : twoSum(numbers, target)) {
            System.out.println(i);
        }

    }
}
