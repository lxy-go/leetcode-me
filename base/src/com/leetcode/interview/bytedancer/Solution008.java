package com.leetcode.interview.bytedancer;

/**
 * 根节点到叶子节点为N路径
 *
 * https://leetcode-cn.com/problems/path-sum/
 * @author lixiyan
 * @date 2021/6/10 7:25 PM
 */
public class Solution008 {

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null){
            return targetSum == root.val;
        }
        return hasPathSum(root.left,targetSum-root.val)|| hasPathSum(root.right,targetSum-root.val);
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
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(3);
        int targetSum = 3;
        System.out.println(hasPathSum(tree, targetSum));
    }
}
