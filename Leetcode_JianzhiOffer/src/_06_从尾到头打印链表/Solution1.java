package _06_从尾到头打印链表;


import java.util.ArrayList;

public class Solution1 {
    ArrayList<Integer> temp = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] arr = new int[temp.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
        }
        return arr;
    }

    void recur(ListNode head) {
        if (head == null) {
            return;
        }
        recur(head.next);
        temp.add(head.val);
    }
}
