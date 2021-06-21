package com.leetcode.algorithms.solution200;

import com.leetcode.base.TreeNode;

/**
 * 树的高度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 * @author lixiyan
 * @date 2021/4/28 6:23 PM
 */
public class Solution104 {


    private static int maxDepth(TreeNode root) {
         if(root == null){
             return 0;
         }
         return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left = new TreeNode(3);

        System.out.println(maxDepth(root));
    }

}
