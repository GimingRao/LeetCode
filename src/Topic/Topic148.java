package Topic;

import DataStructure.ListNode;

public class Topic148 {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode frist = new ListNode();
        frist.next=head;
        ListNode slow=frist;
        ListNode fast=frist;
        while (fast!=null){
            fast=fast.next;
            if (fast!=null) {
                slow=slow.next;
                fast = fast.next;
            }
            else
                break;
        }
        ListNode right=slow.next;
        slow.next=null;
        head=sortList(head);
        right=sortList(right);
        ListNode res = merge(head, right);
        return res;
    }
    public ListNode merge (ListNode left,ListNode right){
        ListNode res=new ListNode();
        ListNode cur=res;
        while (left!=null||right!=null){
            if (left==null||(right!=null&&left.val>=right.val)){
                cur.next=new ListNode(right.val);
                right=right.next;
                cur=cur.next;
                continue;
            }
            if (right==null||left.val<right.val){
                cur.next=new ListNode(left.val);
                left=left.next;
                cur=cur.next;
            }
        }
        return res.next;
    }
}
