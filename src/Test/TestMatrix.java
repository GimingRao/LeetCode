package Test;

import Topic.Topic48;
import Topic.Topic73;

import java.util.Arrays;

public class TestMatrix {
     static  int[][] matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9},{0,3,0}};

    public static void main(String[] args) {
        Topic73 testUnit=new Topic73();
        testUnit.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
