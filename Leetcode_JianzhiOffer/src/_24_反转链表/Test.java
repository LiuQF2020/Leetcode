package _24_反转链表;

import java.util.Stack;

public class Test {
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
            for (int i = 0; i < size; i++) {
                ListNode dummyHead = new ListNode(0);
                dummyHead.next = root;
                ListNode prev_ = dummyHead, cur_ = root;

                root = new ListNode(stack.pop().val);

                root = root.next;
            }
        }
        return root;
    }

}
