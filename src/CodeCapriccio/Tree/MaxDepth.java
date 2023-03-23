package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 求二叉树的最大深度
 *
 * @author GimingRao
 * @data 2023/3/23 9:32
 */
public class MaxDepth {
    /**
     * 最大深度
     *
     * @param root 根
     * @return int 最大深度
     * 1. 递归跳出条件：root为空返回0
     * 2. 递归单层逻辑：max(左子树深度，右子树深度)+1
     */
    public int maxDepth(TreeNode root) {
        return f(root);
    }
    public  int f(TreeNode root){
        if (root==null) return 0;
        return Math.max(f(root.left),f(root.right))+1;
    }
}
