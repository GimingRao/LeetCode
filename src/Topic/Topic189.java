package Topic;

public class Topic189 {
    public void rotate(int[] nums, int k) {
        int N= nums.length;
        k=k%N;
        for (int i = 0; i < N/2; i++) {
            swap(nums,i,N-i-1);
        }
        for (int i=0;i<k/2;i++){
            swap(nums,i,k-i-1);
        }
        for (int i=0;i<(N-k)/2;i++){
            swap(nums,k+i,N-i-1);
        }
    }
    public void swap(int[] nums,int i ,int j){
        nums[i]^=nums[j];
        nums[j]^=nums[i];
        nums[i]^=nums[j];
    }
}
