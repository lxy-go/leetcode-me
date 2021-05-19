package com.leetcode.algorithms.solution300;

import java.util.Stack;

/**
 * 用栈实现队列
 *
 * 两个栈，倒过来
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/description/
 * @author lixiyan
 * @date 2021/5/19 4:53 PM
 */
public class Solution232 {

    static class MyQueue {
        private Stack<Integer> in = new Stack<>();
        private Stack<Integer> out = new Stack<>();

        // 入栈
        public void push(int x){
            in.push(x);
        }
        // 出栈
        public int pop(){
            in2out();
            return out.pop();
        }
        // 出栈不删除
        public int peek(){
            in2out();
            return out.peek();
        }

        //最重要一步
        private void in2out(){
            // 判断out是为了后面push的元素，不会到栈顶
            if (out.isEmpty()){
                while (!in.isEmpty()){
                    System.out.println("---"+in.peek());
                    out.push(in.pop());
                }
            }
        }

        public boolean empty(){
            return in.isEmpty() && out.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.pop());
        myQueue.push(4);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());



    }
}
