package com.leetcode.base;

/**
 * 树
 *
 * @author lixiyan
 * @date 2021/4/28 6:24 PM
 */
public class TreeNode {

    public  int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
