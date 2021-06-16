package com.leetcode.interview.re;

import com.leetcode.base.TreeNode;

/**
 * 寻找公共父节点
 *
 * @author lixiyan
 * @date 2021/6/16 11:02 AM
 */
public class Solution004 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root ==q) {return root;}
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left == null && right == null){
            return null;
        }
        if (left == null){return right;}
        if (right == null){return left;}
        return root;
    }
}
