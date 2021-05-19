package com.leetcode.algorithms.solution300;

import java.util.Arrays;

/**
 * 除自身以外数组的乘积
 *
 * https://leetcode-cn.com/problems/product-of-array-except-self/
 * @author lixiyan
 * @date 2021/5/18 4:38 PM
 */
public class Solution238 {

    /**
     * 数学 两个三角
     * 1       num[1]  num[2]
     * num[0]   1      num[2]
     * num[0]  num[1]  1
     */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];
        Arrays.fill(products,1);
        int left = 1;
        for (int i = 1; i < n; i++) {
            left *= nums[i-1];
            products[i] = left;
        }
        int right=1;
        for (int i = n-2; i >=0 ; i--) {
            right *=nums[i+1];
            products[i] *= right;
        }
        return products;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        for (int i : productExceptSelf(arr)) {
            System.out.println(i);
        }
    }
}
