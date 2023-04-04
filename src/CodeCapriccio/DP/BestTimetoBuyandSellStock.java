package CodeCapriccio.DP;

/**
 *
 * @author GimingRao
 * @data 2023/4/4 18:17
 */
public class BestTimetoBuyandSellStock {

    /*
    给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。

    在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。

    返回 你能获得的 最大 利润 。
     */


    /**
     * 最大利润
     *
     * @param prices 价格列表
     * @return int
     * dp[i][0]表示第i天持有该股票时的现金
     * dp[i][1]表示第i天不持有该股票时的现金
     * 过程中维护min
     * 初始化：dp[0][0] = 0 , dp[0][1] = -prices[0]
     * 状态转移矩阵：dp[i][0] = Math.max(dp[i-1][0] , dp[i-1][1] -prices[i])  dp[i][1] = Math.max(dp[i-1][1] , dp[i-1][0]+prices[i] - min)
     */
    public int maxProfit(int[] prices) {
        int days = prices.length;
        int min = prices[0];
        int dp[][] = new int[days][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < days ; i++) {
            dp[i][0] = Math.max(dp[i-1][0] , dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1] , dp[i-1][0] + prices[i]);
            if (prices[i] < min)
                min = prices[i];
        }
        return dp[days-1][1];
    }
}
