package com.leetcode.interview.re;

import com.leetcode.base.TreeNode;

/**
 * 根节点到叶子节点为N路径
 *
 * @author lixiyan
 * @date 2021/6/16 12:48 PM
 */
public class Solution008 {

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right==null){
            return targetSum == root.val;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }

    public static void main(String[] args) {

    }

}
