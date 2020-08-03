package _06_从尾到头打印链表;

public class ListNode {
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