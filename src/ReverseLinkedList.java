class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = p;
            p = head;
            head = tmp;

        }

        return p;
    }
}
