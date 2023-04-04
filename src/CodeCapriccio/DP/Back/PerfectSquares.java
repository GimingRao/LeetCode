package CodeCapriccio.DP.Back;

/**
 * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
 *
 * 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
 * @author GimingRao
 * @data 2023/4/3 18:53
 */
public class PerfectSquares {

    /**
     *
     * @param n n
     * @return int
     * 背包问题，dp: sqrt(n)*n+1
     * 状态转移： dp[j] = Math.min(dp[j] , dp[j - i])
     * 循环：
     *      for i in range(0 , sqrt(n)+1)
     *          for j in range (i , n+1)
     *初始化：
     *dp[j] = j;
     */
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for (int i = 0; i <= n ; i++)
            dp[i] = i;
        for (int i = 0; i <= Math.sqrt(n) ; i++) {
            for (int j = i*i; j <= n; j++) {
                dp[j] = Math.min(dp[j] , dp[j - i*i]+1);
            }
        }
        return  dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
}
