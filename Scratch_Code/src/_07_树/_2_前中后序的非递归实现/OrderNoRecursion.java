package _07_树._2_前中后序的非递归实现;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}


public class OrderNoRecursion {

    public void preOrder(TreeNode root) {
        /*
        前序遍历：中 —> 左 —> 右
        分析：处理当前结点，有右孩子先压右孩子进栈，有左孩子再压左孩子进栈，那么这样弹出就会是先左，再右。

        为什么使用栈而不是队列呢？
        二叉树有从上到下和从下到上的路径，所以需要一个结构让它回去，只有栈【队列只能从上到下，回不去】
         */
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            System.out.print(root.val + " ");

            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
    }


    public void inOrder(TreeNode root) {
        /*
        中序遍历： 左 —> 中  —> 右
        当前节点会把自己的左边界一次性都压到栈里，然后依次弹出，直到遇到一个有右孩子的节点，处理它的右孩子;
        这样就模拟了“左、中、右”这样的一个过程。

        当前节点为空，从栈拿一个打印，当前节点向右移动。当前节点不为空，当前节点压入栈，当前节点往左移动。
        */
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();

        // 压一绺左边界，再从尾端依次往外弹，弹出一个节点，再去遍历它的右孩子。
        // 这个过程就模拟了：左、中、右这个过程.

        // 需要判断head是否为null，是因为后序不同于先序和中序，它是在循环中将root压入栈的.
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                // 一压压一绺左边界
                while (root != null) {
                    stack.push(root);
                    root = root.left;  // 遍历左边界节点
                }
            } else {
                // 当前节点为空时，说明上面已经压完了一绺左节点，弹出当前节点（中点），再处理右边.
                root = stack.pop();
                System.out.println(root.val + " ");
                root = root.right;
            }
        }
    }

}
