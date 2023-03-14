package CodeCapriccio.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int length= nums.length;
        if (length<4)
            return ans;
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (i>0&&nums[i]==nums[i-1])
                continue;
            if (nums[i]>target&&nums[i]>0)
                break;
            for (int j = i+1; j < length; j++) {
                if (j>i+1&&nums[j]==nums[j-1])
                    continue;
                if (nums[i]+nums[j]>target&&nums[i]+nums[j]>0)
                    break;
                int left=j+1;
                int right=length-1;
                while (left<right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left],nums[right])));
                        while (left<right&&nums[left] == nums[left + 1]) left++;
                        while ( left<right&&nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        while (left<right&&nums[left] == nums[left + 1]) left++;
                        left++;

                    } else {
                        while (left<right&&nums[right] == nums[right - 1]) right--;
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
    }
}
