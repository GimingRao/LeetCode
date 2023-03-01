package Topic;

public class Topic215 {
    //堆排序解决
    public static int findKthLargest(int[] nums, int k) {
        int length= nums.length;
        buildHeap(nums);
        for (int i = 1; i < k; i++) {
            swap(nums,0,length-i);
            heapify(nums,0,length-i);
        }
        return nums[0];
    }
    public static  void buildHeap(int[] nums){
        int length= nums.length;
        for (int i = (nums.length-1)/2; i >=0 ; i--) {
            heapify(nums,i,length);
        }
    }
    public static void heapify(int[] nums,int i,int length){
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        if (left<length&&nums[left]>nums[largest]) largest=left;
        if (right<length&&nums[right]>nums[largest]) largest=right;
        if (largest!=i){
            swap(nums,i,largest);
            heapify(nums,largest,length);
        }
    }



    //快排解决
    public static int findKthLargest2(int[] nums, int k) {
        int left=0;
        int right= nums.length-1;
        while (true){
            int inedx=partition(nums,left,right);
            if (inedx==k-1) return nums[inedx];
            else if (inedx<k-1) left=inedx+1;
            else right=inedx-1;
        }
    }
    public static  int partition(int [] nums,int left,int right){
        int base=nums[left];
        int scapeLeft=left+1;
        int scapeRight=right;
        while (scapeLeft<=scapeRight){
            if (nums[scapeLeft]<base&&nums[scapeRight]>base){
                swap(nums,scapeLeft++,scapeRight--);
            }else if (nums[scapeLeft]>=base){
                scapeLeft++;
            }else if (nums[scapeRight]<=base){
                scapeRight--;
            }
        }
        swap(nums,left,scapeRight);
        return scapeRight;
    }

    public static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
