package CodeCapriccio.DP;

import java.util.Arrays;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * @author GimingRao
 * @data 2023/4/4 10:01
 */
public class HouseRobber {
    /**
     * 抢劫
     *
     * @param nums 金额数组
     * @return int
     *
     * 动态规划，dp[i]表示从第1家开始抢能最多抢到多少钱
     * 初始化： dp[nums.length] = 0 , dp[nums.length - 1] = nums[nums.length - 1]
     * 循环方式： 从尾到头
     * 状态转移: dp[i] = Math.max(dp[i+1] , dp[i+2] + nums[i])
     */
    public static int rob(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length + 1];
        dp[length] = 0;
        dp[length - 1] =nums[length - 1];
        for (int i = nums.length - 2;  i >= 0 ; i--) {
            dp[i] = Math.max(dp[i+1] , dp[i+2] + nums[i]);
        }
        return dp[0];
    }

    /**
     * rob2
     * nums 变为环形
     * @param nums 金额数组
     * @return int
     */
    public static int rob2(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] withOutTails = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] withOutFirst = Arrays.copyOfRange(nums, 1, nums.length);
        return Math.max(rob(withOutTails) , rob(withOutFirst));
    }

    public static void main(String[] args) {
        System.out.println(rob2(new int[]{1 , 2 , 3}));
    }
}
