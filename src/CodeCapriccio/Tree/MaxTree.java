package CodeCapriccio.Tree;

import DataStructure.TreeNode;

import java.util.Arrays;

/**
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建
 *
 * @author GimingRao
 * @data 2023/3/24 8:58
 */
public class MaxTree {
    /**
     * 最大构造二叉树
     *
     * @return nums 构建的 最大二叉树
     *
     * 1. 寻找nums中的最大值，左右分别递归
     * 2. 递归跳出条件：nums.length==0, return null
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length==0)
            return null;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < nums.length ; i++) {
            max = Math.max(max , nums[i]);
            if (max == nums[i])
                maxIndex = i;
        }
        TreeNode ans = new TreeNode(max);
        int[] leftNums = Arrays.copyOfRange(nums,0,maxIndex);
        ans.left = constructMaximumBinaryTree(leftNums);
        if (maxIndex == nums.length - 1)
            ans.right = null;
        else ans.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,maxIndex+1,nums.length));
        return ans;
    }
}
