package _55_2_平衡二叉树;

public class Solution1 {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;

        int l = recur(root.left);
        if(l == -1) return -1;

        int r = recur(root.right);
        if(r == -1) return -1;

        return Math.abs(l - r) < 2 ? Math.max(l, r) + 1 : -1;
    }
}
