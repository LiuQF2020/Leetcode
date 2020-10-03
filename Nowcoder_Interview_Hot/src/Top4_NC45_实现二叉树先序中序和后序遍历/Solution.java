package Top4_NC45_实现二叉树先序中序和后序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class Solution {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */

    public int[][] threeOrders (TreeNode root) {
        ArrayList<Integer> pre = (ArrayList<Integer>) preTravel(root);
        pre.stream().mapToInt(Integer::valueOf).toArray();

        ArrayList<Integer> in = (ArrayList<Integer>) inTravel(root);
        in.stream().mapToInt(Integer::valueOf).toArray();

        ArrayList<Integer> back = (ArrayList<Integer>) backTravel(root);
        back.stream().mapToInt(Integer::valueOf).toArray();

        int[][] res = {pre.stream().mapToInt(Integer::valueOf).toArray(),
                in.stream().mapToInt(Integer::valueOf).toArray(),
                back.stream().mapToInt(Integer::valueOf).toArray()};

        return res;
    }

    // 前序遍历
    public static List<Integer> preTravel(TreeNode root){
        List<Integer> pre = new ArrayList<>();

        Stack<Object> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null)  continue;
            if (pop instanceof TreeNode) {
                TreeNode tmp = (TreeNode) pop;
                stack.push(tmp.right);
                stack.push(tmp.left);
                stack.push(tmp.val);
            } else {
                pre.add((Integer) pop);
            }
        }
        return pre;
    }

    // 中序遍历
    public static List<Integer> inTravel(TreeNode root){
        List<Integer> in = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        Stack<Object> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null)  continue;
            if (pop instanceof TreeNode) {
                TreeNode tmp = (TreeNode) pop;
                stack.push(tmp.right);
                stack.push(tmp.left);
                stack.push(tmp.val);
            } else {
                in.add((Integer) pop);
            }
        }
        return in;
    }

    // 后序遍历
    public static List<Integer> backTravel(TreeNode root){
        List<Integer> back = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        Stack<Object> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null)  continue;
            if (pop instanceof TreeNode) {
                TreeNode tmp = (TreeNode) pop;
                stack.push(tmp.right);
                stack.push(tmp.left);
                stack.push(tmp.val);
            } else {
                back.add((Integer) pop);
            }
        }
        return back;
    }
}