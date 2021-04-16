package com.leetcode.algorithms.solution100;

import com.leetcode.base.Node;

/**
 * 24 交换两两链表的值
 *
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/
 * @author lixiyan
 * @date 2021/4/16 2:13 PM
 */
public class Solution24 {

    private static Node swapPairs(Node head){

        if (head == null || head.next ==null){
            return head;
        }

        Node next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        swapPairs(l1).print();
    }
}
