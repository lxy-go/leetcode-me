package com.leetcode.algorithms.solution200;

/**
 * 判断链表是否存在环
 * <p>
 * https://leetcode-cn.com/problems/linked-list-cycle/description/
 *
 * @author lixiyan
 * @date 2021/5/4 8:16 AM
 */
public class Solution141 {

    /**
     * 链表，双指针
     */
    public static  boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
