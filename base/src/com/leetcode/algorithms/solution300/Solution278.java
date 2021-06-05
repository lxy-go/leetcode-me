package com.leetcode.algorithms.solution300;

/**
 * 278 第一个错误版本
 *
 * @author lixiyan
 * @date 2021/4/27 7:57 PM
 */
public class Solution278 {

    /**
     * 二分查找 ,上下界特殊处理
     */
    public static int firstBadVersion(int n) {
        int  l = 0;
        int h = n;
        while(l < h){
            int mid = l+(h-l)/2;
            if(isBadVersion(mid)){
                h = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

    public static boolean isBadVersion(int n){
        return n>=3;
    }
    public static void main(String[] args) {
        System.out.println(firstBadVersion(6));
    }

}
