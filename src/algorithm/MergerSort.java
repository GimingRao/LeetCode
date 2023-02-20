package algorithm;

import java.util.Arrays;

public class MergerSort {
    public static int[] mergerSort(int [] nums){
        if (nums.length==1)
            return nums;
        int mid= nums.length/2;
        int[] left=Arrays.copyOfRange(nums,0,mid);
        int[] right=Arrays.copyOfRange(nums,mid,nums.length);
        left=mergerSort(left);
        right=mergerSort(right);
        int leftIndex=0;
        int rightIndex=0;
        int [] res=new int[nums.length];
        while (leftIndex!=mid||rightIndex!= right.length){
            if (rightIndex== right.length||(leftIndex!=mid&&left[leftIndex]<right[rightIndex])){
                res[leftIndex+rightIndex]=left[leftIndex];
                leftIndex++;
                continue;
            }
            if (leftIndex==mid||(left[leftIndex]>=right[rightIndex])){
                res[leftIndex+rightIndex]=right[rightIndex];
                rightIndex++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tesUnit=new int[]{123,232,43,123};
        tesUnit=mergerSort(tesUnit);
        System.out.println(Arrays.toString(tesUnit));
    }
}
