package Test;

import DataStructure.Node;
import Topic.Topic116;

public class TestNode {
    public static Node node1=new Node(1);
    public static Node node2=new Node(2);
    public static Node node3=new Node(3);
    public static Node node4=new Node(4);
    public static Node node5=new Node(5);
    public static Node node6=new Node(6);
    public static Node node7=new Node(7);
    public Node node8=new Node(8);
    public Node node9=new Node(9);
    public static Topic116 testUnit=new Topic116();

    public static void main(String[] args) {
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        testUnit.connect(node1);
    }
}
