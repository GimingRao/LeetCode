package Topic;

import java.util.HashMap;
import java.util.Map;

public class Topic240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        Map<String ,Boolean>dp=new HashMap<>();
        return f(matrix,target,0,0,dp);
    }
    public static boolean f(int [][] matrix,int target ,int curX, int curY,Map<String,Boolean> dp){
        String index=curX+"_"+curY;
        if (dp.containsKey(index))
            return dp.get(index);
        if (curX>=matrix.length||curY>=matrix[0].length||matrix[curX][curY]>target) {
            dp.put(index,false);
            return false;
        }
        if (matrix[curX][curY]==target){
            dp.put(index,true);
            return true;
        }
        boolean ans=f(matrix,target,curX,curY+1,dp)||f(matrix,target,curX+1,curY,dp);
        dp.put(index,ans);
        return ans;
    }

    public static void main(String[] args) {
        int[][] testUnit=new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(testUnit, 5));
    }
}
