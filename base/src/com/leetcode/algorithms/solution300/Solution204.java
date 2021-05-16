package com.leetcode.algorithms.solution300;

/**
 * 生成素数序列
 * https://leetcode-cn.com/problems/count-primes/description/
 * @author lixiyan
 * @date 2021/5/16 9:38 AM
 */
public class Solution204 {
    /**
     * 数学
     */
    public static int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if(isPrimes(i)){
                ans+=1;
            }
        }
        return ans;
    }
    private static boolean isPrimes(int nums){
        for (int i = 2; i*i < nums; i++) {
            if (nums%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(8));
    }
}
