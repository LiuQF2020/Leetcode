package _28_对称的二叉树;

import sun.awt.TracedEventQueue;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }
    boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null)  return true;
        if(L == null || R == null || L.val != R.val)  return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}

