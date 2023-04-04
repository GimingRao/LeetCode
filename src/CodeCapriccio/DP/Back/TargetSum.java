package CodeCapriccio.DP.Back;

/**
 * 给你一个整数数组 nums 和一个整数 target 。
 *
 * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 *
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 *
 * @author GimingRao
 * @data 2023/4/3 14:06
 */
public class TargetSum {
    /**
     * 找到目标和方法
     *
     * @param nums   数组
     * @param target 目标
     * @return int
     * dp[i][j] 表示选择第0-i个数字得到j的表达式数目。可以使用循环以一维数组替代多维数组(nums.length * 2*sum+1)
     * dp[i][j] = dp[i-1][j+nums[i]]+dp[i-1][j-nums[i]];
     * 初始化：dp[0][+ -nums[0]]=1
     */
    public static int findTargetSumWays(int[] nums, int target) {
        int max=0;
        for (int num : nums)
            max += num;
        if (target> max || -target > max)
            return 0;
        if (max == 0)
            return (int) Math.pow(2, nums.length);
        int dpCol = 2 * max +1;
        int dp[][] = new int[nums.length][dpCol];
        dp[0][max - nums[0]] += 1;
        dp[0][max + nums[0]] += 1;
        for (int i = 1; i < nums.length ; i++) {
            for (int j = 0; j < dpCol ; j++) {
                if (j+nums[i] < dpCol)
                    dp[i][j]+=dp[i-1][j+nums[i]];
                if (j-nums[i] > 0)
                    dp [i][j] += dp[i-1][j-nums[i]];
            }
        }
        return dp[nums.length-1][target + max];
    }

    public static void main(String[] args) {
        findTargetSumWays(new int[]{0,0,0,0,0,0,0,0,0} , 1);
    }
}
