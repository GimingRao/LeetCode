package CodeCapriccio.Tree;

import DataStructure.TreeNode;

/**
 * 二叉树的最近公共祖先
 *
 * @author GimingRao
 * @data 2023/3/27 19:14
 */
public class LowestCommonAncestorofBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (leftNode != null && rightNode != null)
            return root;
        return leftNode ==null ? rightNode :leftNode;
    }
}
