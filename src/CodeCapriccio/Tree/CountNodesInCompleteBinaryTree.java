package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 计算完全二叉树的节点数量
 *
 * @author GimingRao
 * @data 2023/3/23 10:53
 */
public class CountNodesInCompleteBinaryTree {
    /**
     * 计算完全二叉树的节点数量
     *
     * @param root 根
     * @return int
     * 1. ans=左子树ans+右子树ans+1
     * 2. 若左深度=右深度，则ans=2^n-1
     *      1  2   3
     *      1  3   7
     *
     */
    public int countNodes(TreeNode root) {
        if (root==null)
            return 0;
        int ans=0;
        int leftDepth=0;
        int rightDepth=0;
        TreeNode cur=root;
        while (cur!=null){
            cur=cur.left;
            leftDepth++;
        }
        cur=root;
        while (cur!=null){
            cur=cur.right;
            rightDepth++;
        }
        if (leftDepth==rightDepth){
            return (int) (Math.pow(2,leftDepth)-1);
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
