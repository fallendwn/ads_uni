package fourth;
import fourth.Vertex.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class MyGraph<T> {

    ArrayList<Vertex> vertexList = new ArrayList<>();

    public void addVertex(Vertex vertexToAdd){
        vertexList.add(vertexToAdd);
    }

    public ArrayList<Vertex> getAllVertices()
    {
        return vertexList;
    }

    public class DepthFirstSearch {

        Stack<Vertex<T>> NodesInStack = new Stack<>();
        ArrayList<Vertex<T>> checkedNodes = new ArrayList<>();

        public boolean exists(T value){
            if (vertexList.isEmpty()){
                return false;
            }
            Vertex<T> start = vertexList.get(0);
            NodesInStack.push(start);
            while(!NodesInStack.isEmpty()){

                Vertex<T> current = NodesInStack.pop();

                if(!checkedNodes.contains(current)){

                    checkedNodes.add(current);

                    if(current.getValue().equals(value)){
                        return true;
                    }

                    for(Vertex<T> neigbours : current.adjVertexes.keySet()){
                        if(!checkedNodes.contains(neigbours)){
                            NodesInStack.push(neigbours);
                        }
                    }

                }
            }
            return false;

        }
    }

    public class DijkstraAlg{

        public double Dijkstra(Vertex<T> start, Vertex<T> end){

            HashMap<Vertex<T>, Double> map = new HashMap<>();
            ArrayList<Vertex<T>> visited = new ArrayList<>();
            for(Vertex<T> vertex : vertexList){

                map.put(vertex, Double.POSITIVE_INFINITY);

            }
            map.replace(start, 0.0);
            Vertex<T> current = start;
            Vertex<T> newCurrent = null;
            double minDistance = Double.POSITIVE_INFINITY;
            while(!visited.contains(end)){
                Double temp_counter = Double.POSITIVE_INFINITY;
                for(Vertex<T> neighbours : current.adjVertexes.keySet()){
                    if(!visited.contains(neighbours)){
                        minDistance = map.get(current) + current.adjVertexes.get(neighbours);
                        if (minDistance < map.get(neighbours)) {
                            map.put(neighbours, minDistance);
                        }
                    }

                }
                Double tempForWeight = Double.POSITIVE_INFINITY;
                for(Vertex<T> neighbours : map.keySet()){

                    if(map.get(neighbours) < tempForWeight && map.get(neighbours) != Double.POSITIVE_INFINITY && !visited.contains(neighbours)){
                        tempForWeight = map.get(neighbours);
                        newCurrent = neighbours;
                    }

                }
                visited.add(current);
                if (newCurrent == null) {
                    System.out.println("Путь не найден.");
                    return -1;
                }
                else{
                    current = newCurrent;
                }

        }


        return map.get(end);
    }


    }
    @Override
    public String toString(){
        String data = new String();
        for(int i = 0 ; i < vertexList.size() ; i++){
            data+=((T) vertexList.get(i).getData());
            data+=' ';

        }
        return data;
    }


}