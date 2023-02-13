package Topic;

import java.util.*;

public class Topic15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        Set<String>  distinct=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int resOne=nums[i];
            int left=i+1;
            int right= nums.length-1;
            while (left<right){
                int sumLeftAndRight=nums[left]+nums[right];
                if (sumLeftAndRight>-resOne){
                    right--;
                }else if (sumLeftAndRight<-resOne){
                    left++;
                }else {
                    String testRe=resOne+"-"+nums[left]+"-"+nums[right];
                    if (!distinct.contains(testRe)) {
                        distinct.add(testRe);
                        res.add(Arrays.asList(resOne, nums[left], nums[right]));
                    }
                    right--;
                    left++;
                }
            }
        }
        return res;

    }
}
