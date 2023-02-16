package Topic;

import java.util.HashSet;
import java.util.Set;

public class Topic128 {
    public int longestConsecutive(int[] nums) {
        //新建哈希集合，将寻找i+1的复杂度降低到O(1)
        Set<Integer> hashNums=new HashSet<>();
        for (int num :
                nums) {
            hashNums.add(num);
        }
        int res=0;
        for (int num: hashNums) {
            if (hashNums.contains(num-1))
                continue;
            int ans=1;
            while (hashNums.contains(num+1)){
                ans++;
                num++;
            }
            res= Math.max(res, ans);
        }
        return res;
    }
}
