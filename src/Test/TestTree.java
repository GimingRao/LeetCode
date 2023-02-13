package Test;

import DataStructure.TreeNode;
import Topic.Topic103;

import java.util.Arrays;
import java.util.List;

public class TestTree {
    static TreeNode node9=new TreeNode(9);
    static TreeNode node20=new TreeNode(20,new TreeNode(15),new TreeNode(7));
    static TreeNode node3=new TreeNode(3,node9,node20);
    static Topic103 testUnit=new Topic103();

    public static void main(String[] args) {
        System.out.println(testUnit.zigzagLevelOrder(null));
    }

}
