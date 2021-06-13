package com.leetcode.interview.bytedancer;

import com.leetcode.base.TreeNode;

/**
 * 两个节点哪个是父节点或者其父节点
 *
 *
 * @author lixiyan
 * @date 2021/6/10 10:19 AM
 */
public class Solution004 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left == null && right == null){
            return null;
        }
        if (left == null){return right;}
        if (right == null){
            return left;
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
