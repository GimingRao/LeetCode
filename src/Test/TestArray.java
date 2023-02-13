package Test;

import Topic.Topic15;

public class TestArray {
    public  static int[]TestCase=new int[]{0,0,1};

    public static void main(String[] args) {
        Topic15 testUnit=new Topic15();
        System.out.println(testUnit.threeSum(TestCase));
    }
}
