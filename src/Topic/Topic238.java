package Topic;

public class Topic238 {
    public static int[] productExceptSelf(int[] nums) {
        int length= nums.length;
        int[] ans=new int[length];
        int right=1;
        ans[0]=1;
        for (int i = 1; i < length; i++) {
            ans[i]=ans[i-1]*nums[i-1];
        }
        for (int i = length-1; i >=0 ; i--) {
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }
}
