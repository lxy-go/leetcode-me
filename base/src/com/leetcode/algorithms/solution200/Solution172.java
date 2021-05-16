package com.leetcode.algorithms.solution200;

/**
 * 计算阶乘后有几个0
 *
 * https://leetcode-cn.com/problems/factorial-trailing-zeroes/solution/
 * @author lixiyan
 * @date 2021/5/16 5:36 PM
 */
public class Solution172 {
    /**
     * 数学：末尾有0代表是2*5，2肯定比5多，所以判断几个5
     * 最终 5 的个数就是 n / 5 + n / 25 + n / 125 ...

     写程序的话，如果直接按照上边的式子计算，分母可能会造成溢出。所以算 n / 25 的时候，我们先把 n 更新，n = n / 5，然后再计算 n / 5 即可。后边的同理。
     */
    public static int trailingZeroes(int n) {
        int count = 0;
        while(n > 0 ){
            n /=5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(100));

    }
}
