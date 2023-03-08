package CodeCapriccio.array;

public class MinimumSizeSubarraySum  {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int length= nums.length;
        int left=0,right=0;//左闭右闭
        int ans=Integer.MAX_VALUE;
        while (right<length){
            sum+=nums[right];
            while (sum>=target){
                ans=Math.min(ans,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
