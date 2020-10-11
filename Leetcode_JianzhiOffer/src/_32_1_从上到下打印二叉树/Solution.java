package _32_1_从上到下打印二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null)  queue.add(root);

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)  queue.add(node.left);
                if (node.right != null)  queue.add(node.right);
            }

        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
