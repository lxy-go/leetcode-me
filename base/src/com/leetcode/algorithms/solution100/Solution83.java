package com.leetcode.algorithms.solution100;

import com.leetcode.base.Node;

/**
 * 删除链表重复元素
 * <p>
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 *
 * @author lixiyan
 * @date 2021/4/16 11:17 AM
 */
public class Solution83 {

    public static Node deleteDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(3);
        l1.add(3);
        l1.add(5);
        deleteDuplicates(l1).print();
    }
}
