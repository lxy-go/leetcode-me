package com.leetcode.interview.re;

import com.leetcode.base.Node;

/**
 * 链表反转
 *
 * @author lixiyan
 * @date 2021/6/16 1:28 PM
 */
public class Solution014 {

    private static Node reverse(Node head){
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
        Node l1 = new Node(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        reverse(l1).print();
    }
}
