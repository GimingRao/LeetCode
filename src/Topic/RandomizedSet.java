package Topic;

import java.util.*;

class RandomizedSet {
    Map<Integer,Integer> index;
    List<Integer> allNum;
    public RandomizedSet() {
        allNum=new ArrayList<>();
        index=new HashMap<>();
    }

    public boolean insert(int val) {
        if (index.containsKey(val))
            return false;
        int length=allNum.size();
        allNum.add(val);
        index.put(val,length);
        return true;
    }

    public boolean remove(int val) {
        if (!index.containsKey(val))
            return false;
        int length=allNum.size();
        int last=allNum.get(length-1);
        int removeIndex=index.get(val);//得到被删除变量的索引
        //该索引处替换为末尾数字
        allNum.set(removeIndex,last);
        index.put(last,removeIndex);
        //数组删除最后一位
        allNum.remove(length-1);
        index.remove(val);
        return true;
    }

    public int getRandom() {
        Random r=new Random();
        int randomIndex=r.nextInt(allNum.size());
        return allNum.get(randomIndex);
    }
}