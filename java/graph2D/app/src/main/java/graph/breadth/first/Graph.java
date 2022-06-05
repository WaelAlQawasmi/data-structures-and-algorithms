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
if(!vertices.get(node1).contains(node2))
{  vertices.get(node1).add(node2);
        vertices.get(node2).add(node1);}

    }


    public List<Vertex> getNeighbors(Vertex node) {
        return vertices.get(node);

    }


    public List<Vertex> breadthFirst(Vertex root) {
        List<Vertex> visited = new ArrayList<Vertex>();
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Vertex polledVertex = queue.poll();

            for (Vertex v : getNeighbors(polledVertex)) {
                if (!visited.contains((v))) {
                    queue.add(v);
                    visited.add(v);

                }
            }
        }
        return visited;
    }
}
