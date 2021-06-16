package com.leetcode.interview.re;

import com.leetcode.base.Node;

/**
 * 奇数升序，偶数降序
 *
 * @author lixiyan
 * @date 2021/6/16 11:17 AM
 */
public class Solution006 {
    /**
     * 主函数
     */
    private static Node sortOddEvenList(Node head) {
        Node[] nodes = getLists(head);
        // 偶数降序
        Node l1 = reverse(nodes[1]);
        Node l2 = nodes[0];
        // 合并两个链表
        return mergeTwoList(l1, l2);
    }

    /**
     * 获取链表列表
     */
    private static Node[] getLists(Node head) {
        Node head1 = null;
        Node head2 = null;
        Node cur1 = null;
        Node cur2 = null;
        int count = 1;
        while (head != null) {
            if (count % 2 == 1) {
                if (cur1 == null) {
                    cur1 = head;
                    head1 = cur1;
                } else {
                    cur1.next = head;
                    cur1 = cur1.next;
                }
            } else {
                if (cur2 == null) {
                    cur2 = head;
                    head2 = cur2;
                } else {
                    cur2.next = head;
                    cur2 = cur2.next;
                }
            }

            head = head.next;
            count++;
        }
        // 跳出循环，让最后两个末尾元素都指向下一个null
        if (cur1 != null) {
            cur1.next = null;
        }
        if (cur2 != null) {
            cur2.next = null;
        }
        return new Node[]{head1, head2};
    }


    private static Node reverse(Node head) {
        Node cur = head;
        Node pre = null;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

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

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(8);
        l1.add(3);
        l1.add(6);
        l1.add(5);
        l1.add(4);
        l1.add(7);
        l1.add(2);
        l1.add(9);
        sortOddEvenList(l1).print();

    }
}
