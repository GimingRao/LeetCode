package CodeCapriccio.DP;

/**
 * 背包问题
 *
 * @author GimingRao
 * @data 2023/3/30 9:33
 */
public class BackpackIssues {
    /**
     *
     * @param weight    重量数组
     * @param values    价值数组
     * @param maxWeight 背包能容纳的最大重量
     * @return int 最大价值
     * dp[i][j]表示选择0-i个物体，背包重量为j的情况下能装下的最大价值
     * 初始化：
     *  dp[i][0] = 0
     * 状态转移：
     *  如果第i个物体被放入背包，最大价值就是dp[i-1][j-weight[i]]+values[i]（前提条件：[j-weight[i]>0）
     *  如果第i个物体不被放入背包，最大价值就是dp[i-1][j]
     *  比较得到dp[i][j]的值
     *遍历顺序：
     *  从上到下，从左到右
     *
     * 1. 第1行，从weigth[0]列开始，后面列均赋值为values[0]；
     * 2. for i in range(1, numObj)
     * 3. for j in range(1, maxWeight)
     * 4. 判断j-weight[i]<0，直接写入dp[i-1][j]
     * 5. 否则，写入比较得到dp[i][j]的值
     */
    public int BackPack01(int[] weight , int [] values , int maxWeight){
        int numObj = weight.length;
        int[][] dp =new int[numObj][maxWeight+1];
        for (int i = weight[0]; i <maxWeight+1 ; i++) {
            dp[0][i]=values[0];
        }
        for (int i = 1; i < numObj ; i++) {
            for (int j = 1; j < maxWeight; j++) {
                if (j-weight[i] < 0){
                    dp[i][j]=dp[i-1][j];
                    continue;
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+values[i]);
            }
        }
        return dp[numObj-1][maxWeight-1];
    }
}
