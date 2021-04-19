package com.leetcode.algorithms.solution500;

import com.leetcode.base.Node;

import java.util.Stack;

/**
 * 链表求和
 * <p>
 * https://leetcode-cn.com/problems/add-two-numbers-ii/description/
 *
 * @author lixiyan
 * @date 2021/4/19 3:43 PM
 */
public class Solution445 {
    private static Node addTwoNumbers(Node l1, Node l2) {
        Stack<Integer> s1 = buildStack(l1);
        Stack<Integer> s2 = buildStack(l2);
        Node head = new Node(0);
        int carray = 0;
        // 用0替位
        while (!s1.isEmpty() || !s2.isEmpty() || carray != 0) {
            int x = s1.isEmpty() ? 0: s1.pop();
            int y = s2.isEmpty() ? 0: s2.pop();
            int sum = x+y+carray;
            carray = sum/10;
            Node pre = new Node(sum%10);
            pre.next = head.next;
            head.next = pre;
        }
        return head.next;
    }

    /**
     * 构建栈
     */
    private static Stack<Integer> buildStack(Node l) {
        Stack<Integer> stack = new Stack<>();
        // 顺序存入栈
        while (l != null) {
            stack.push(l.val);
            l = l.next;
        }
        return stack;
    }

    /**
     * l1: 1->3->5
     * l2: 8->6->5
     * 结果：1->1->0->0
     */
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(3);
        l1.add(5);

        Node l2 = new Node(8);
        l2.add(6);
        l2.add(5);

        addTwoNumbers(l1,l2).print();
    }
}


