package com.leetcode.algorithms.solution100;

import java.util.Stack;

/**
 * 用栈实现括号匹配
 *
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 * @author lixiyan
 * @date 2021/5/20 11:10 AM
 */
public class Solution20 {
    /**
     * 栈
     */
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar =='(' || aChar =='[' || aChar=='{'){
                stack.push(aChar);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                boolean b1 = aChar==')' && stack.pop()!='(';
                boolean b2 = aChar==']' && stack.pop()!='[';
                boolean b3 = aChar=='}' && stack.pop()!='{';
                if (b1 || b2 || b3){
                    return false;
                }
            }
        }
        return true;
    }
    /*
     * 栈2
     */
    private static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar=='('){
                stack.push(')');
            }else if(aChar == '['){
                stack.push(']');
            }else if(aChar=='{'){
                stack.push('}');

            }
            // 如果右边符号进来，发现还是空的，直接false
            else if(stack.isEmpty() || stack.pop()!= aChar){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
