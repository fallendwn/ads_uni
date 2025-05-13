package fourth;

import java.util.HashMap;

public class Vertex<T>{
    public T value;

    public Vertex(T value ){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public HashMap<Vertex<T>, Double> adjVertexes = new HashMap<>();
    public void addVertex(Vertex<T> target, double weight ){
        adjVertexes.put(target, weight);
    }

    public void getWeight(Vertex<T> target){
        adjVertexes.get(target);

    }


    public HashMap getAdj(){
        return adjVertexes;
    }

    public T getData(){
        return value;
    }

    public void printGraph() {
        for (Vertex<T> vertex : adjVertexes.keySet()) {
            System.out.print(vertex.getData() + ": " + adjVertexes.get(vertex) + "\n");

        }
    }
//        for(int i = 0 ; i < adjVertexes.size() ; i++){
//
//            data += adjVertexes.entrySet();
//
//        }

}