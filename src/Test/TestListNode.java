package Test;

import DataStructure.ListNode;
import Topic.Topic134;
import Topic.Topic148;

public class TestListNode {


    public static void main(String[] args) {
        int[] testCase=new int[]{4,19,14,5,-3,1,8,5,11,15};
        Topic148 testUnit=new Topic148();
        ListNode testNode=new ListNode();
        ListNode cur=testNode;
        for (int j : testCase) {
            cur.next = new ListNode(j);
            cur = cur.next;
        }
        testNode=testUnit.sortList(testNode.next);
        while (testNode!=null){
            System.out.println(testNode.val);
            testNode=testNode.next;
        }
    }
}
