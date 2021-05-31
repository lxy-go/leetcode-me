package com.leetcode.algorithms.solution500;

/**
 * 统计两个数的二进制表示有多少位不同
 *
 * https://leetcode-cn.com/problems/hamming-distance/
 * @author lixiyan
 * @date 2021/5/31 4:30 PM
 */
public class Solution461 {

    /**
     * 位操作
     */
    public static int hammingDistance(int x, int y) {
        int s = x ^ y,ret=0;
        while(s!=0){
            ret +=s&1;
            s >>= 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        int i = hammingDistance(2, 3);
        System.out.println(i);
    }
}
