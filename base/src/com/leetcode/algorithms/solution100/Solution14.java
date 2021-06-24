package com.leetcode.algorithms.solution100;

/**
 * 最长公共前缀
 */
public class Solution14 {
    /**
     * 指针
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String ans = strs[0];
        for(int i=1;i<strs.length;i++){
            int j =0;
            for(;j<ans.length() && j<strs[i].length();j++){
                if (ans.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            if("".equals(ans)){
                return "";
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow3","fla"};
        System.out.println(longestCommonPrefix(strs));
    }
}
