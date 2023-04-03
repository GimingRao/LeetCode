package CodeCapriccio.DP;

/**
 * 给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。
 * @author GimingRao
 * @data 2023/4/3 18:00
 */
public class CombinationSum {
    /**
     *
     * @param nums   全国矿工工会
     * @param target 目标
     * @return int
     * 组合背包问题，修改遍历顺序
     * for i in range [0, target]
     *  for j in range [0, nums.length)
     *      dp[i]+=dp[i-nums[j]]
     */
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <= target ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (i >= nums[j])
                    dp[i] += dp[i - nums[j]];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{3, 1, 2, 4}, 4));
    }
}
