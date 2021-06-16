package com.leetcode.interview.re;

import com.leetcode.base.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度遍历最大深度
 *
 * @author lixiyan
 * @date 2021/6/16 1:05 PM
 */
public class Sulution011 {

    public static int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        while (!queue.isEmpty()){
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null){
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.offer(treeNode.right);
                }
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left =  new TreeNode(2);
        treeNode.right =  new TreeNode(3);
        treeNode.left.left =  new TreeNode(4);
        System.out.println(maxDepth(treeNode));
    }
}
