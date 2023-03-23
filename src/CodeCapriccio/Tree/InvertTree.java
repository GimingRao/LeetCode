package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 翻转二叉树
 *
 * @author GimingRao
 * @data 2023/3/23 8:56
 */
public class InvertTree {
    /**
     * 翻转二叉树
     *
     * @param root 根
     * 1. 健壮性检验
     * 2. 递归作用：输入头节点，翻转二叉树，输出头节点
     * 3. 递归跳出：叶子节点
     * 4. 内部逻辑：左子树递归，右子树递归。根节点左右指针分别指向右左子树
     */
    public TreeNode invertTree(TreeNode root) {
        f(root);
        return root;
    }

    public TreeNode f(TreeNode root){
        if(root==null) return root;
        if (root.left==null&&root.right==null){
            return root;
        }
        TreeNode beforeLeft=f(root.left);
        TreeNode beforeRight=f(root.right);
        root.left=beforeRight;
        root.right=beforeLeft;
        return root;
    }
}
