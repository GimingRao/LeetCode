package Topic;

import DataStructure.ListNode;

public class Topic328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode res=new ListNode(head.val);
        ListNode reshead=res;
        ListNode cur=head;
        while (cur!=null){
            res.next=new ListNode(cur.val);
            res=res.next;
            if (cur.next==null) {
                break;
            }
            cur=cur.next.next;
        }
        cur=head.next;
        while (cur!=null){
            res.next=new ListNode(cur.val);
            res=res.next;
            if (cur.next==null)
                break;
            cur=cur.next.next;

        }
        return reshead.next;
    }

    public static void main(String[] args) {
        ListNode test=new ListNode(1);
        ListNode testhead=test;
        test.next=new ListNode(2);
        test=test.next;
        test.next=new ListNode(3);
        test=test.next;
        test.next=new ListNode(4);
        test=test.next;
        test.next=new ListNode(5);
        test=test.next;
        oddEvenList(testhead);
    }
}
