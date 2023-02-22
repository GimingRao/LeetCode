package Topic;

public class Topic162 {
    public int findPeakElement(int[] nums) {
        if (nums.length==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if (nums[nums.length-2]<nums[nums.length-1])
            return nums.length-1;
        return f(nums,0,nums.length-1);

    }
    public  int f(int [] nums,int left,int right){
        int mid=(left+right)>>1;
        if (nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])
            return mid;
        if ((nums[left]-nums[left+1])*(nums[mid-1]-nums[mid])<0){
            return f(nums,left,mid);
        }else
            return f(nums,mid,right);
    }
}
