package second;

public class ArrayList <T extends Comparable<T>> {
    private Object[] array;
    private int size;
    private int capacity = 5;
    public ArrayList(){
        array = new Object[capacity];
    }
    //value by index of array
    public T get(int index){
        return (T) array[index];
    }
    public int getSize(){
        return size;
    }
    //changes the value of indexed value in array
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            array[index] = element;
        }
    }
    //loop starts from the end. Next element takes the value of previous one, then 0th element
    //== to passed element
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
    //array[0]
    public T getFirst(){
        return (T) array[0];
    }
    //array[size-1] size-1, because index starts from 0
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
                //element gets the value of previous one
                array[i] = array[i-1];
            }
        }
        //ends loop on index, because there is no need to push it further.
        //then array[index] = newItem
        array[index] = newItem;
        size++;
    }
//creates new array1, then rewrites same values from array and then returns array1
    public Object[] toArray(){
        Object[] array1 = new Object[size];
        for(int i = 0 ; i < size ; i ++){
            array1[i] = array[i];
        }
        return array1;
    }
    //if value equals to iterated object, returns i
    public int indexOf(T item){
        for(int i = 0 ; i < size ; i ++){
            if(array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    //same logic, but does not return i instantly, but returns the temp variable, that rewrites all the time until
    // the last founded element
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
    //bubble sort
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
    //same logic as in index, but with boolean value
    public boolean exists(T item){
        for(int i = 0 ; i < size ; i ++){
            if(array[i].equals(item)){
                return true;
            }
        }
        return false;
    }
    //removes the element, and then iterated element gets the value of next element
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
    //removes last and decreases the size
    public void removeLast(){
        array[--size] = null;
    }
    //same logic as in remove, but with index 0
    public void removeFirst(){
        for(int i = 0 ; i <size ; i++){
            array[i] = array[i+1];
        }
        size--;
    }
    //array = new Object
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
