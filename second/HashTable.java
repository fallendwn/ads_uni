package second;

public class HashTable {
    private HashNode[] buckets;
    private int size;
    private int capacity;
    private class HashNode {
        private String key;
        private int value;
        private HashNode next;
        private HashNode(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public HashTable(int capacity){
        this.capacity = capacity;
        buckets = new HashNode[capacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void put(String key, int value){
        if (size == 0 ) {
            buckets[size] = new HashNode(key, value);
        }
        else{

        }
    }

}
