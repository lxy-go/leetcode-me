package com.leetcode.algorithms.solution100;

import java.util.Stack;

/**
 * 简化路径
 * https://leetcode-cn.com/problems/simplify-path/
 */
public class Solution71 {
    public static String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (!stack.isEmpty() && s[i].equals("..")){
                stack.pop();
            }else if(!s[i].equals("") && !s[i].equals(".") && !s[i].equals("..")){
                stack.push(s[i]);
            }
        }
        if (stack.isEmpty()){
            return "/";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            res.append("/"+stack.get(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("./home/"));

    }
}
