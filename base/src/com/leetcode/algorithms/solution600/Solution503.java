package com.leetcode.algorithms.solution600;

import java.util.Arrays;
import java.util.Stack;

/**
 * 循环数组中比当前元素大的下一个元素
 *
 * https://leetcode-cn.com/problems/next-greater-element-ii/
 * @author lixiyan
 * @date 2021/5/21 5:52 PM
 */
public class Solution503 {
    /**
     * 单调栈
     */
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> pre = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            // 保证循环取数
            int num = nums[i%n];

            while (!pre.isEmpty() && nums[pre.peek()] < num){
                next[pre.pop()] = num;
            }
            // 填充数组使用
            if ( i < n){
                pre.push(i);
            }
        }
        return next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        for (int i : nextGreaterElements(nums)) {
            System.out.println(i);
        }
    }
}
