package algorithm;

import java.util.*;

public class QuickSort {
    public static void quickSort(int[] nums){
        f(nums,0, nums.length-1);
    }
    /*
    left:左闭
    right:右闭
     */
    public static void f(int[] nums,int left,int right){
        if (right==left)
            return;
        int objNum=nums[right];
        int leftFlag=left-1;
        int rightFlag=right+1;
        for (int i = leftFlag+1; i <rightFlag ; i++) {
            if (nums[i]<objNum){
                swap(nums,leftFlag+1,i);
                leftFlag++;
            }else if (nums[i]>objNum){
                swap(nums,rightFlag-1,i);
                rightFlag--;
                i--;
            }
        }
        if (leftFlag>left)
            f(nums,left,leftFlag);
        if (rightFlag<right)
            f(nums,rightFlag,right);
    }
    public static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
    public static void main(String[] args) {
        Random r=new Random();
        int length=r.nextInt(15);
        int[] testUnit=new int[length];
        for (int i = 0; i < length; i++) {
            testUnit[i]=r.nextInt(100);
        }
//        int[] testUnit=new int[]{54, 21, 74, 82};
        System.out.println(Arrays.toString(testUnit));
        quickSort(testUnit);
        System.out.println(Arrays.toString(testUnit));
    }
}
