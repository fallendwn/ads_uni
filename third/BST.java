package third;
import java.util.ArrayList;
import java.util.Stack;
public class BST<K extends Comparable<K>, V> {
    public Node root;
    public int size = 0;
    private class Node{
        private K key;
        private V value;
        private Node left, right;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
        private K getKey(){
            return this.key;
        }
        private V getValue(){
            return this.value;
        }

    }
    public void put(K key, V value){
        Node prevNode = null;
        Node current = root;
        if (size == 0) {
            root = new Node(key, value);
            size++;
            return;
        }
        else{
            while(current != null){
                prevNode = current;
                if(key.compareTo(current.key) < 0){
                    current = current.left;
                }
                else if(key.compareTo(current.key) > 0){
                    current = current.right;
            }
                else{
                    current.value = value;
                    return;
                }
            }
            if (key.compareTo(prevNode.key) < 0) {
                prevNode.left = new Node(key, value);
            } else {
                prevNode.right = new Node(key, value);
            }
            size++;
        }

    }
    public V get(K key){
        Node current = root;
        while(current != null){
            if(key.compareTo(current.key) < 0){
                current = current.left;
            }
            else if (key.compareTo(current.key) > 0){
                current = current.right;
            }
            else{
                return current.getValue();
            }
        }
        return null;
    }
    public void delete(K key){
        Node current = root;
        Node prevNode = null;
        while(current != null){
            if(key.compareTo(current.key) < 0){
                prevNode = current;
                current = current.left;
            }
            else if (key.compareTo(current.key) > 0){
                prevNode = current;
                current = current.right;
            }
            else{
                //tough moments;;;;;;;;;
                // zero children ?
                if (current.left == null && current.right == null){
                    if(current == root){
                        root = null;
                    }
                    else{
                        if(prevNode.left == current){
                            prevNode.left = null;
                        }
                        else{
                            prevNode.right = null;
                        }
                    }
                }
                //right child exists?
                else if (current.left == null){
                    if(current == root){
                        root = current.right;
                    }
                    else if(prevNode.left == current){
                        prevNode.left = current.right;
                    }
                    else{
                        prevNode.right = current.right;
                    }

                }
                //right is null
                else if (current.right == null){
                        if(current == root){
                            root = current.left;
                        }
                        else if(prevNode.left == current){
                            prevNode.left = current.left;
                        }
                        else{
                            prevNode.right = current.left;

                        }
                }
                else{
                    Node changeable = current;
                    Node changeableRight = current.right;
                    while (changeableRight.left != null) {
                        changeable = changeableRight;
                        changeableRight = changeableRight.left;
                    }
                    current.key = changeableRight.key;
                    current.value = changeableRight.value;
                    if (changeable.left == changeableRight){
                        changeable.left = changeableRight.right;
                    }
                    else{
                        changeable.right = changeableRight.right;
                    }
                }

                size--;
                return;


            }
        }

    }
    public ArrayList<Node> iterator(){
        Stack<Node> stack = new Stack<Node>();
        ArrayList<Node> set_of_elements = new ArrayList<Node>();
        Node current = root;
        while(current != null || stack.size() != 0){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            set_of_elements.add(current);
            current = current.right;

        }
        return set_of_elements;
    }
    public int size(){
        return size;
    }

}
