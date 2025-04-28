package third;
import third.MyHashTable;
public class testing {
    public static void main(String args[]) {
        MyHashTable<Integer, Integer> myHashTable = new MyHashTable<>(99);
        myHashTable.put(1, 1);
        myHashTable.put(2, 2);
        myHashTable.put(3, 3);
        myHashTable.put(4, 4);
        myHashTable.put(1,66);
        System.out.println(myHashTable.get(1));
        myHashTable.remove(2);
        System.out.println(myHashTable.get(2));
        System.out.println(myHashTable.contains(4));
        System.out.println(myHashTable.getKey(66));
    }

}
