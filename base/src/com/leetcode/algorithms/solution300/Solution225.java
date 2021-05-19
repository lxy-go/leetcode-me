package com.leetcode.algorithms.solution300;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 *
 * https://leetcode-cn.com/problems/implement-stack-using-queues/description/
 * 队列 a -> b -> c
 * 当x进如队列，x 到队尾，a-b-c一次出队列，然后重新入队，a->b->c->x
 * @author lixiyan
 * @date 2021/5/19 7:54 PM
 */
public class Solution225 {
    // 队列
    static class MyStack {
        private Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x){
            queue.add(x);
            int cnt =queue.size();
            while (cnt-->1){
                queue.add(queue.poll());
            }
        }

        public int pop(){
            return queue.remove();
        }

        public int top(){
            return queue.peek();
        }

        public boolean empty(){
            return queue.isEmpty();
        }

    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}
