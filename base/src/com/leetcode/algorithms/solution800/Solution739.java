package com.leetcode.algorithms.solution800;

import java.util.Stack;

/**
 * 数组中元素与下一个比它大的元素之间的距离
 *
 * https://leetcode-cn.com/problems/daily-temperatures/description/
 * @author lixiyan
 * @date 2021/5/20 3:34 PM
 */
public class Solution739 {

    /**
     * 栈：递减栈
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] dist = new int[n];
        Stack<Integer> indexs = new Stack<>();
        for (int curIndex = 0; curIndex < n; curIndex++) {
            while (!indexs.isEmpty() && temperatures[curIndex] > temperatures[indexs.peek()]){
                int preIndex = indexs.pop();
                dist[preIndex] = curIndex-preIndex;
            }
            // 栈空，或者新来数据小于栈顶数据（栈顶取走继续比）
            indexs.push(curIndex);
        }
        return dist;
    }

    public static void main(String[] args) {
        int[] a = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        for (int i : dailyTemperatures(a)) {
            System.out.println(i);
        }
    }
}
