package com.leetcode.interview.re;

import com.leetcode.base.Node;

/**
 * 两个链表存在交点，找这个交点
 *
 * @author lixiyan
 * @date 2021/6/16 12:55 PM
 */
public class Solution009 {
    private static Node getIntersectionNode(Node headA, Node headB) {
        Node l1 = headA;
        Node l2 = headB;
        while(l1!= l2){
            l1 = l1==null?headB:l1.next;
            l2 = l2==null?headA:l2.next;
        }
        return l1;
    }
}
