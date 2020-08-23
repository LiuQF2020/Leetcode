package _06_从尾到头打印链表;

import java.util.Arrays;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        ListNode cur = this;
        while(cur != null){
            s.append(cur.val).append("->");
            cur = cur.next;
        }
        s.append("NULL");
        return s.toString();
    }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }

    public void printListNode(ListNode head) {
        while(head!=null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);//创建头节点
//        head.next = new ListNode(2);//再定义头节点的next域
//        ListNode t = head.next;
        ListNode t = head;
        for(int i=2;i<10;i++) {//创建一个简单的链表{1,2,3,4,5,...,9}
            t.next = new ListNode(i);
            t = t.next;
        }


        Solution sl = new Solution();
        sl.printListNode(head);

        int[] arr = sl.reversePrint(head);//调用反转链表方
        System.out.println(Arrays.toString(arr));
    }

}