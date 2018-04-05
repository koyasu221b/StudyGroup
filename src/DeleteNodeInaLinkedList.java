public class DeleteNodeInaLinkedList {
    public static void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
        nextNode.next = null;

    }

    public static void main(String args[]){

    }
}
