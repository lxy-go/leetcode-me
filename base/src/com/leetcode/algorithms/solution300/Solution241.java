package com.leetcode.algorithms.solution300;

import java.util.ArrayList;
import java.util.List;

/**
 * 给表达式加括号
 * <p>
 * https://leetcode-cn.com/problems/different-ways-to-add-parentheses/description/
 *
 * @author lixiyan
 * @date 2021/5/14 11:43 AM
 */
public class Solution241 {

    /**
     * 分治：
     */
    private static List<Integer> diffWaysToCompute(String input) {
        List<Integer> ways = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        switch (c) {
                            case '+':
                                ways.add(l + r);
                                break;
                            case '-':
                                ways.add(l - r);
                                break;
                            case '*':
                                ways.add(l * r);
                                break;
                        }
                    }
                }
            }
        }
        if (ways.size() == 0) {
            ways.add(Integer.valueOf(input));
        }
        return ways;
    }

    public static void main(String[] args) {
        String s = "2-1+1";
        System.out.println(diffWaysToCompute(s));
    }
}
