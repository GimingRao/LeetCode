package Topic;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topic103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> nodeQueue=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if (root==null)
            return result;
        boolean leftOrRight=true;//true表示从左到右，false表示从右到左
        nodeQueue.add(root);
        while (nodeQueue.size()!=0){
            int length=nodeQueue.size();
            List<Integer> cur=new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode node=nodeQueue.poll();
                if (leftOrRight) {
                    cur.add(node.val);
                } else {
                    cur.add(0, node.val);
                }
                if (node.left!=null){
                    nodeQueue.add(node.left);
                }
                if (node.right!=null){
                    nodeQueue.add(node.right);
                }
            }
            result.add(cur);
            leftOrRight=!leftOrRight;
        }
        return  result;
    }
}
