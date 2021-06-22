package com.leetcode.algorithms.solution100;

import com.leetcode.base.Node;

/**
 * 链表相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/
 * @author lixiyan
 * @date 2021/5/11 7:41 PM
 */
public class Solution02 {
    /**
     * 链表
     */
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node result = new Node(0);
        Node cur = result;
        int carray = 0;
        // 保证跑完链表，不够的用0补充
        while(l1 != null || l2 !=null){
            int x = l1 == null?0:l1.val;
            int y = l2 == null?0:l2.val;
            int sum = x+y+carray;
            carray = sum/10;
            int num = sum % 10;
            cur.next = new Node(num);
            cur = cur.next;
            if (l1 != null){
                l1= l1.next;
            }
            if (l2 !=null){
                l2= l2.next;
            }
        }
        // 证明最后一位有进位
        if (carray == 1){
            cur.next = new Node(1);
        }
        return result.next;
    }

    /**
     * 1 -> 3 -> 5
     */
    public static void main(String[] args) {
        Node l1 = new Node(8);
        l1.add(3);
        l1.add(5);
        l1.print();
        Node l2 = new Node(2);
        l2.add(4);
        l2.add(5);
        l2.print();

        addTwoNumbers(l1,l2).print();

    }
}
