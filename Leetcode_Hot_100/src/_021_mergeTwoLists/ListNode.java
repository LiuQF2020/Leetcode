package _021_mergeTwoLists;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
//        this(val, null);
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
