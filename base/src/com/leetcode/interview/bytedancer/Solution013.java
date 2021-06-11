package com.leetcode.interview.bytedancer;

/**
 * 链表反转
 *
 * @author lixiyan
 * @date 2021/6/9 7:20 PM
 */
public class Solution013 {

    /**
     * 链表,反向移位
     */
    private static ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode pre = null;
        while(current != null){
            ListNode next =current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);

        reverseList(l1).print();
    }
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }

      void print(){
          System.out.print(val);
          System.out.print("->");
          if (next != null){
              System.out.print(next.val);
          }else {
              System.out.println("null");
          }
      }
  }

}
