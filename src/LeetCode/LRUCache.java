package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public static void main(String[] args) {
        LRU leastRecentlyUsed = new LRU(5);
        leastRecentlyUsed.put(1,2);
        System.out.println(leastRecentlyUsed.get(1));
    }

}
class LRU{
    private class Node{
        int key, value;
        Node prev, next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private Node head = new Node(-1,-1);; //
    private Node tail = new Node(-1,-1);; // Node and tail pointer for easy o(1) retrieval of least recently used element
    private final Map<Integer, Node> map = new HashMap<>(); // HashMap for O(1) retrieval of elements
    int capacity; // capacity of LRU Cache

    public LRU(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void add(Node node){
            Node temp = head.next;
            node.next = temp;
            node.prev = head;
            head.next = node;
            temp.prev = node;
    }

    private void delete(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node resNode = map.get(key);
            int ans = resNode.value;

            map.remove(key);
            delete(resNode);
            add(resNode);

            map.put(key, head.next);
            return ans;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node curr = map.get(key);
            map.remove(key);
            delete(curr);
        }

        if (map.size() == capacity) {
            map.remove(tail.prev.key);
            delete(tail.prev);
        }

        add(new Node(key, value));
        map.put(key, head.next);
    }

}