package CodeCapriccio.link;

public class MyLinkedList {
    Node head;
    int length;
    public MyLinkedList() {
        head=new Node();
        length=0;
    }
    public int get(int index){
        if (index>=length)
            return -1;
        Node cur=head;
        for (int i = 0; i <=index; i++) {
            cur=cur.next;
        }
        return cur.val;
    }
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    public void addAtTail(int val) {
        addAtIndex(length,val);
    }

    public void addAtIndex(int index, int val) {
        if (index>length)
            return;
        Node cur=head;
        for (int i = 0; i <index; i++) {
            cur=cur.next;
        }
        Node toAdd=new Node(val);
        toAdd.next=cur.next;
        cur.next=toAdd;
        length++;
    }
    public void deleteAtIndex(int index) {
        if (index>=length)
            return;
        Node cur=head;
        for (int i = 0; i <index; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        length--;
    }

}
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){this.val=val;}
}
