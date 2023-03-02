package Topic;

import DataStructure.TreeNode;

import java.util.Stack;

public class Topic230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> minNum=new Stack<>();
        f(root,minNum,k);
        return minNum.pop();
    }
    public void f(TreeNode root, Stack<Integer> minNum,int k){
        if (root==null)
            return;
        f(root.left,minNum,k);
        if (minNum.size()==k) return;
        minNum.push(root.val);
        if (minNum.size()==k) return;
        f(root.right,minNum,k);
    }
}
