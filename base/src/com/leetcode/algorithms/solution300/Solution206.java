package com.leetcode.algorithms.solution300;

import com.leetcode.base.Node;

/**
 * 链表反转
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 * @author lixiyan
 * @date 2021/4/16 10:43 AM
 */
public class Solution206 {

    /**
     * 链表,反向移位
     */
    private static Node reverseList(Node head){
        if (head == null){
            return null;
        }
        Node cur = head;
        Node pre = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node l1 = new Node(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.print();
        reverseList(l1).print();
    }
}
