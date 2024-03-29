package CodeCapriccio.DP.Back;

/**
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 * 假设每一种面额的硬币有无限个。
 * 题目数据保证结果符合 32 位带符号整数。
 *
 * @author GimingRao
 * @data 2023/4/3 16:40
 */
public class CoinChange {
    /**
     *
     * @param amount 总金额
     * @param coins  硬币
     * @return int
     * dp[amount+1],其中dp[i]表示总和为i的方法,循环coins次
     * dp[i]+=dp[i - amount [j]]
     */
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        for (int i = 0; i < amount+1 ; i++) {
            if (i % coins[0] == 0)
                dp[i] += 1;
        }
        for (int i = 1; i < coins.length ; i++) {
            for (int j = coins[i]; j <amount + 1 ; j++) {
             dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
