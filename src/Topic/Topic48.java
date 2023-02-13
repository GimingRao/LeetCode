package Topic;

public class Topic48 {
    public void rotate(int[][] matrix) {
        mainDiagnol(matrix);
        leftRightSymmetric(matrix);
    }
    public void mainDiagnol(int[][] matrix){
        int length=matrix.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                matrix[i][j]^=matrix[j][i];
                matrix[j][i]^=matrix[i][j];
                matrix[i][j]^=matrix[j][i];
            }
        }
    }
    public  void leftRightSymmetric(int[][]matrix){
        int length=matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++) {
                matrix[i][j]^=matrix[i][length-1-j];
                matrix[i][length-1-j]^=matrix[i][j];
                matrix[i][j]^=matrix[i][length-1-j];
            }
        }
    }
}
