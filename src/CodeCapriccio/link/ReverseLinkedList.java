package CodeCapriccio.link;

import DataStructure.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode next=null;
        while (cur!=null){
            /*
            1. next指向cur.next
            2. 调整cur.next为pre
            3. pre变为cur
            4. cur++
             */
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
