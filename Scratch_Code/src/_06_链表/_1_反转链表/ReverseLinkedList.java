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
}
