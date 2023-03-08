package Topic;

import java.util.HashMap;
import java.util.Map;

public class Topic454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer ,Integer> countSum=new HashMap<>();
        for(int A:nums1){
            for (int B:nums2){
                countSum.put(A+B,countSum.getOrDefault(A+B,0)+1);
            }
        }

        for (int C : nums3) {
            for (int D : nums4) {
                int neddSum = -(C + D);
                if (countSum.containsKey(neddSum))
                    res+=countSum.get(neddSum);
            }
        }
        return res;
    }
}
