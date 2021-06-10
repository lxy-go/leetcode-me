package com.leetcode.interview.bytedancer;

/**
 * 驼峰命名转化
 *
 * https://blog.csdn.net/qq_28468707/article/details/102807961
 * LeetCode leet_code
 * leetHTTPCode leet_http_code
 * @author lixiyan
 * @date 2021/6/8 10:55 AM
 */
public class Solutiion001 {

    /**
     * 1.当前大写，前面小写 加_
     * 2.当前大写，前面大写，后面小写 加_
     * 3.小写直接添加
     */
    private static String camelName(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

            // 如果是小写，直接添加
            if (Character.isLowerCase(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            // 如果是大写
            else{
                // 第一位和最后一位是大写
                if(i==0 || i==n-1){
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }else {
                    // 前一个小写
                    if(Character.isLowerCase(s.charAt(i-1))){
                        sb.append("_").append(Character.toLowerCase(s.charAt(i)));
                    }
                    else if(Character.isUpperCase(s.charAt(i-1)) && Character.isLowerCase(s.charAt(i+1))){
                        sb.append("_").append(Character.toLowerCase(s.charAt(i)));
                    }
                    else {
                        sb.append(Character.toLowerCase(s.charAt(i)));
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelName("LeetCode"));
    }
}
