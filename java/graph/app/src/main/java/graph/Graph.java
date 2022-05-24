package graph;

import java.util.*;

public class Graph {


    private final Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public Vertex addNode(String value) {
        Vertex node = new Vertex(value);
        vertices.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    public List<Vertex> getNode(Vertex node) {

        return vertices.get(node);
    }

    public void addEdge(Vertex node1, Vertex node2) {

        vertices.get(node1).add(node2);
        vertices.get(node2).add(node1);

    }


    public Set<Vertex> getNodes() {
if(vertices.keySet().size()==0){
    return null;
}
        return vertices.keySet();


    }

    String printGraph() {

        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : vertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(vertices.get(vertex));
        }

        return strBuilder.toString();
    }

    public int size() {
        return vertices.size();
    }

    public List<Vertex> getNeighbors(Vertex node) {
        return vertices.get(node);

    }
public boolean isEmpty(){
        if(vertices.size()==0){
            return true;

        }
        else {
            return false;
        }
}

}
