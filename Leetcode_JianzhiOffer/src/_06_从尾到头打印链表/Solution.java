package _06_从尾到头打印链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) {
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

public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        // ListNode dum = new ListNode(0), cur = dum;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }

    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint2(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    void recur(ListNode head) {
        if (head == null) {
            return;
        }
        recur(head.next);
        // 这里因为递归是压栈再出栈，所以tmp是先add 18，即先进后出
       tmp.add(head.val);
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
            t.next = new ListNode(i*2);
            t = t.next;
        }


        Solution sl = new Solution();
        sl.printListNode(head);

//        int[] arr = sl.reversePrint(head);//调用反转链表方

        int[] arr = sl.reversePrint2(head);
        System.out.println(Arrays.toString(arr));
    }

}