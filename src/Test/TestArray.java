package Test;

import Topic.Topic134;
import Topic.Topic15;

public class TestArray {
    public  static int[]TestGas=new int[]{3,1,1};
    public  static int[]TestCost=new int[]{1,2,2};

    public static void main(String[] args) {
        Topic134 testUnit=new Topic134();
        System.out.println(testUnit.canCompleteCircuit(TestGas, TestCost));
    }
}
