package CodeCapriccio.Tree;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 迭代方式遍历二叉树
 *
 * @author GimingRao
 * @data 2023/3/22 18:50
 */
public class BinaryTreeIterator {
    /**
     * 前序遍历
     *
     * @param root 根
     * @return 遍历得到的结果
     * 1. 将根节点压入栈
     * 2. 循环一直出栈。将出栈的节点的右节点、左节点分别入栈
     * 3. 当栈空时跳出循环
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root==null)
            return new ArrayList<Integer>();
        Stack<TreeNode> treeNodeStack=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        treeNodeStack.push(root);
        TreeNode cur=root;
        while (!treeNodeStack.isEmpty()){
            cur=treeNodeStack.pop();
            ans.add(cur.val);
            if (cur.right!=null) treeNodeStack.push(cur.right);
            if (cur.left!=null) treeNodeStack.push(cur.left);
        }
        return ans;
    }

    /**
     * 中序遍历
     *
     * @param root 根
     * @return 遍历得到的结果
     * 1. 从根节点开始将左节点入栈直到没有左节点
     * 2. 循环推出栈的同时把右节点推入
     * 3. 栈空跳出循环
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root==null)
            return new ArrayList<Integer>();
        Stack<TreeNode> treeNodeStack=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode cur=root;
        while (cur!=null){
            treeNodeStack.add(cur);
            cur=cur.left;
        }
        while (!treeNodeStack.isEmpty()){
            cur=treeNodeStack.pop();
            ans.add(cur.val);
            if (cur.right!=null){
                cur=cur.right;
                while (cur!=null){
                    treeNodeStack.add(cur);
                    cur=cur.left;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode test3=new TreeNode(3);
        TreeNode test2=new TreeNode(2,test3,null);
        TreeNode test1=new TreeNode(1,null,test2);
        System.out.println(inorderTraversal(test1));

    }
}
