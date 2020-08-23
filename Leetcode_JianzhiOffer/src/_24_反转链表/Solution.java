package _24_反转链表;

/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public ListNode reverse(ListNode root){
        ListNode newHead = new ListNode(-1);
        ListNode cur = root;
        while(cur != null){
            ListNode next = cur.next;
            root.next = newHead.next;
            newHead.next = cur;
            cur = next;
        }
        return newHead.next;
    }

    public ListNode reverseRecu(ListNode root){
        if(root.next == null){
            return root;
        }
        ListNode next = root.next;
        root.next = null;
        ListNode newHead = reverseRecu(next);
        next.next = root;
        return newHead;
    }

    public ListNode reverseList(ListNode head) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, cur = head;

        Stack<ListNode> stack = new Stack<>();
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int size = stack.size();
        ListNode root = null;
        if (size != 0) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = stack.pop().val;
            }

            root = new ListNode(arr[0]);
            ListNode other = root;
            for (int i = 1; i < arr.length; i++) {
                ListNode temp = new ListNode(arr[i]);
                other.next = temp;
                other = temp;
            }
        }
        return root;
    }


}
