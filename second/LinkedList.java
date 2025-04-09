package second;

public class LinkedList<T extends Comparable<T>> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
//Because tail and head has a connection, in else statement tail.next becomes newItem node and then,
    // because tail always is the end, it becames newItem node.
    public void add(T newItem){
        MyNode<T> Node = new MyNode<T>(newItem);
        if (head == null){
            head = Node;
            tail = Node;
        }
        else{
            tail.next = Node;
            tail = Node;
        }
        size++;
    }
//it pushes nodes by .next method and then, returns the data of needed node.
    public T get(int index){
        MyNode<T> returning = head;
        for (int i = 0 ; i < index ; i ++){
            returning = returning.next;
        }

        return returning.data;
    }
    //pushes head node until it reaches the index value
    //then newnode.next takes all nodes from current.next
    //then current.next becames newNode
    public void addIndex(int index, T newItem){
        if(index != size) {
            MyNode<T> newNode = new MyNode<T>(newItem);
            MyNode<T> current = head;
            for (int i = 0; i < index-1; i++) {
                current = current.next;

            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
        else{
            add(newItem);
        }
    }
    //add method, same logic
    public void addLast(T newItem){
        add(newItem);
    }
    //creates new node series, and takes head series of nodes to newNode.next
    //then head becames this newNode
    public void addFirst(T newItem){
        MyNode<T> newNode = new MyNode<T>(newItem);
        newNode.next = head;
        head = newNode;
        size++;
    }
    //gets the data from head
    public T getFirst(){
        return head.data;
    }
    //gets the data from tail
    public T getLast(){
        return tail.data;
    }
    //pushes nodes until index, then interchange the data between nodes.
    public void set(int index, T newItem){
        MyNode<T> returning = new MyNode<T>(newItem);
        for (int i = 0 ; i < size ; i ++){
            if(i == index){
                head.data = returning.data;
            }
            head = head.next;

        }
        if(index == size){
            tail = returning;
        }
    }

    public void remove(int index){
        MyNode<T> current = head;
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;

            }
        }
        else {
            //pushes nodes, then next node becames node after next
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if(index == size-1){
                tail = current;
            }
        }
        size--;

    }
    //remove index 0
    public void removeFirst(){
        remove(0);
    }
    //remove size-1
    public void removeLast(){
        remove(size - 1);
    }
    //pushes nodes through nodes, and checks the data. if data satisfies the object value, keep
    //iteration number and breaks (no need to find others)
    public int indexOf(Object object){
        int result = -1;
        MyNode<T> current = head;
        for(int i = 0 ; i < size ; i ++){
            if(object.equals(current.data)){
                result = i;
                break;
            }
            current = current.next;
        }
        return result;
    }
    //same logic, but does not stops on first finding.
    public int lastIndexOf(Object object){
        int result = -1;
        MyNode<T> current = head;
        for(int i = 0 ; i < size ; i ++){
            if(object.equals(current.data)){
                result = i;
            }
            current = current.next;
        }
        return result;
    }
    //same logic as in index, but with boolean value
    public boolean exists(Object object){
        boolean result = false;
        MyNode<T> current = head;
        for(int i = 0 ; i < size ; i ++){
            if(object.equals(current.data)){
                result = true;
            }
            current = current.next;
        }
        return result;
    }
    //simple bubble sort, but when the I loop ends, pushes the node.
    public void sort(){
        T temp;
        MyNode<T> current = head;
        for(int i = 0 ; i < size ; i ++){
            current = head;
            for(int j = 0 ; j < size-i-1 ; j ++){
                if (current.data.compareTo(current.next.data) > 0){
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }


        }
    }
    //Rewrite nodes data into new array and returns the array
    public Object[] toArray(){
        MyNode<T> current = head;
        Object[] result = new Object[size];
        for(int i = 0 ; i < size ; i ++){
            result[i] = current.data;
            current = current.next;
        }
        return result;
    }
    //head null tail null
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    public static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode(E data){
            this.data = data;
        }
    }
}
