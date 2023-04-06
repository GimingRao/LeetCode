package CodeCapriccio.DP;

/**
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 *
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 *
 * @author GimingRao
 * @data 2023/4/6 9:29
 */
public class LongestContinuousIncreasingSubsequence {
    /**
     *
     * @param nums 原序列
     * @return int
     *
     * dp[l][r] = dp[l][r-1]
     * 初始化： dp[i][i] = true
     *         for i in range (0 , n)
     *              if(nums[i] < nums[i-1])
     *                  break;
     *              dp[0][i] = true;
     */
    public int findLengthOfLCIS2(int[] nums) {
        int length = nums.length;
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        int max = 1;

        for (int i = 1; i < length; i++) {
            if ( nums[i] <= nums[i-1])
                break;
            dp[0][i] = true;
            max = Math.max(max , i+1);
        }


        for (int i = 1; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                dp[i][j] = dp[i][j-1] && (nums[i] > nums[i-1]);
                if (dp[i][j])
                    max = Math.max(max , j-i+1);
            }
        }
        return max;
    }
}
