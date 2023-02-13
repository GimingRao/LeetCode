package Test;

import Topic.Topic22;
import Topic.Topic29;


public class TestNumber {
    static int n=3;
    static Topic22 testObj=new Topic22();
    static Topic29 testdivid=new Topic29();

    public static void main(String[] args) {
        System.out.println(testdivid.divide(-2147483648, 1));
    }
}
