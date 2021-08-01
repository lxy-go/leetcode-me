package com.leetcode.algorithms.solution700;

/**
 * 平方数之和
 *
 * https://leetcode-cn.com/problems/sum-of-square-numbers/description/
 * @author lixiyan
 * @date 2021/5/8 5:52 PM
 */
public class Solution633 {
    /**
     * 双指针
     */
    public static boolean judgeSquareSum(int target) {

        int i =0;
        int j = (int)Math.sqrt(target);
        while (i <= j){
            int powerSum = i*i + j*j;
            if (powerSum == target){
                return true;
            }else if(powerSum > target){
                j--;
            }else {
                i++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
}
