package Test;

import Topic.LRUCache;

public class TestClass {
    public static void main(String[] args) {
        LRUCache testUnit=new LRUCache(2);
        testUnit.put(1,1);
        testUnit.put(2,2);
        testUnit.get(1);
        testUnit.put(3,3);
        System.out.println(testUnit.keyValue);
    }
}
