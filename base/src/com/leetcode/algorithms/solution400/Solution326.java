package com.leetcode.algorithms.solution400;

/**
 * 3的n次方
 *
 * https://leetcode-cn.com/problems/power-of-three/description/
 * @author lixiyan
 * @date 2021/5/18 3:02 PM
 */
public class Solution326 {
    /**
     * 数学：求3次方
     * 整数限制
     */
    public static boolean isPowerOfThree(int n) {
        if (n < 1){
            return false;
        }
        while(n%3==0){
            n /=3;
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }
}
