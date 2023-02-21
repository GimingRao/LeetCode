package Topic;

public class Topic152 {
    public int maxProduct(int[] nums) {
        int[] max=new int[nums.length];
        int[] min=new int[nums.length];
        max[0]=nums[0];
        min[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            max[i]=Math.max(nums[i],Math.max(nums[i]*max[i-1],nums[i]*min[i-1] ));
            min[i]=Math.min(nums[i],Math.min(nums[i]*max[i-1],nums[i]*min[i-1] ));
        }
        int res=Integer.MIN_VALUE;
        for (int maxInt:
             max) {
            res=Math.max(maxInt,res);
        }
        return res;
    }
}
