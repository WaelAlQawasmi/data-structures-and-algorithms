package graph.breadth.first;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Vertex {


    String data;
    private  HashMap<Vertex,Integer> edgesList;
    public Vertex(String data) {
        this.data = data;
        edgesList = new HashMap<Vertex,Integer>();
    }

    @Override
    public String toString() {
        return  data ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data);
    }
    public void setEdges(Vertex node ,int weght){
        edgesList.put(node,weght);

    }

    public  int getEdges(Vertex v){
      return   edgesList.get(v);

    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
