package Test;

import Topic.Topic134;
import Topic.Topic15;
import Topic.Topic150;

public class TestArray {
    public  static int[]TestGas=new int[]{3,1,1};
    public  static int[]TestCost=new int[]{1,2,2};

    public static void main(String[] args) {
        Topic150 testUnit=new Topic150();
        System.out.println(testUnit.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
