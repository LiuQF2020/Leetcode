package _27_二叉树的镜像;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class Solution {
    public TreeNode mirrorTree_recur(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree_recur(root.right);
        root.right = mirrorTree_recur(tmp);
        return root;
    }


    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            // 先出根的右子节点，即使得根的整个右子节点出现在镜像处理后的根的左子节点；
            // （因为后面两条语句先压入左子节点，再压入右子节点，栈是后进先出）
            TreeNode node = stack.pop();
            if(node.left != null)  stack.add(node.left);
            if(node.right != null)  stack.add(node.right);

            // 这里的节点是从stack中pop出来的节点；
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
