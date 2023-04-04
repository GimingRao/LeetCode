package CodeCapriccio.DP.Back;

/**
 * 分割等和子集
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 *
 * @author GimingRao
 * @data 2023/3/30 10:48
 */
public class PartitionEqualSubsetSum {
    /**
     *
     *
     * @param nums 被分割数组
     * @return boolean
     *
     * 1. 求数组总和，如果数组总和为偶数，直接返回false
     * 2. dp[i][j]表示第0-i个数组中是否存在值为j的子数组
     * 3. dp大小为nums.length * （sum/2+1）
     * 4. 转移方程：dp[i][j] = dp[i-1][j]||dp[i-1][j-nums[i]]
     * 5. 方向：从上到下，从左到右
     * 6. 初始化：dp[0][nums[0]]=true;
     */
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if ((sum&1) != 0)
            return false;
        boolean dp[][] = new boolean[nums.length][(sum/2)+1];
        if (nums[0] <= sum/2)
            dp[0][nums[0]] = true;
        for (int i = 1; i < nums.length ; i++) {
            for (int j = 1; j <= sum/2 ; j++) {
                if (j < nums[i])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i]];
            }
        }
        return dp[nums.length-1][sum/2];
    }

    public static void main(String[] args) {
        canPartition(new int[] {1,1});
    }
}
