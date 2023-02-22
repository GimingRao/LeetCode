package Test;

import Topic.Topic134;
import Topic.Topic15;
import Topic.Topic150;
import Topic.Topic162;

public class TestArray {
    public  static int[]TestGas=new int[]{1,2,3,1};
    public  static int[]TestCost=new int[]{1,2,2};

    public static void main(String[] args) {
        Topic162 testUnit=new Topic162();
        System.out.println(testUnit.findPeakElement(TestGas));
    }
}
