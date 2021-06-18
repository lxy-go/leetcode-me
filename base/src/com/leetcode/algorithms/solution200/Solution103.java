package com.leetcode.algorithms.solution200;

import com.leetcode.base.TreeNode;

import java.util.*;

/**
 * 二叉树的锯齿形层序遍历
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 *
 * @author lixiyan
 * @date 2021/6/8 11:29 AM
 */
public class Solution103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        boolean isOrderLeft = false;
        nodeQueue.offer(root);

        while (!nodeQueue.isEmpty()){
            Deque<Integer> levelList = new LinkedList<>();
            final int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
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


    public class TreeNode {
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
