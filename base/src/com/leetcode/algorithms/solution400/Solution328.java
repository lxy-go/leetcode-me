package com.leetcode.algorithms.solution400;

import com.leetcode.base.Node;

/**
 * 链表元素按奇偶聚集
 *
 * https://leetcode-cn.com/problems/odd-even-linked-list/description/
 * @author lixiyan
 * @date 2021/5/19 3:57 PM
 */
public class Solution328 {

    /**
     * 链表：奇偶
     */
    public static Node oddEvenList(Node head) {
        if (head ==null){
            return head;
        }
        Node odd = head,even = head.next,evenHead = even;
        while(even != null && even.next !=null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        oddEvenList(l1).print();
    }
}
