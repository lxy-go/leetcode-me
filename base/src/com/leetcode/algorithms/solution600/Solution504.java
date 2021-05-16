package com.leetcode.algorithms.solution600;

import javafx.beans.binding.StringBinding;

/**
 * 10进制转7进制
 *
 * https://leetcode-cn.com/problems/base-7/description/
 * @author lixiyan
 * @date 2021/5/16 3:31 PM
 */
public class Solution504 {
    /**
     * 数学，7进制转化
     * 例如 100 % 7 【3】
     *      14 % 7 【2】
     *      【2】
     *   所以100的7进制是223
     *   反过来 求223的10进制  3*1 + 2*7 + 2*7*7 =100
     */
    public static String convertToBase7(int num) {
        if (num ==0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        boolean isNev = num<0;
        if (isNev){
            num = num*-1;
        }
        while (num>0){
            res.append(num%7);
            num = num/7;
        }
        String s = res.reverse().toString();
        return isNev?"-"+s:s;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(10));
    }
}
