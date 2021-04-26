package com.leetcode.algorithms.solution100;

/**
 * x 的平方根
 *
 * @author lixiyan
 * @date 2021/4/26 3:10 PM
 */
public class Solution69 {

    public static int mySqrt(int x) {
        int l=1,h=x;
        while(l <= h){
            int mid = l+ (h-l)/2;
            int sqrt = x/mid;
            if (mid == sqrt){
                return mid;
            }else if(mid > sqrt){
                h = mid-1;
            }else {
                l=mid+1;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int a = mySqrt(8);
        System.out.println(a);
    }
}
