package com.leetcode.algorithms.solution100;

/**
 * x 的平方根
 *
 * @author lixiyan
 * @date 2021/4/26 3:10 PM
 */
public class Solution69 {

    /**
     * 二分法
     */
    private static int mySqrt(int x) {
        if (x<=1){return x;}
       int l = 0;
       int h = x;
       while(l<=h){
           int mid = l+(h-l)/2;
           int sqrt = x/mid;
           // 开方数更大
           if(sqrt > mid){
               l = mid+1;
           }else if (sqrt<mid){
               h = mid-1;
           }else {
               return sqrt;
           }
       }
       return h;
    }

    public static void main(String[] args) {
        int a = mySqrt(1);
        System.out.println(a);
    }
}
