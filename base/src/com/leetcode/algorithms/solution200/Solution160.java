package com.leetcode.algorithms.solution200;

import com.leetcode.base.Node;

/**
 * 160 相交链表
 *
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/
 * @author lixiyan
 * @date 2021/4/16 9:51 AM
 */
public class Solution160 {

    private static Node getIntersectionNode(Node headA,Node headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Node l1 = headA, l2 = headB;

        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(2);

        Node l2 = new Node(5);
        l2.add(6);

        Node l3 = new Node(9);
        l3.add(10);
        l3.add(11);

        l1.next.next = l3;
        l2.next.next = l3;

        l1.print();
        l2.print();
        getIntersectionNode(l1,l2).print();

    }

}
