package _07_树._2_前中后序的非递归实现;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * 因此，我在这里介绍一种“颜色标记法”（瞎起的名字……），兼具栈迭代方法的高效，又像递归方法一样简洁易懂;
 * 更重要的是，这种方法对于前序、中序、后序遍历，能够写出完全一致的代码。
 *
 * 其核心思想如下：
 *
 * 使用颜色标记节点的状态，新节点为白色，已访问的节点为灰色。
 * 如果遇到的节点为白色，则将其标记为灰色，然后将其右子节点、自身、左子节点依次入栈。
 * 如果遇到的节点为灰色，则将节点的值输出。
 *
 * 作者：hzhu212
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/yan-se-biao-ji-fa-yi-chong-tong-yong-qie-jian-ming/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
// 太牛逼了卧槽：压栈顺序刚好与遍历顺序相反。
public class Solution {

    // 前序遍历
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<Object> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null) continue;
            if (pop instanceof TreeNode) {
                TreeNode temp = (TreeNode) pop;
                stack.push(temp.right);
                stack.push(temp.left);
                stack.push(temp.val);
            } else {
                list.add((Integer) pop);
            }
        }
        return list;
    }

    // 中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<Object> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null) continue;
            if (pop instanceof TreeNode) {
                TreeNode temp = (TreeNode) pop;
                stack.push(temp.right);
                stack.push(temp.val);
                stack.push(temp.left);
            } else {
                list.add((Integer) pop);
            }
        }
        return list;
    }

    // 后序遍历
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<Object> stack = new Stack<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null) continue;
            if (pop instanceof TreeNode) {
                TreeNode temp = (TreeNode) pop;
                stack.push(temp.val);
                stack.push(temp.right);
                stack.push(temp.left);
            } else {
                list.add((Integer) pop);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
    }
}
