package second;
import second.ArrayList;
public class MyQueue {
    private ArrayList<Integer> queue = new ArrayList<Integer>();
    private int size = 0;
    public void enqueue(int data){
        queue.addLast(data);
        size++;
    }
    public void print(){
        queue.print();
    }
    public int dequeue(){
        if (size>0) {
            int temp = queue.getFirst();
            queue.removeFirst();
            size--;
            return temp;
        }
        return -1;
    }
    public int peek(){
        return queue.getFirst();
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        return false;
    }
}
