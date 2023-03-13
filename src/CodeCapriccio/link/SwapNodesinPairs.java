package CodeCapriccio.link;

import DataStructure.ListNode;

public class SwapNodesinPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head==null)
            return head;
        ListNode ans=head.next;
        ListNode cur=head;
        ListNode tmp=null;
        ListNode anthor=null;
        ListNode last=null;
        while (cur!=null&&cur.next!=null){
            tmp=cur.next.next;
            anthor=cur.next;
            anthor.next=cur;
            cur=tmp;
            if (last!=null){
                last.next=anthor;
            }
            last=cur;
            cur.next=tmp;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node3.next=node4;
        node2.next=node3;
        node1.next=node2;
        swapPairs(node1);
    }
}
