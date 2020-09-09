package _06_链表._1_反转链表;

public class ReverseLinkedList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node cur = head;
        Node tmp = null;

        while (cur!=null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
