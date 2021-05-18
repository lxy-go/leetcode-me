package com.leetcode.algorithms.solution400;

/**
 * 平方数
 *
 *  可以暴力递归
 *  二分
 *  牛顿
 * https://leetcode-cn.com/problems/valid-perfect-square/description/
 * @author lixiyan
 * @date 2021/5/18 2:52 PM
 */
public class Solution367 {
    /**
     * 数学：平方和等差数列
     * 平方 1*1 2*2 3*3 4*4 5*5
     * 差值  1   3   5   7   9   11
     *
     */
    public static boolean isPerfectSquare(int num) {
        int subNum =1;
        while(num>0){
            num-=subNum;
            subNum+=2;
        }
        return num==0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
