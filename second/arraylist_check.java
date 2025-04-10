package second;
import second.ArrayList;
import second.LinkedList;
import second.MyQueue;
import second.MyStack;
import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
public class arraylist_check {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> linked = new LinkedList<>();
        MyQueue queue = new MyQueue();
        Object a = new Object();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(66);
        queue.print();
        queue.dequeue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.print();
//        linked.add(1);
//        linked.add(4);
//        linked.add(3);
//        linked.add(2);
//        linked.add(2);
//        linked.add(2);
//        linked.addIndex(1,6);
//        linked.addFirst(88);
//        linked.addFirst(81);
//        linked.addIndex(7,34287);
//        linked.remove(0);
//        linked.remove(6);
//        linked.remove(2);
//
//        System.out.println(linked.get(0));
//        System.out.println(linked.get(1));
//        System.out.println(linked.get(2));
//        System.out.println(linked.get(3));
//        System.out.println(linked.get(4));
//        linked.sort();
//        System.out.println(Arrays.toString(linked.toArray()));
//        System.out.println(linked.getLast());
//        System.out.println(linked.getFirst());
//        System.out.println(linked.indexOf(2));
//        System.out.println(linked.lastIndexOf(2));
//        System.out.println(linked.exists(88));


//        System.out.println(linked.get(5));
//        System.out.println(linked.get(6));
//        System.out.println(linked.get(7));
//        System.out.println(linked.getLast());



//        list.add(1,0);
//        list.add(2,1);
//        list.add(3,2);
//        list.add(4,3);
//        list.add(5,4);
//        list.add(7,0);
//        list.add(7,2);
//        list.add(7,7);
//        list.addFirst(2);
//        list.addLast(2);
//        list.print();
//        System.out.println();
//        System.out.println(list.get(7));
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        list.addFirst(7);
//        list.remove(3);
//        list.print();
//        System.out.println();
//        list.removeFirst();
//        list.removeLast();
//        list.print();
//        System.out.println();
//        System.out.println(list.indexOf(7));
//        System.out.println(list.lastIndexOf(7));
//        System.out.println(list.exists(5));
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.getSize());
//        list.sort();
//        list.print();





    }
}
