package com.leetcode.algorithms.solution300;

import com.leetcode.base.Node;

/**
 * 回文链表
 *
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 * @author lixiyan
 * @date 2021/4/19 4:46 PM
 */
public class Solution234 {

    /**
     * 是否是回文字符串
     */
    private static boolean isPalindrome(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null&& fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 后半段，偶数节点，后移一位
        if (fast != null){
            slow = slow.next;
        }
        // 前半段
        cut(head,slow);
        return isEqual(head,reverse(slow));
    }
    /**
     * 链表切分
     */
    private static void cut(Node head,Node cut){
        while (head.next != cut){
            head = head.next;
        }
        head.next = null;
    }
    /**
     * 反转链表
     */
    private static Node reverse(Node head){
        Node curr = head;
        Node pre = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    private static boolean isEqual(Node l1,Node l2){
        while(l1 != null && l2 != null){
            if (l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(3);
        l1.add(1);
        l1.add(2);

        l1.print();

        System.out.println(isPalindrome(l1));

    }
}
