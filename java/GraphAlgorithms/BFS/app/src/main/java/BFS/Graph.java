package BFS;

import java.util.*;

public class Graph {
    public static void BFS(Integer src, Map<Integer,List<Integer>> adj) {
        Set<Integer> visited = new HashSet<Integer>();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(src);
        visited.add(src);
        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            // Visit here just represents whatever you want to do with the current node.
            System.out.println(currentNode);
            // Here we assume that if a neighbour has no neighbors, the adjacency map still maps to an empty list (i.e. not null)

            for (Integer neighborhood:adj.get(currentNode)) {
                // For BFS, if a neighbour is already in the queue, there's no point in adding it again.
                if(!visited.contains(neighborhood)){
                    // For BFS we mark as visited when we put a node in the queue.

                    queue.offer(neighborhood);
                    visited.add(neighborhood);

                }
                
            }
        }
    }



    public  static boolean checkBathDestination(Integer source, Integer destination,Map<Integer,List<Integer>>adj){
        List<Integer>visited=new ArrayList<Integer>();
        Queue<Integer> queue=new ArrayDeque<Integer>();
        visited.add(source);
        queue.add(source);

        while (!queue.isEmpty()){
            Integer curentNode= queue.poll();

            for (Integer nabgherhode:adj.get(curentNode)) {
                if(nabgherhode==destination){
                    return true;
                }
                if(!visited.contains(nabgherhode)){
                    visited.add(nabgherhode);
                    queue.offer(nabgherhode);
                }

            }
        }


return false;
    }

}
