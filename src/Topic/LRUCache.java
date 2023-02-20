package Topic;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    public TwoWayLinkNode start;
    public TwoWayLinkNode end;
    public Map<Integer, TwoWayLinkNode> keyNode;
    public Map<Integer,Integer>keyValue;


    public LRUCache(int capacity) {
        this.capacity=capacity;
        start=new TwoWayLinkNode();
        end=new TwoWayLinkNode();
        start.next=end;
        end.pre=start;
        keyNode=new HashMap<>();
        keyValue=new HashMap<>();

    }

    public int get(int key) {
        if(keyValue.containsKey(key)){
            setFrist(key);
            return keyValue.get(key);
        }else
            return -1;
    }

    public void put(int key, int value) {
        if (!keyNode.containsKey(key)&&keyNode.size()==capacity){
            TwoWayLinkNode deleteNode=end.pre;
            deleteNode.pre.next=end;
            end.pre=deleteNode.pre;
            keyNode.remove(deleteNode.key);
            keyValue.remove(deleteNode.key);
        }
        if (!keyNode.containsKey(key)){
            TwoWayLinkNode node=new TwoWayLinkNode(start,start.next,key);
            start.next.pre=node;
            start.next=node;
            keyValue.put(key,value);
            keyNode.put(key,node);
        }else {
            setFrist(key);
            keyValue.put(key,value);
        }
    }
    public void setFrist(int key){
        TwoWayLinkNode curNode=keyNode.get(key);
        curNode.pre.next=curNode.next;
        curNode.next.pre=curNode.pre;
        start.next.pre=curNode;
        curNode.next=start.next;
        curNode.pre=start;
        start.next=curNode;
    }
}


class TwoWayLinkNode {
    TwoWayLinkNode pre;
    TwoWayLinkNode next;
    int key;

    public TwoWayLinkNode() {
    }

    public TwoWayLinkNode(int key) {
        this.key = key;
    }

    public TwoWayLinkNode(TwoWayLinkNode pre, TwoWayLinkNode next, int key) {
        this.pre = pre;
        this.next = next;
        this.key = key;
    }
}
