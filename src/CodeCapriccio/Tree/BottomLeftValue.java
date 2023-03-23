package CodeCapriccio.Tree;

import DataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 * 假设二叉树中至少有一个节点。
 *
 * @author GimingRao
 * @data 2023/3/23 17:39
 */
public class BottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root.left==null&&root.right==null)
            return root.val;
        Map<TreeNode,Integer> isCalculate=new HashMap<>();
        int leftDepth=getDepth(root.left,isCalculate);
        int rightDepth=getDepth(root.right,isCalculate);
        if (leftDepth<rightDepth)
            return findBottomLeftValue(root.right);
        return findBottomLeftValue(root.left);
    }

    /**
     * 得到根节点的深度
     *
     * @param root        根
     * @param isCalculate 已被计算过深度的节点
     * @return int
     * 1. 判断当前根是否再Map中，若存在，直接返回
     * 2. 递归左右子树的深度，最大值+1得到最后的深度
     * 3. 深度写入Map再返回
     */
    private  int getDepth(TreeNode root ,Map<TreeNode,Integer> isCalculate){
        if (root==null)
            return 0;
        if (isCalculate.containsKey(root))
            return isCalculate.get(root);
        int ans = Math.max(getDepth(root.left, isCalculate), getDepth(root.right, isCalculate)) + 1;
        isCalculate.put(root,ans);
        return ans;
    }
}
