package _06_链表._1_反转链表;

public class ReverseLinkedList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    /*
    反转单向链表：
     */
    public static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node cur = head;
        Node tmp = null;

        while (cur!=null) {
            // 也可以用“赋值”语句的理解方法来理解下麦呢两句话

            // cur.next在等号右，表示tmp记录下cur的下一个位置；
            // 或者说将cur的下一个位置赋值给tmp；
            // 亦即tmp移动到cur的下一个位置。
            tmp = cur.next;

            // cur.next在等号左，表示cur指向pre；
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }


    public static class DoubleNode {
        int value;
        DoubleNode pre;  // 指向前一个节点
        DoubleNode next;  // 指向后一个节点

        public DoubleNode(int value) {
            this.value = value;
        }
    }

    /*
    反转双向链表：
    还不太理解。。。
     */
    public static DoubleNode reverseDoubleLinkedList(DoubleNode head) {
        if (head == null) {
            return null;
        }

        DoubleNode tmp = null;
        DoubleNode res = null;

        while (head != null) {
            tmp = head.next;
            head.next = head.pre;
            head.pre = tmp;
            res = head;
            head = tmp;
        }
        return res;
    }
}
