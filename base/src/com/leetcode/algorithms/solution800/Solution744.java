package com.leetcode.algorithms.solution800;

/**
 * 寻找比目标字母大的最小字母
 *
 * https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/description/
 * @author lixiyan
 * @date 2021/4/26 3:57 PM
 */
public class Solution744 {
    /**
     * 二分
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int l =0;
        int h = n-1;
        while(l <=h){
            int mid = l+(h-l)/2;
            if(letters[mid] > target){
                h = mid -1;
            }else {
                l = mid+1;
            }
        }
        return l < n?letters[l]:letters[0];
    }

    public static void main(String[] args) {
        char[] a = new char[]{'a','d','e'};
        char target ='e';
        System.out.println(nextGreatestLetter(a, target));
    }
}
