public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);


        if(lengthA >= lengthB){
            ListNode newHeadA = move(headA, lengthA - lengthB);
            while (newHeadA != null && headB != null){
                if(newHeadA == headB){
                    return newHeadA;
                }
                newHeadA = newHeadA.next;
                headB = headB.next;
            }
        }else{
           ListNode newHeadB = move(headB, lengthB - lengthA);
           while (newHeadB != null && headA != null){
               if(newHeadB == headA){
                   return newHeadB;
               }

               newHeadB = newHeadB.next;
               headA = headA.next;
           }
        }


        return null;

    }

    private int getLength(ListNode head){
        int length = 0;
        while (head != null){
            head = head.next;
            length++;
        }

        return length;
    }

    private ListNode move(ListNode head, int steps){
       while (head != null && steps > 0){
           head = head.next;
           steps --;
       }

       return head;
    }
}
