package Topic;

import DataStructure.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Topic116 {
    public Node connect(Node root) {
        if(root==null)
            return null;
        Queue<Node> nodeQueue=new LinkedList<>();
        nodeQueue.add(root);
        Node next=null;
        while (nodeQueue.size()!=0){
            int len=nodeQueue.size();
            for (int i = 0; i < len; i++) {
                Node cur=nodeQueue.poll();
                if (cur.right!=null) {
                    nodeQueue.add(cur.right);
                    nodeQueue.add(cur.left);
                }
                cur.next=next;
                next=cur;
            }
            next=null;
        }
        return root;
    }
}
