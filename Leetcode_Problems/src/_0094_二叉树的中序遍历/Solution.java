package _0094_二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<Object> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null)  continue;
            if (pop instanceof TreeNode) {
                TreeNode tmp = (TreeNode) pop;
                stack.push(tmp.right);
                stack.push(tmp.val);
                stack.push(tmp.left);
            } else {
                list.add((Integer) pop);
            }
        }
        return list;
    }

    public List<Integer> inorderTraversalRecur(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return dfs(list, root);
    }

    List<Integer> dfs(List<Integer> list, TreeNode root) {
        if (root == null) return list;
        dfs(list, root.left);
        list.add(root.val);
        dfs(list, root.right);
        return list;
    }
}
