package com.leetcode.item.linkedlist;

import com.leetcode.base.Node;

/**
 * 链表算法
 * <p>
 * 1.链表反转
 * 2.链表检测环
 * 3.有序链表合并
 * 4.删除链表倒数第K个节点
 *
 * @author lixiyan
 * @date 2021/4/14 10:24 AM
 */
public class LinkedListAlgo {

    /**
     * 反转链表
     */
    private static Node reverse(Node l1) {
        Node curr = l1;
        Node pre = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 链表检测环
     */
    private static Boolean checkCircle(Node l1) {
        if (l1 != null || l1.next == null) {
            return false;
        }
        Node fast = l1.next;
        Node slow = l1;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 合并两个有序链表 （递归）
     */
    private static Node mergeTwoList(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }

    /**
     * 合并两个有序链表 （非递归）
     */
    private static Node mergeTwoList2(Node l1, Node l2) {
        Node solider = new Node(0);
        Node pre = solider;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre = l1;
                l1 = l1.next;
            } else {
                pre = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }

        if (l1 == null) {
            pre.next = l2;
        }
        if (l2 == null) {
            pre.next = l1;
        }
        return solider.next;
    }


    /**
     * 删除倒数第K个元素
     */
    private static Node deleteKth(Node l1, int k) {
        int i = 1;
        Node fast = l1;
        while (fast != null && i < k) {
            fast = fast.next;
            i++;
        }

        if (fast == null) {
            return null;
        }

        Node pre = null;
        Node slow = l1;
        while (fast.next != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre == null) {
            return l1.next;
        } else {
            pre.next = pre.next.next;
        }
        return l1;
    }


    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);

        Node l2 = new Node(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);

//        reverse(l1).print();

//        System.out.println(checkCircle(l1));

//        mergeTwoList(l1,l2).print();

        deleteKth(l1,2).print();
    }
}
