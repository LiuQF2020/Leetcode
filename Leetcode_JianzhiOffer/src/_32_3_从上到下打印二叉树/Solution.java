package _32_3_从上到下打印二叉树;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }

        boolean flag = false;
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();

            flag = !flag;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (flag) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                } else {
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                }
                res.add(level);
            }
        }
        return res;
    }
}
