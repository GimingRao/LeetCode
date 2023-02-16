package Test;

import Topic.Topic130;
import Topic.Topic48;
import Topic.Topic73;

import java.util.Arrays;

public class TestMatrix {
     static  char[][] matrix=new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','O','O','X'},{'X','O','X','X'}};
     static  char[][] matrix2=new char[][]{{'O','O'},{'O','O'}};

    public static void main(String[] args) {
        Topic130 testUnit=new Topic130();
        testUnit.solve_dfs(matrix2);
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }
    }
}
