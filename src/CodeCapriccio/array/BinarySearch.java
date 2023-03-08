package CodeCapriccio.array;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        while (left<=right){
            int mid=left+((right-left)>>1);
            int numMid=nums[mid];
            if (numMid==target)
                return mid;
            if (numMid<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        search(new int[]{-1,0,3,5,9,12},9);
    }
}
