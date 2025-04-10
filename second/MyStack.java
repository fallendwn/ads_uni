package second;
import second.ArrayList;
public class MyStack {
    //empty,size,peek, push,pop
    private ArrayList<Integer> stack = new ArrayList<Integer>();
    public boolean isEmpty(){
        return stack.getSize() == 0;
    }
    public int size(){
        return stack.getSize();
    }
    public void push(int value){
        stack.addLast(value);
    }
    public int pop(){
        int temp = stack.getLast();
        stack.removeLast();
        return temp;
    }
    public int peek(){
        return stack.getLast();
    }



}
