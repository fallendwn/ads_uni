package fourth;
import fourth.Vertex.*;
import java.util.ArrayList;
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