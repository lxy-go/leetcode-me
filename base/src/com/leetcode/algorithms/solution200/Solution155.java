package com.leetcode.algorithms.solution200;

import java.util.Stack;

/**
 * 最小值栈
 *
 * https://leetcode-cn.com/problems/min-stack/description/
 * @author lixiyan
 * @date 2021/5/20 10:55 AM
 */
public class Solution155 {

    static class MinStack {
        private Stack<Integer> dataStack;
        private Stack<Integer> minStack;
        private int min;

        public MinStack(){
            dataStack = new Stack<>();
            minStack = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x){
            dataStack.push(x);
            min = Math.min(x,min);
            minStack.push(min);
        }

        public void pop(){
            dataStack.pop();
            minStack.pop();
            min = minStack.isEmpty()?Integer.MAX_VALUE:minStack.peek();
        }

        public int top(){
            return dataStack.peek();
        }
        public int getMin(){
            return minStack.peek();
        }

    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(4);
        minStack.push(2);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
