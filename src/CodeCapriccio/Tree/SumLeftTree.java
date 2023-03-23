package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 给定二叉树的根节点 root ，返回所有左叶子之和。
 *
 * @author GimingRao
 * @data 2023/3/23 17:29
 */
public class SumLeftTree {
    /**
     * 递归实现当前根节点左叶子之和
     *
     * @param root 根
     * @return int
     */
    public int sumOfLeftLeaves(TreeNode root) {
        return f(root,false);
    }

    private int f(TreeNode root, boolean isLeft){
        if (root==null)
            return 0;
        if (root.left==null&&root.right==null&&isLeft)
            return root.val;
        return f(root.left,true)+f(root.right,false);
    }
}
