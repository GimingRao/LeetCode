package CodeCapriccio.DP.Back;

/**
 * Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n
 *
 * @author GimingRao
 * @data 2023/3/30 9:11
 */
public class UniqueBinarySearchTrees {
    /**
     *
     * @param n 1-n
     * @return int 二叉搜索树的个数
     *
     * 输入为n的情况下，若根节点为k，则其左节点为[1,k-1]的二叉搜索树，右节点为[k+1,n]的二叉搜索树
     * 若dp[]表示数值为1-n的二叉搜索树的数目，左节点的种数为dp[k-1]右节点种数为dp[n-k]
     * dp[0]=1
     * 根节点可以是1-n,于是遍历i in range[1, n]
     * 每一轮循环给ans+=dp[i-1]*dp[n-i]
     */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int k = 1; k <= n ; k++) {
            int ans = 0;//写入dp[k]
            for (int i = 1; i <=k ; i++) {
                ans += dp[i-1] * dp[k-i];
            }
            dp[k] = ans;
        }
        return dp[n];
    }
}
