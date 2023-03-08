package CodeCapriccio.array;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {
        int start=0;
        int end=0;
        Map<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        while (end<fruits.length){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while (map.size()>2){
                map.put(fruits[start],map.get(fruits[start])-1);
                if (map.get(fruits[start])==0)
                    map.remove(fruits[start]);
                start++;
            }
            max=Math.max(max, end-start+1);
            end++;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

}
