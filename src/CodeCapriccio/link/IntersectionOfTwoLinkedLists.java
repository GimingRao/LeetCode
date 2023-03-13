package CodeCapriccio.link;

import DataStructure.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0;
        int lengthB=0;
        ListNode curNodeA=headA;
        ListNode curNodeB=headB;
        while (curNodeA.next!=null){
            curNodeA=curNodeA.next;
            lengthA++;
        }
        while (curNodeB.next!=null){
            curNodeB=curNodeB.next;
            lengthB++;
        }
        if (curNodeA!=curNodeB)
            return null;
        curNodeA=headA;
        curNodeB=headB;
        if (lengthA>lengthB){
            for (int i = 0; i < lengthA-lengthB; i++) {
                curNodeA=curNodeA.next;
            }
        }else {
            for (int i = 0; i < lengthB-lengthA; i++) {
                curNodeB=curNodeB.next;
            }
        }
        while (curNodeA!=curNodeB){
            curNodeA=curNodeA.next;
            curNodeB=curNodeB.next;
        }
        return curNodeA;
    }
}
