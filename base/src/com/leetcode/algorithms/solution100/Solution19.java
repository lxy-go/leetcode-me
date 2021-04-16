package com.leetcode.algorithms.solution100;

import com.leetcode.base.Node;

/**
 * 删除倒数第K个元素
 *
 * @author lixiyan
 * @date 2021/4/16 11:31 AM
 */
public class Solution19 {

    private static Node removeNthFromEnd(Node head,int n){
        int i =1;
        Node fast = head;

        while(fast != null && i < n){
            fast = fast.next;
            i++;
        }
        if (fast == null) {return null;}
        Node slow = head;
        Node pre = null;
        while(fast.next != null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre == null){return head.next;}else {
            pre.next = pre.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        removeNthFromEnd(l1, 2).print();

    }
}
