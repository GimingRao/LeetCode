package algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class HeapSort {
    public static  void heapSort(int [] nums){
        buildHeap(nums);
        int len= nums.length;
        for (int i = len-1; i >=0 ; i--) {
            swap(nums,0,i);
            Heapify(nums,0,i);
        }
    }
    public static void buildHeap(int[] nums){
        int len= nums.length;
        for (int i =(len-1)/2; i >=0 ; i--) {
            Heapify(nums,i,len);
        }
    }
    public static  void Heapify(int [] nums,int i,int length){
        if (i>=length)
            return;
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        if (left<length&&nums[left]>nums[largest]) largest=left;
        if (right<length&&nums[right]>nums[largest]) largest=right;
        if (largest!=i){
            swap(nums,i,largest);
            Heapify(nums,largest,length);
        }
    }
    public static void swap(int[] nums ,int i, int j){
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
       testUnit=new int[]{26, 36, 30, 15, 71, 33, 63, 19, 73, 30, 51};
        System.out.println(Arrays.toString(testUnit));
        heapSort(testUnit);
        System.out.println(Arrays.toString(testUnit));
    }
}
