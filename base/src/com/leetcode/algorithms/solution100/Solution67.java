package com.leetcode.algorithms.solution100;

/**
 * 二进制加法
 *
 * @author lixiyan
 * @date 2021/5/17 4:29 PM
 */
public class Solution67 {

    /**
     * 数学：二进制拆分，类似俩链表相加
     * a:1001
     * b:0101
     * r:1110
     */
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carray=0;
        for (int i = a.length()-1,j=b.length()-1; i >=0 || j>=0 ; i--,j--) {
            int anum = i >=0?a.charAt(i)-'0':0;
            int bnum = j >=0?b.charAt(j)-'0':0;

            int sum = (anum+bnum)%2+carray;
            carray = (anum+bnum)/2;
            sb.append(sum);

        }
        String ret = carray==1?"1"+sb.reverse().toString():sb.reverse().toString();
        return ret;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));


    }

}
