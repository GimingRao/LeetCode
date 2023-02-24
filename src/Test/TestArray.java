package Test;

import Topic.*;

public class TestArray {
    public  static int[]TestGas=new int[]{3,30,34,5,9};
    public  static int[]TestCost=new int[]{1,2,2};

    public static void main(String[] args) {
        Topic179 testUnit=new Topic179();
        System.out.println(testUnit.largestNumber(TestGas));
    }
}
