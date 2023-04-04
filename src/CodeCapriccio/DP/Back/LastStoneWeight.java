package CodeCapriccio.DP.Back;

/**
 * 有一堆石头，用整数数组 stones 表示。其中 stones[i] 表示第 i 块石头的重量。
 *
 * 每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 *
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
 *
 * @author GimingRao
 * @data 2023/4/3 13:47
 */
public class LastStoneWeight {
    /**
     * 最后石头重量
     *
     * @param stones 石头重量
     * @return int 留下来的最小重量
     *
     * 本题可以翻译成，将石头分成两堆，其中一堆的重量最接近sum/2 。 故可转化为背包问题
     * 1. 求总重量sum
     * 2. dp[i]表示最大重量为i时能包含食石头的重量
     * 3. 从只包含第1个石头时更新dp[i]
     * 4. 得到dp[sum/2]即为较小的一堆石堆重量，ans = sum - 2 * dp[]
     */
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones)
            sum += stone;
        int target = sum / 2;
        int[]  dp = new int[target+1];
        for (int i = 0; i < stones.length ; i++) {
            for (int j = target ; j >= stones[i] ; j--) {
                dp[j]=Math.max(dp[j] , dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[target];
    }

}
