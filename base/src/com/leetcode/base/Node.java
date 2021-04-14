package com.leetcode.base;

/**
 * 链表
 *
 * @author lixiyan
 * @date 2021/4/14 10:25 AM
 */
public class Node {

    public Node next;
    public int val;

    public Node(int val) {
        this.val = val;
    }

    public void add(int input){
        Node newNode = new Node(input);
        if (next == null){
            this.next = newNode;
        }else {
            this.next.add(input);
        }
    }

    public void print(){
        System.out.print(val);
        System.out.print("-->");
        if (this.next != null){
            this.next.print();
        }else {
            System.out.print("null");
        }
    }
}
