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

    public T get(int index){
        MyNode<T> returning = head;
        for (int i = 0 ; i < index ; i ++){
            returning = returning.next;
        }

        return returning.data;
    }
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
    public void addLast(T newItem){
        add(newItem);
    }
    public void addFirst(T newItem){
        MyNode<T> newNode = new MyNode<T>(newItem);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public T getFirst(){
        return head.data;
    }
    public T getLast(){
        return tail.data;
    }

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
    public void removeFirst(){
        remove(0);
    }
    public void removeLast(){
        remove(size - 1);
    }

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

    public Object[] toArray(){
        MyNode<T> current = head;
        Object[] result = new Object[size];
        for(int i = 0 ; i < size ; i ++){
            result[i] = current.data;
            current = current.next;
        }
        return result;
    }
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
