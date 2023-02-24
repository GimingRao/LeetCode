package Topic;

import java.util.Arrays;
import java.util.Comparator;

public class Topic179 {
    public String largestNumber(int[] nums) {
        String[] sortNums=new String[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            sortNums[i]=""+nums[i];
        }
        Arrays.sort(sortNums, (o1, o2) -> {
            String o1Frist=o1+o2;
            String  o2Frist=o2+o1;
            return o2Frist.compareTo(o1Frist);
        });
        StringBuilder res=new StringBuilder();
        for(String sortNum:sortNums) res.append(sortNum);
        int length=res.length();
        int i=0;
        for (; i < length-1; i++) {
            if (res.charAt(i)!='0')
                break;
        }
        return res.substring(i);
    }
}
