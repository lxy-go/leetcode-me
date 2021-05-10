package com.leetcode.geek.linkedlist;

import com.leetcode.base.Node;

/**
 * 链表算法学习2
 *
 * @author lixiyan
 * @date 2021/5/10 10:20 AM
 */
public class LinkedListAlgo2 {

    private static Node reverse(Node head){
        Node cur = head;
        Node pre = null;
        while(cur !=null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    private static boolean checkCircle(Node l1){
        Node fast = l1;
        Node slow = l1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
    /**
     * 合并两个有序链表-递归版
     */
    private static Node mergeTwoList(Node l1,Node l2){
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        // l1小
        if (l1.val < l2.val){
            l1.next = mergeTwoList(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoList(l1,l2.next);
            return l2;
        }
//        return
    }

    /**
     * 合并两个有序链表-循环版
     */
    private static Node mergeTwoList2(Node l1,Node l2){
        Node solider = new Node(0);
        Node pre = solider;
        while(l1 !=null && l2 !=null){
            if (l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1 == null){
            pre.next = l2;
        }
        if (l2 == null){
            pre.next = l1;
        }
        return solider.next;

    }


    private static Node deleteKth(Node l1,int k){
        int i=1;
        Node fast = l1;
        while (fast != null && i <k){
            fast = fast.next;
            i++;
        }
        if (fast == null){return null;}
        Node slow = l1;
        Node pre = null;
        while (fast.next !=null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre == null){
            return l1.next;
        }else {
            pre.next = pre.next.next;
        }
        return l1;

    }



    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(3);
        l1.add(5);
        Node l2 = new Node(2);
        l2.add(4);
        l2.add(6);
//        mergeTwoList(l1,l2).print();
//        mergeTwoList2(l1,l2).print();
//        l1.next = l1;
//        reverse(l1).print();
//        System.out.println(checkCircle(l1));
        deleteKth(l1,1).print();
    }
}
