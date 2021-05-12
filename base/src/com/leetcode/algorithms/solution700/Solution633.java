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
    public static boolean judgeSquareSum(int c) {
        int i =0 ;
        int j =(int)Math.sqrt(c);
        while(i < j){
          long sum = i*i + j*j;
          if(sum == c){
              return true;
          }else if(sum > c){
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
