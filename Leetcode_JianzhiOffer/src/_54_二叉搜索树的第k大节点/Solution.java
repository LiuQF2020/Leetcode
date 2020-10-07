package _54_二叉搜索树的第k大节点;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    int k, res;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null)  return;
        dfs(root.right);
        if (k == 0) return;
        if(--k == 0)  res = root.val;
        dfs(root.left);
    }
}
