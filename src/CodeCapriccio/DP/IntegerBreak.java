package CodeCapriccio.DP;

/**
 * 给定一个正整数 n ，将其拆分为 k 个 正整数 的和（ k >= 2 ），并使这些整数的乘积最大化。
 *
 * 返回 你可以获得的最大乘积 。
 * @author GimingRao
 * @data 2023/3/27 13:28
 */
public class IntegerBreak {
    /**
     * 整数分解
     *
     * @param n n
     * @return int
     * dp[i]表示i的最大乘积
     * dp[i]=max(dp[j]*dp[i-j])
     */
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            int max = -1;
            for (int j = 1; j < i ; j++) {
                max = Math.max(max , Math.max(dp[j] , j) * Math.max(dp[i - j] , i-j));
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
