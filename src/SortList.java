import java.util.List;

public class SortList {

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = findMidle(head);
        ListNode head1 = sortList(middle.next);
        middle.next = null;
        ListNode head2 = sortList(head);

        return merge(head2, head1);

    }

    public static ListNode findMidle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                current.next = head1;
                head1 = head1.next;
            }else{
               current.next = head2;
               head2 = head2.next;
            }
            current = current.next;
        }

        if(head1 != null){
            current.next = head1;
        }else if(head2 != null){
            current.next = head2;
        }

        return dummy.next;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(sortList(head));
    }
}
