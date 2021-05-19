package com.leetcode.algorithms.solution800;

import com.leetcode.base.Node;

/**
 * 分隔链表
 *
 * https://leetcode-cn.com/problems/split-linked-list-in-parts/description/
 * @author lixiyan
 * @date 2021/5/19 2:35 PM
 */
public class Solution725 {

    /**
     * 链表：切数据
     */
    public static Node[] splitListToParts(Node root, int k) {
        Node cur1 = root;
        Node cur = root;
        // 1.计算链表长度
        int n =0;
        while(cur1 != null){
            cur1 = cur1.next;
            n++;
        }
        //2.计算分段
        int mod = n % k;
        int size = n / k;
        Node[] ret = new Node[k];
        for (int i = 0;cur !=null && i < k; i++) {
            ret[i] = cur;
            int div = size+(mod-->0?1:0);
            for (int j = 1; j < div; j++) {
                cur = cur.next;
            }
            Node next = cur.next;
            cur.next =null;
            cur = next;
        }
        return ret;

    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        Node[] nodes = splitListToParts(l1, 3);
        for (int i = 0; i < nodes.length; i++) {
            nodes[i].print();

        }

    }
}
