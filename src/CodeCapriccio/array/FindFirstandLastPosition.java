package CodeCapriccio.array;

import java.util.Arrays;

public class FindFirstandLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        int ansL=-1;
        int ansR=-1;
        while (left<=right){
            int mid=left+((right-left)>>1);
            int numMid=nums[mid];
            if (numMid==target){
                if (mid==0||nums[mid-1]!=numMid){
                    ansL=mid;
                    break;
                }
                right=mid-1;
            }
            else if (numMid<target)
                left=mid+1;
            else
                right=mid-1;
        }
        if (ansL==-1)
            return new int[]{ansL,ansR};
        left=ansL;
        right=nums.length-1;
        while (left<=right){
            int mid=left+((right-left)>>1);
            int numMid=nums[mid];
            if (numMid==target){
                if (mid==nums.length-1||nums[mid+1]!=numMid){
                    ansR=mid;
                    break;
                }
                left=mid+1;
            }
            else if (numMid<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return new int[]{ansL,ansR};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
    }
}
