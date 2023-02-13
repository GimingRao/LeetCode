package Topic;

import java.util.List;

public class Topic73 {
    public void setZeroes(int[][] matrix) {
        boolean[] isZeroX=new boolean[matrix.length];
        boolean[] isZeroY=new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0){
                    isZeroX[i]=true;
                    isZeroY[j]=true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isZeroX[i]||isZeroY[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
