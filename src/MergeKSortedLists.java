import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {


    private Comparator<ListNode> listNodeComparator = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    };

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0){
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(
                lists.length, listNodeComparator);

        for(int i = 0 ; i < lists.length; i++){
            if(lists[i] != null){
                priorityQueue.add(lists[i]);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (!priorityQueue.isEmpty()){
           ListNode node = priorityQueue.poll();
           head.next = node;
           head = head.next;

           if(node.next != null){
               priorityQueue.add(node.next);
           }

        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ClassLoader c = Thread.currentThread().getContextClassLoader();
        System.out.print(c);
    }
}
