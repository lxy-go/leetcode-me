package com.leetcode.algorithms.solution100;

/**
 * 判断一个整数是否是回文数
 *
 * 所以这个解法的操作就是 取出后半段数字进行翻转。

 这里需要注意的一个点就是由于回文数的位数可奇可偶，所以当它的长度是偶数时，它对折过来应该是相等的；当它的长度是奇数时，那么它对折过来后，有一个的长度需要去掉一位数（除以 10 并取整）

 * https://leetcode-cn.com/problems/palindrome-number/description/
 * @author lixiyan
 * @date 2021/5/28 11:39 AM
 */
public class Solution09 {

    public static boolean isPalindrome(int x) {
        if (x ==0 ){
            return true;
        }
        if (x < 0 || x % 10 ==0){
            return false;
        }
        int right = 0;
        // 反转整数
        while(x > right){
            right = right*10 +x%10;
            x /= 10;
        }
        return x == right ||x == right/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
    }
}
