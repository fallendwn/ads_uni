package second;
import second.ArrayList;
public class MyHeap {
    //empty, size, insert, getMin, exctractMin (ubiraet element) heapify (sorting), leftchild of, rightchildof, parentof, swap
    ArrayList<Integer> heap = new ArrayList<Integer>();
    public boolean empty(){
        return heap.getSize() == 0;
    }
    public int size(){
        return heap.getSize();
    }

    public void insert(int data){
        heap.addLast(data);
        
    }

    public int getMin(){
        return heap.get(0);

    }

}
