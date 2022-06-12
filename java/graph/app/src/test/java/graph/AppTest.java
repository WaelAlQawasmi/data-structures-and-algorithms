/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void addNode() {
  Graph graph=new Graph();
  Vertex node=new Vertex("one");

  graph.addNode("one");
  assertEquals( graph.addNode("one"),node);
    }

    @Test void addEdge() {
        Graph graph=new Graph();

        Vertex node=new Vertex("one");
        Vertex node2=new Vertex("two");

        graph.addNode("one");
        graph.addNode("two");
            graph.addEdge(node,node2);
            assertTrue(graph.getNode(node).contains(node2));
    }

    @Test void collectionOfAllNodes() {
        Graph graph=new Graph();



        graph.addNode("one");
        graph.addNode("two");
        graph.addNode("three");
        graph.addNode("fore");
        graph.addNode("5");
        graph.addNode("6");
        Set Nodes=new HashSet<>();
        Nodes.add(new Vertex("one"));
        Nodes.add(new Vertex("two"));
        Nodes.add(new Vertex("three"));
        Nodes.add(new Vertex("fore"));
        Nodes.add(new Vertex("5"));
        Nodes.add(new Vertex("6"));
        assertEquals(graph.getNodes(),Nodes);
    }


    @Test   void appropriateNeighbors(){

        Graph graph=new Graph();

        Vertex node=new Vertex("one");
        Vertex node2=new Vertex("two");

        graph.addNode("one");
        graph.addNode("two");
        graph.addEdge(node,node2);
        assertTrue(graph.getNeighbors(node).contains(node2));
    }

    @Test   void size(){
        Graph graph=new Graph();



        graph.addNode("one");
        graph.addNode("two");
    assertEquals(graph.size(),2);
    }

    @Test   void oneNode(){
        Graph graph=new Graph();



        graph.addNode("one");

        assertEquals(graph.isEmpty(),false);
    }

    @Test   void emptyGraph(){
        Graph graph=new Graph();


        assertEquals(graph.isEmpty(),true);

        assertEquals(graph.getNodes(),null);
    }

}

