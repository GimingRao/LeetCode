package Topic;

public class Topic26 {
    public static int removeDuplicates(int[] nums) {
        int len= nums.length;
        if (len==0)
            return 0;
        int num=nums[0];
        int index=0;
        for (int i = 1; i <len ; i++) {
            if (num == nums[i]) continue;
            num=nums[i];
            swap(nums,++index,i);
        }
        return ++index;
    }
    public static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
}
