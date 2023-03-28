package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 给定二叉搜索树（BST）的根节点 root 和要插入树中的值 value ，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
 * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回 任意有效的结果 。
 *
 * @author GimingRao
 * @data 2023/3/28 9:17
 */
public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        f(root , null , -1 , val);
        return root;
    }

    /**
     * f
     *
     * @param root        根
     * @param father      根节点的父节点
     * @param leftOrRight 向左或向右，0表示左，1表示右
     * @param val         被插入的目标值
     * @return
     * 1. 如果root为空,father的leftorRight为val
     * 2. val和root比较，选择向左递归或向右递归
     */
    private  void f(TreeNode root , TreeNode father , int leftOrRight , int val){
        if (root == null){
            TreeNode ans = new TreeNode(val);
            if (leftOrRight == 0)
                father.left = ans;
            else father.right = ans;
            return;
        }
        if (val > root.val)
            f(root.right , root , 1, val);
        else
            f(root.left , root , 0 ,val);
    }
}
