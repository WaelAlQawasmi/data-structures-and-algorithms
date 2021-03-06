/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph.breadth.first;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");
        graph.addNode("Monstroplolis");
        graph.addNode("Narnia");
        graph.addNode("Naboo");

        graph.addEdge(new Vertex("Pandora"), new Vertex("Arendelle"), 10);
        graph.addEdge(new Vertex("Metroville"), new Vertex("Arendelle"), 20);
        graph.addEdge(new Vertex("Monstroplolis"), new Vertex("Arendelle"), 30);
        graph.addEdge(new Vertex("Monstroplolis"), new Vertex("Metroville"), 40);
        graph.addEdge(new Vertex("Metroville"), new Vertex("Narnia"), 50);

        graph.addEdge(new Vertex("Naboo"), new Vertex("Metroville"), 60);
        graph.addEdge(new Vertex("Naboo"), new Vertex("Monstroplolis"), 70);
        graph.addEdge(new Vertex("Narnia"), new Vertex("Naboo"), 80);


        System.out.println(businessTrip(graph, new String[]{"Narnia", "Naboo"}));


    }


    public static int businessTrip(Graph graph, String[] cites) {
        int cost = 0;
        for (int i = 0; i < cites.length; i++) {

            if (graph.getNeighbors(new Vertex(cites[i])).contains(new Vertex(cites[i + 1]))) {

                for (Vertex node : graph.getNeighbors(new Vertex(cites[i]))) {

                    if (node.equals(new Vertex(cites[i + 1]))) {
                        cost += node.getEdges(new Vertex(cites[i]));
                    }

                }
            }
            else {
                return 0;
            }

            if (i + 2 == cites.length) {
                break;
            }
        }
        return cost;
    }


}
