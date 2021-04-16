package com.leetcode.algorithms.solution100;

import com.leetcode.base.Node;

/**
 * 合并两个有序链表
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 * @author lixiyan
 * @date 2021/4/16 10:51 AM
 */
public class Solution21 {
    /**
     * 合并两个有序链表(非递归)
     */
    private static Node mergeTwoList(Node l1,Node l2){
        Node solider = new Node(0);
        Node pre = solider;

        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1 == null){pre.next = l2;}
        if (l2 == null){pre.next = l1;}

        return solider.next;
    }

    /**
     * 合并两个有序链表(递归)
     */
    private static Node mergeTwoList2(Node l1,Node l2){
        if (l1 == null){return l2;}
        if (l2 == null){return l1;}
        if (l1.val < l2.val){
            l1.next = mergeTwoList(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoList(l1,l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(3);
        l1.add(5);

        Node l2 = new Node(2);
        l2.add(4);
        l2.add(6);

        mergeTwoList2(l1,l2).print();

    }

}
