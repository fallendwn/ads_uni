package third;

public class MyHashTable<K,V> {
    private int size;
    public hashNode<K,V> table[];
    private static class hashNode<K,V> {
        private Object value;
        private Object key;
        private hashNode<K,V> next;

        private hashNode(K key, V value) {
            this.value = value;
            this.key = key;
        }

        private V getValue(){
            return (V) this.value;
        }
        private K getKey(){
            return (K) this.key;
        }


    }
    public MyHashTable(int size) {
        this.table = new hashNode[size];
        this.size = size;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put (K key, V value){
        boolean findKey = false;
        int hash = hash(key);
        hashNode<K,V> thisNode = table[hash];
        if(thisNode == null) {
            table[hash] = new hashNode(key, value);
            return;
        }
        hashNode<K,V> prevNode = null;
        while (thisNode!=null){
            if(thisNode.getKey().equals(key)){
                thisNode.value = value;
                return;
            }
            prevNode = thisNode;
            thisNode = thisNode.next;
        }
        prevNode.next = new hashNode(key,value);


    }

    public V get(K key){
        int hash = hash(key);
        hashNode<K,V> thisNode = table[hash];
        if(thisNode == null){
            return null;
        }
        while(thisNode != null) {
            if(thisNode.getKey().equals(key)){
                return thisNode.getValue();
            }
            thisNode = thisNode.next;
        }
        return null;
    }

    public V remove(K key){

        int hash = hash(key);
        hashNode<K,V> thisNode = table[hash];
        hashNode<K,V> prevNode = null;
        V returnValue = null;
        while (thisNode != null){
            if(thisNode.getKey().equals(key)){
                if (prevNode == null){
                    returnValue = thisNode.getValue();
                    table[hash] = thisNode.next;
                    return returnValue;

                }
                else{
                    returnValue = thisNode.getValue();
                    prevNode.next = thisNode.next;
                    return returnValue;
                }
            }
            prevNode = thisNode;
            thisNode = thisNode.next;
        }
        return returnValue;

    }
    public boolean contains(V value){
        hashNode<K,V> thisNode = null;
        for(int i = 0 ; i < table.length ; i++){
            thisNode = table[i];
            while(thisNode != null){
                if(thisNode.getValue().equals(value)){
                    return true;
                }
                thisNode = thisNode.next;
            }
        }
        return false;

    }
    public K getKey(V value){
        hashNode<K,V> thisNode = null;
        for(int i = 0 ; i < table.length ; i++){
            thisNode = table[i];
            while(thisNode != null){
                if(thisNode.getValue().equals(value)){
                    return thisNode.getKey();
                }
                thisNode = thisNode.next;
            }
        }
        return null;
    }
}
