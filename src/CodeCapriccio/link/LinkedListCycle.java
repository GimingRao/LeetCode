package CodeCapriccio.link;

import DataStructure.ListNode;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next==null)
            return null;
        boolean Cycle=false;
        ListNode fast=head.next.next;
        ListNode slow=head.next;
        while (fast!=null&&fast.next!=null&&slow!=null){
            if (fast==slow){
                Cycle=true;
                break;}
            fast=fast.next.next;
            slow=slow.next;
        }
        if (!Cycle)
            return null;
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }
}
