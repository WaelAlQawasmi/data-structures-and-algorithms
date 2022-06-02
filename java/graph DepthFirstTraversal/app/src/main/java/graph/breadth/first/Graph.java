package graph.breadth.first;

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


    public void addEdge(Vertex node1, Vertex node2) {

        vertices.get(node1).add(node2);
        vertices.get(node2).add(node1);

    }


    public List<Vertex> getNeighbors(Vertex node) {
        return vertices.get(node);

    }


    public ArrayList<String>  DepthFirst(Vertex node) {
        DepthFirstRecarsion(node);
        System.out.println(visited);
        return  visited;
    }


    ArrayList<String> visited = new ArrayList<String>();

    void DepthFirstRecarsion(Vertex node) {

        visited.add(node.getData());

        List<Vertex> NEBER = getNeighbors(node);

        for (Vertex V : NEBER) {
            if (!visited.contains(V.getData())) {
                DepthFirstRecarsion(V);
            }


        }
    }
}
