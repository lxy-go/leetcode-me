package com.leetcode.algorithms.solution200;

import com.leetcode.base.TreeNode;

/**
 *  二叉树的最大深度
 *
 * https://leetcode-cn.com/problems/balanced-binary-tree/solution/
 * @author lixiyan
 * @date 2021/6/21 4:28 PM
 */
public class Solution110 {
    public static boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private static int recur(TreeNode root){
        if (root == null){return 0;}
        int left = recur(root.left);
        if (left != -1){return -1;}
        int right = recur(root.right);
        if (right == -1){return -1;}
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        System.out.println(isBalanced(root));
    }
}
