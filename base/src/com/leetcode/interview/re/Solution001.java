package com.leetcode.interview.re;

/**
 * 驼峰命名转换
 *
 * @author lixiyan
 * @date 2021/6/16 10:08 AM
 */
public class Solution001 {

    /**
     * 驼峰命名转化
     * leetCode --> leet_code
     * leetHTTPCode --> leet_http_code
     */
    private static String camelName(String s){
         int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // 如果是小写就直接添加
            if (Character.isLowerCase(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            // 大写的情况
            else {
               // 1.首位是的大写，直接转为小写
               if(i== 0 || i == n-1){
                   sb.append(Character.toLowerCase(s.charAt(i)));
               } else {
                   // 中间位置的大写，分两种情况，加_和不加_
                   // _ 1.前面是小写 或者 2.后面是小写
                   if(Character.isLowerCase(s.charAt(i-1)) || Character.isLowerCase(s.charAt(i+1))){
                       sb.append("_").append(Character.toLowerCase(s.charAt(i)));
                   }else {
                       sb.append(Character.toLowerCase(s.charAt(i)));
                   }
               }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelName("LeetCode"));
        System.out.println(camelName("LeetHTTPCode"));
    }
}
