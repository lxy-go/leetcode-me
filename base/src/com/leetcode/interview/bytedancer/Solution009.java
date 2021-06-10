package com.leetcode.interview.bytedancer;

/**
 * 两个链表存在交点，找这个交点
 *
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/
 * @author lixiyan
 * @date 2021/6/10 7:35 PM
 */
public class Solution009 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }

      void print(){
          System.out.print(val);
          System.out.print("->");
          if (next != null){
              this.next.print();
          }else {
              System.out.println("null");
          }
      }
  }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode l1 = headA,l2 = headB;
       while(l1 !=l2){
           l1 = (l1 == null)?headB:l1.next;
           l2 = (l2 == null)?headA:l2.next;
       }
       return l1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);


        ListNode l2 = new ListNode(4);


        ListNode l3 = new ListNode(7);
        l3.next =  new ListNode(8);
        l3.next.next =  new ListNode(9);

        l1.next = l3;
        l2.next = l3;



        getIntersectionNode(l1,l2).print();
    }
}
