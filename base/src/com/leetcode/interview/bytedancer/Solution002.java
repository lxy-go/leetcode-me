package com.leetcode.interview.bytedancer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的锯齿形层序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 * @author lixiyan
 * @date 2021/6/8 11:29 AM
 */
public class Solution002 {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if (root == null){
            return ans;
        }
        //队列实现BFS按层遍历
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.offer(root);
        //是否从左至右标志位
        boolean isOrderLeft = true;

        while(!nodeQueue.isEmpty()){
            //定义一个双端队列存储当前层的值，用双端队列是方便按层存值调换方向
            Deque<Integer> levelList = new LinkedList<Integer>();
            //获取当前层值的个数，用来一次遍历完该层
            int size = nodeQueue.size();
            //遍历队列中该层的值并出队，按标志位存入双端队列，再按固定顺序读取下一层节点值进队列
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft){
                    //存入顺序和读取下一层顺序一致
                    levelList.offerLast(curNode.val);
                }else {
                    //反向存入双端队列
                    levelList.offerFirst(curNode.val);
                }
                //读取下一层节点值进入队列(左至右)
                if (curNode.left != null){
                    nodeQueue.offer(curNode.left);
                }
                if (curNode.right != null){
                    nodeQueue.offer(curNode.right);
                }
            }
            ans.add(new LinkedList<Integer>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return ans;

    }



    public static class TreeNode {
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
        final TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        zigzagLevelOrder(root);
    }
}
