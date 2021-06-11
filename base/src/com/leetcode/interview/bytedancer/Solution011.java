package com.leetcode.interview.bytedancer;

import com.leetcode.base.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 层序遍历（BFS）- 二叉树的深度
 *
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 * @author lixiyan
 * @date 2021/6/11 11:01 AM
 */
public class Solution011 {

    /**
     * BFS
     */
    public static int maxDepth(TreeNode root) {
        if (root ==null){return 0;}
        List<TreeNode> queue = new LinkedList() {{ add(root); }}, tmp;
        int res = 0;
        while(!queue.isEmpty()){
            tmp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null){
                     tmp.add(node.left);
                }
                if (node.right != null){
                    tmp.add(node.right);
                }
            }
            queue = tmp;
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
