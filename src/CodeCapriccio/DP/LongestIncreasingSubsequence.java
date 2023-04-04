package CodeCapriccio.DP;

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 * @author GimingRao
 * @data 2023/4/4 18:59
 */
public class LongestIncreasingSubsequence {
    /**
     * @param nums 序列
     * @return int
     * dp[i] 表示以第i个数为结尾的子序列
     * dp[i] = max(dp[j])+1, 0<=j<i & nums[j]< nums[i]
     * dp[0] = 1
     */
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = 1;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i] , dp[j]) ;
            }
            dp[i] += 1;
        }
        int max = Integer.MIN_VALUE;
        for (int valuesOfDp :
                dp) {
            max = Math.max(valuesOfDp , max);
        }
        return max;
    }

}
