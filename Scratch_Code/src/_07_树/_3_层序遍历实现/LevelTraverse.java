package _07_树._3_层序遍历实现;

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
/*
只需要增加一个队列，将遍历过程中的节点依次放进去;
再去按照队列中的节点去遍历它们的子节点。
 */
public class LevelTraverse {
    public void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }

        }
    }
}
