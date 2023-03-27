package CodeCapriccio.Tree;

import DataStructure.TreeNode;

import java.util.Stack;

/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 *
 * @author GimingRao
 * @data 2023/3/27 11:59
 */
public class HashPathSum {

    /**
     *
     * @param root      根
     * @param targetSum 目标和
     * @return boolean
     * DFS
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return f(root , targetSum ,0);
    }

    /**
     * f
     *
     * @param root      根
     * @param targetSum 目标和
     * @return boolean
     * 1. 跳出条件：root.left==null&root.right==null ，sum==target
     * 2. 判断左节点，右节点是否满足
     */
    private boolean f(TreeNode root, int targetSum,Integer sum){
        if (root.left ==null && root.right == null){
            sum += root.val;
            return sum == targetSum;
        }
        boolean ans = false;
        if (root.left !=null)
            ans=f(root.left,targetSum,sum+ root.val);
        if ((!ans)&&(root.right != null))
            ans=f(root.right,targetSum,sum+ root.val);
        return ans;
    }
}
