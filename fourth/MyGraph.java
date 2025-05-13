package fourth;
import fourth.Vertex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MyGraph<T> {

    ArrayList<Vertex> vertexList = new ArrayList<>();

    public void addVertex(Vertex vertexToAdd){
        vertexList.add(vertexToAdd);
    }

    public ArrayList<Vertex> getAllVertices(){
        return vertexList;
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