package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 判断一个二叉树是不是平衡二叉树
 *
 * @author GimingRao
 * @data 2023/3/23 11:09
 */
public class IsBalanced {
    boolean ans=true;
    /**
     * 判断一个二叉树是不是平衡二叉树
     *
     * @param root 根
     * @return boolean
     * 1. 如果ans为flase，直接返回-1
     * 2. 如果root为空，返回0
     * 3. abs(f(左)-f(右))>1 ,ans置为flase， return -1
     * 4. return max(f(左),f(右))+1
     */
    public boolean isBalanced(TreeNode root) {
        f(root);
        return ans;
    }
    public int f(TreeNode root) {
        if (!ans) return -1;
        if (root==null) return -1;
        int leftDepth=f(root.left);
        int rightDepth=f(root.right);
        if (Math.abs(leftDepth-rightDepth)>1){
            ans=false;
            return -1;
        }
        return Math.max(leftDepth,rightDepth)+1;
    }

}
