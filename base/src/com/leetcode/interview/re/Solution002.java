package com.leetcode.interview.re;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树s打印
 *
 * @author lixiyan
 * @date 2021/6/16 10:20 AM
 */
public class Solution002 {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        // 定义一个存储树的队列
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        // 方向
        boolean isOrderLeft = true;
        while(!nodeQueue.isEmpty()){
            // 双端决定顺序，约等于栈加队列
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();

            for (int i = 0; i < size; i++) {
                // 获取当前队列
                final TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft){
                    levelList.offerLast(curNode.val);
                }else {
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null){
                    nodeQueue.offer(curNode.left);
                }
                if (curNode.right != null){
                    nodeQueue.offer(curNode.right);
                }
            }
            ans.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return ans;

    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }



}
