package _06_链表._2_合并两个排序的链表;

/*
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
 */
public class MergeTwoLinkedList {
    class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    /*
    递归版本：
     */
    public ListNode merge(ListNode list1, ListNode list2) {

        if (list1 == null)   return list2;
        if (list2 == null)   return list1;

        if (list1.val <= list2.val) {
            list1.next = merge(list1.next, list2);
            return list1;
        } else {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    /*
    非递归版本：
     */
    public ListNode merge1(ListNode list1, ListNode list2) {
        if (list1 == null)  return list2;
        if (list2 == null)  return list1;

        ListNode newHead = null;
        ListNode cur = null;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (newHead == null) {
                    cur = list1;
                    newHead = cur;
                } else {
                    cur.next = list1;
                    cur = cur.next;
                }
                list1 = list1.next;

            } else {
                if (newHead == null) {
                    cur = list2;
                    newHead = cur;
                } else {
                    cur.next = list2;
                    cur = cur.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        return newHead;
    }
}
