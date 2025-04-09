package second;

public class ArrayList <T extends Comparable<T>> {
    private Object[] array;
    private int size;
    private int capacity = 5;
    public ArrayList(){
        array = new Object[capacity];
    }

    public T get(int index){
        return (T) array[index];
    }
    public int getSize(){
        return size;
    }
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            array[index] = element;
        }
    }

    public void addFirst(T element) {
        if(size == capacity) {
            increaseBuffer();
        }
        T temp = element;
        for(int i = size ; i >= 1 ; i --){
            array[i] = array[i-1];

        }
        array[0] = element;
        size++;
    }

    public T getFirst(){
        return (T) array[0];
    }

    public T getLast(){
        return (T) array[size-1];
    }

    public void addLast(T newItem){
        if(size == capacity){
            increaseBuffer();
        }
        array[size++] = newItem;
    }

    public void add(T newItem, int index){
        if (index < 0 || index >= size+1) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity){
            increaseBuffer();

        }
        if (size>0){
            for(int i = size ; i >= index ; i --){
                if(i == 0){
                    break;
                }
                array[i] = array[i-1];
            }
        }
        array[index] = newItem;
        size++;
    }

    public Object[] toArray(){
        Object[] array1 = new Object[size];
        for(int i = 0 ; i < size ; i ++){
            array1[i] = array[i];
        }
        return array1;
    }
    public int indexOf(T item){
        for(int i = 0 ; i < size ; i ++){
            if(array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T item){
        int temp = -1;
        for(int i = 0 ; i < size ; i ++){
            if(array[i].equals(item)){
                temp = i;
            }
        }
        return temp;
    }


    public void increaseBuffer(){
        capacity = (int) (capacity * 1.5);
        Object[] array2 = new Object[capacity];
        for(int i = 0 ; i < array.length ; i++){
            array2[i] = array[i];
        }
        array = array2;
    }
    public void sort(){
        int i = 0;
        boolean swapNeeded = true;
        while (i < size - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < size - i; j++) {
                if (((T) array[j - 1]).compareTo((T) array[j]) > 0) {
                    Object temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
    }
    public boolean exists(T item){
        for(int i = 0 ; i < size ; i ++){
            if(array[i].equals(item)){
                return true;
            }
        }
        return false;
    }
    public void remove(int index){
        if (size-1 == index){
            array[index] = null;
        }
        else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
        }
        size--;
    }

    public void removeLast(){
        array[--size] = null;
    }
    public void removeFirst(){
        for(int i = 0 ; i <size ; i++){
            array[i] = array[i+1];
        }
        size--;
    }
    public void clear(){
        array = new Object[capacity];
        size=0;

    }



    public void print(){
        for(int i = 0 ; i < size ; i++){
            System.out.print(array[i] + " ");
        }
    }

}
